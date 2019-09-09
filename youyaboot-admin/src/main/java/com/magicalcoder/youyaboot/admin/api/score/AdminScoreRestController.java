package com.magicalcoder.youyaboot.admin.api.score;

import com.magicalcoder.youyaboot.core.service.CommonRestController;
import com.magicalcoder.youyaboot.core.utils.DateFormatUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.math.*;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import com.magicalcoder.youyaboot.core.common.constant.PageConstant;
import com.magicalcoder.youyaboot.core.common.exception.BusinessException;
import com.magicalcoder.youyaboot.core.serialize.ResponseMsg;
import com.magicalcoder.youyaboot.model.Score;
import com.magicalcoder.youyaboot.service.score.service.ScoreService;

import com.magicalcoder.youyaboot.core.utils.ListUtil;
import com.magicalcoder.youyaboot.core.utils.MapUtil;
import com.magicalcoder.youyaboot.core.utils.StringUtil;


/**
* 代码为自动生成 Created by www.magicalcoder.com
* 软件作者：何栋宇 qq:709876443
* 如果你改变了此类 read 请将此行删除
* 欢迎加入官方QQ群:648595928
*/

@RequestMapping("/admin/score_rest/")
@RestController
public class AdminScoreRestController extends CommonRestController<Score,Long> implements InitializingBean
{

    @Resource
    private ScoreService scoreService;

        //分页查询
    @RequestMapping(value={"page"}, method={RequestMethod.GET})
    public ResponseMsg page(
        @RequestParam(required = false,value ="companyNameFirst")                            String companyNameFirst ,
        @RequestParam(required = false,value ="categoryIdFirst")                            Integer categoryIdFirst ,
        @RequestParam(required = false,value ="dateFirst")                    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date dateFirst ,
        @RequestParam int page,@RequestParam int limit,@RequestParam(required = false) String safeOrderBy
        ,HttpServletResponse response,@RequestParam(required = false) Integer queryType
    ){
        Map<String,Object> query = new HashMap();
        query.put("companyNameFirst",coverBlankToNull(companyNameFirst));
        query.put("categoryIdFirst",categoryIdFirst);
        query.put("dateFirst",dateFirst);
        Integer count = scoreService.getModelListCount(query);
        query.put("safeOrderBy",safeOrderBy);
        if(queryType==null || queryType == QUERY_TYPE_SEARCH){//普通查询
            limit = Math.min(limit, PageConstant.MAX_LIMIT);
            query.put("start",(page - 1) * limit);query.put("limit",limit);
            return new ResponseMsg(count,scoreService.getModelList(query));
        }else if(queryType == QUERY_TYPE_EXPORT_EXCEL){
            query.put("start",(page - 1) * limit);query.put("limit",limit);
            exportExcel(response,scoreService.getModelList(query),"score",
            new String[]{"编号","售后服务方案情况","投标文件供应商业绩","参选公司","制造厂商综合情况","投标文件规范性","商务技术要求响应情况","专家签名","打分表分类","日期"},
            new String[]{"","","","","","","","","[{\\\"key\\\":1,\\\"value\\\":\\\"设备仪器\\\"},{\\\"key\\\":2,\\\"value\\\":\\\"服务打分\\\"},{\\\"key\\\":3,\\\"value\\\":\\\"试剂打分\\\"},{\\\"key\\\":5,\\\"value\\\":\\\"软件打分\\\"},{\\\"key\\\":6,\\\"value\\\":\\\"仪器设备+配套耗材试剂\\\"}]",""});
        }
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        super.commonService = scoreService;
        super.primaryKey = "id";//硬编码此实体的主键名称
    }

    //查询当天专家
    @RequestMapping(value={"getDayZhangJia"}, method={RequestMethod.POST})
    public ResponseMsg getDayZhangJia(String date){
        if(StringUtils.isBlank(date)){
            date=DateFormatUtil.getDateTimeStr();
        }
        List<String> zhangJiaList=scoreService.getDayZhangJia(date);
    return new ResponseMsg(zhangJiaList);
}

}
