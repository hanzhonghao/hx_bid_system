package com.magicalcoder.youyaboot.admin.api.project;

import com.magicalcoder.youyaboot.core.service.CommonRestController;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.math.*;

import com.magicalcoder.youyaboot.core.common.constant.PageConstant;
import com.magicalcoder.youyaboot.core.common.exception.BusinessException;
import com.magicalcoder.youyaboot.core.serialize.ResponseMsg;
import com.magicalcoder.youyaboot.model.Project;
import com.magicalcoder.youyaboot.service.project.service.ProjectService;

import com.magicalcoder.youyaboot.core.utils.ListUtil;
import com.magicalcoder.youyaboot.core.utils.MapUtil;
import com.magicalcoder.youyaboot.core.utils.StringUtil;


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

        //分页查询
    @RequestMapping(value={"page"}, method={RequestMethod.GET})
    public ResponseMsg page(
        @RequestParam(required = false,value ="idFirst")                            Long idFirst ,
        @RequestParam(required = false,value ="projectNameFirst")                            String projectNameFirst ,
        @RequestParam int page,@RequestParam int limit,@RequestParam(required = false) String safeOrderBy
        ,HttpServletResponse response,@RequestParam(required = false) Integer queryType
    ){
        Map<String,Object> query = new HashMap();
        query.put("idFirst",idFirst);
        query.put("projectNameFirst",coverBlankToNull(projectNameFirst));
        Integer count = projectService.getModelListCount(query);
        if(StringUtil.isBlank(safeOrderBy)){
            query.put("notSafeOrderBy","id desc");
        }else{
            query.put("safeOrderBy",safeOrderBy);
        }
        if(queryType==null || queryType == QUERY_TYPE_SEARCH){//普通查询
            limit = Math.min(limit, PageConstant.MAX_LIMIT);
            query.put("start",(page - 1) * limit);query.put("limit",limit);
            return new ResponseMsg(count,projectService.getModelList(query));
        }else if(queryType == QUERY_TYPE_EXPORT_EXCEL){
            query.put("start",(page - 1) * limit);query.put("limit",limit);
            exportExcel(response,projectService.getModelList(query),"project",
            new String[]{"编号","内容","备注","时间","最终报价","地点","产地及品牌","报价","参选公司","记录人","经办人","复核人","型号"},
            new String[]{"","","","","","","","","","","","",""});
        }
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        super.commonService = projectService;
        super.primaryKey = "id";//硬编码此实体的主键名称
    }

    /**
     * 获取随机抽取供应商的的页面
     */
    @RequestMapping(path = "/random", method={RequestMethod.GET})
    public ResponseMsg random() {
        Map<String,Object> query = new HashMap();
        query.put("start",0);query.put("limit",20);
        List<Project> allprojects = projectService.getModelList(query);
        Collections.shuffle(allprojects);
        Integer count = projectService.getModelListCount(query);
        return new ResponseMsg(count,projectService.getModelList(query));
    }
}
