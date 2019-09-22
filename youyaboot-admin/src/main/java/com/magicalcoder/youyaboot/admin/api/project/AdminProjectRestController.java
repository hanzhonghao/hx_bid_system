package com.magicalcoder.youyaboot.admin.api.project;

import com.magicalcoder.youyaboot.core.service.CommonRestController;
import com.magicalcoder.youyaboot.core.utils.*;
import com.magicalcoder.youyaboot.model.CommonSum;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.math.*;

import com.magicalcoder.youyaboot.core.common.constant.PageConstant;
import com.magicalcoder.youyaboot.core.common.exception.BusinessException;
import com.magicalcoder.youyaboot.core.serialize.ResponseMsg;
import com.magicalcoder.youyaboot.model.Project;
import com.magicalcoder.youyaboot.service.project.service.ProjectService;


/**
* 代码为自动生成 Created by www.magicalcoder.com
* 软件作者：何栋宇 qq:709876443
* 如果你改变了此类 read 请将此行删除
* 欢迎加入官方QQ群:648595928
*/

@RequestMapping("/admin/project_rest/")
@RestController
public class AdminProjectRestController extends CommonRestController<Project,Long> implements InitializingBean
{

    @Resource
    private ProjectService projectService;

        //外键下拉查询接口
    @RequestMapping(value = "search")
    public ResponseMsg search(
        @RequestParam(required = false) String uniqueField,
        @RequestParam(required = false,value = "uniqueValue[]") Set<Long> uniqueValue,//主键多个值
        @RequestParam(required = false,defaultValue = "20") Integer limit,
        @RequestParam(required = false) String keyword
    ){
        limit = Math.min(PageConstant.MAX_LIMIT,limit);
        List<Project> list = null;
        Map<String,Object> query = new HashMap();
        query.put("limit",limit);
        query.put("notSafeOrderBy","id asc,price asc");
        if(uniqueValue!=null){//说明是来初始化的
            list = projectService.getModelInList(uniqueValue);
        }else {//正常搜索
            if(ListUtil.isBlank(list)){
                query.put("projectNameFirst",keyword);
                list = projectService.getModelList(query);
                query.remove("projectNameFirst");
            }
        }
        return new ResponseMsg(list);
    }
    //分页查询
    @RequestMapping(value={"page"}, method={RequestMethod.GET})
    public ResponseMsg page(
        @RequestParam(required = false,value ="projectNameFirst")                            String projectNameFirst ,
        @RequestParam int page,@RequestParam int limit,@RequestParam(required = false) String safeOrderBy
        ,HttpServletResponse response,@RequestParam(required = false) Integer queryType
    ){
        Map<String,Object> query = new HashMap();
        query.put("projectNameFirst",coverBlankToNull(projectNameFirst));
        Integer count = projectService.getModelListCount(query);
        if(StringUtil.isBlank(safeOrderBy)){
            query.put("notSafeOrderBy","id asc,price asc");
        }else{
            query.put("safeOrderBy",safeOrderBy);
        }
        if(queryType==null || queryType == QUERY_TYPE_SEARCH){//普通查询
            limit = Math.min(limit, PageConstant.MAX_LIMIT);
            query.put("start",(page - 1) * limit);query.put("limit",limit);
            return new ResponseMsg(count,projectService.getModelList(query));
        }else if(queryType == QUERY_TYPE_EXPORT_EXCEL){
            query.put("start",(page - 1) * limit);query.put("limit",limit);
            String fileName = "竞标信息录入表";
            // 列名
            String columnNames[] = {"编号","参选公司","型号","产地及品牌","报价","最终报价","备注","时间","地点","记录人","复核人","经办人","内容"};
            // map中的key
            String keys[] = { "numbers","projectName", "type", "origin", "price", "fprice", "comment","date","location","recoder","reviewer","responer","bargain"};
            try {
                List<Project> projectList = projectService.getModelList(query);
                for (int i=1;i<=projectList.size();i++){
                    projectList.get(i-1).setNumbers(i);
                }

                ExportPOIUtils.start_download(response, fileName, projectList, columnNames, keys);
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        super.commonService = projectService;
        super.primaryKey = "id";//硬编码此实体的主键名称
    }

    //分页随机查询
    @RequestMapping(value = {"random/page"}, method = {RequestMethod.GET})
    public ResponseMsg random(
        @RequestParam int page, @RequestParam int limit, @RequestParam(required = false) String safeOrderBy
        , HttpServletResponse response, @RequestParam(required = false) Integer queryType
    ) {
        Map<String, Object> query = new HashMap();
        String time= DateFormatUtil.getDateTimeStr();
        Integer count = projectService.getModelRandomList(time).size();
        if (StringUtil.isBlank(safeOrderBy)) {
            query.put("notSafeOrderBy", "id asc");
        } else {
            query.put("safeOrderBy", safeOrderBy);
        }
        if (queryType == null || queryType == QUERY_TYPE_SEARCH) {//普通查询
            limit = Math.min(limit, PageConstant.MAX_LIMIT);
            query.put("start", (page - 1) * limit);
            query.put("limit", limit);
            List<Project> modelList = projectService.getModelRandomList(time);
            Collections.shuffle(modelList);
            return new ResponseMsg(count, modelList);
        }
        return null;
    }
}
