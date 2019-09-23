package com.magicalcoder.youyaboot.admin.api.basepricecommon;

import com.magicalcoder.youyaboot.core.service.CommonRestController;
import com.magicalcoder.youyaboot.core.utils.ExportPOIUtils;
import com.magicalcoder.youyaboot.model.CommonSum;
import com.magicalcoder.youyaboot.model.Project;
import com.magicalcoder.youyaboot.service.project.service.ProjectService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.math.*;

import com.magicalcoder.youyaboot.core.common.constant.PageConstant;
import com.magicalcoder.youyaboot.core.common.exception.BusinessException;
import com.magicalcoder.youyaboot.core.serialize.ResponseMsg;
import com.magicalcoder.youyaboot.model.BasePriceCommon;
import com.magicalcoder.youyaboot.service.basepricecommon.service.BasePriceCommonService;

import com.magicalcoder.youyaboot.core.utils.ListUtil;
import com.magicalcoder.youyaboot.core.utils.MapUtil;
import com.magicalcoder.youyaboot.core.utils.StringUtil;


/**
* 代码为自动生成 Created by www.magicalcoder.com
* 软件作者：何栋宇 qq:709876443
* 如果你改变了此类 read 请将此行删除
* 欢迎加入官方QQ群:648595928
*/

@RequestMapping("/admin/base_price_common_rest/")
@RestController
public class AdminBasePriceCommonRestController extends CommonRestController<BasePriceCommon,Long> implements InitializingBean
{

    @Resource
    private BasePriceCommonService basePriceCommonService;

    @Resource
    private ProjectService projectService;


        //分页查询
    @RequestMapping(value={"page"}, method={RequestMethod.GET})
    public ResponseMsg page(
        @RequestParam(required = false,value ="inputTimeFirst")                    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date inputTimeFirst ,
        @RequestParam(required = false,value ="projectIdFirst")                            Long projectIdFirst ,
        @RequestParam int page,@RequestParam int limit,@RequestParam(required = false) String safeOrderBy
        ,HttpServletResponse response,@RequestParam(required = false) Integer queryType
    ){
        Map<String,Object> query = new HashMap();
        query.put("inputTimeFirst",inputTimeFirst);
        query.put("projectIdFirst",projectIdFirst);
        Integer count = basePriceCommonService.getModelListCount(query);
        if(StringUtil.isBlank(safeOrderBy)){
            query.put("notSafeOrderBy","id desc");
        }else{
            query.put("safeOrderBy",safeOrderBy);
        }
        if(queryType==null || queryType == QUERY_TYPE_SEARCH){//普通查询
            limit = Math.min(limit, PageConstant.MAX_LIMIT);
            query.put("start",(page - 1) * limit);query.put("limit",limit);
            return new ResponseMsg(count,basePriceCommonService.getModelList(query));
        }else if(queryType == QUERY_TYPE_EXPORT_EXCEL){
            query.put("start",(page - 1) * limit);query.put("limit",limit);

            String fileName = "通用基价表";
            // 列名
            String columnNames[] = {"编号","参选公司","基准价(万元）","最终价格(万元）","录入时间"};
            // map中的key
            String keys[] = { "numbers","project_str", "basePoint", "finalPoint", "dates"};
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                //Excel的编号
                List<BasePriceCommon> list = basePriceCommonService.getModelList(query);
                for (int i=1;i<=list.size();i++){
                    list.get(i-1).setNumbers(i);
                    Long projectId = list.get(i - 1).getProjectId();
                    Project model = projectService.getModel(projectId);
                    list.get(i-1).setProject_str(model.getProjectName());

                    String format = sdf.format(list.get(i - 1).getInputTime());
                    list.get(i - 1).setDates(format);
                }

                ExportPOIUtils.start_download(response, fileName, list, columnNames, keys);
            } catch (IOException e) {

                e.printStackTrace();
            }

        }
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        super.commonService = basePriceCommonService;
        super.primaryKey = "id";//硬编码此实体的主键名称
    }
}
