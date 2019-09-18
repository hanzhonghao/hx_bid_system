package com.magicalcoder.youyaboot.admin.api.sum;

import com.magicalcoder.youyaboot.core.service.CommonRestController;
import com.magicalcoder.youyaboot.core.utils.DateFormatUtil;
import com.magicalcoder.youyaboot.model.CommonSum;
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
import com.magicalcoder.youyaboot.model.Sum;
import com.magicalcoder.youyaboot.service.sum.service.SumService;

import com.magicalcoder.youyaboot.core.utils.ListUtil;
import com.magicalcoder.youyaboot.core.utils.MapUtil;
import com.magicalcoder.youyaboot.core.utils.StringUtil;


/**
* 代码为自动生成 Created by www.magicalcoder.com
* 软件作者：何栋宇 qq:709876443
* 如果你改变了此类 read 请将此行删除
* 欢迎加入官方QQ群:648595928
*/

@RequestMapping("/admin/sum_rest/")
@RestController
    public class AdminSumRestController extends CommonRestController<CommonSum,Long> implements InitializingBean
{

    @Resource
    private SumService sumService;

        //分页查询
    @RequestMapping(value={"page"}, method={RequestMethod.GET})
    public ResponseMsg page(
        @RequestParam(required = false,value ="inputTimeFirst")String inputTimeFirst ,
        @RequestParam int page,@RequestParam int limit,@RequestParam(required = false) String safeOrderBy
        ,HttpServletResponse response,@RequestParam(required = false) Integer queryType
    ){
        Map<String,Object> query = new HashMap();
        if(StringUtils.isBlank(inputTimeFirst)){
            query.put("date", DateFormatUtil.getDateTimeStr());
        }else{
            query.put("date", inputTimeFirst);
        }
     //  query.put("date", "2019-09-01");
        //query.put("inputTimeFirst",inputTimeFirst);
        Integer count = sumService.getCommonSumList(query).size();
        if(StringUtil.isBlank(safeOrderBy)){
            query.put("notSafeOrderBy","id desc");
        }else{
            query.put("safeOrderBy",safeOrderBy);
        }
        if(queryType==null || queryType == QUERY_TYPE_SEARCH){//普通查询
            limit = Math.min(limit, PageConstant.MAX_LIMIT);
            query.put("start",(page - 1) * limit);query.put("limit",limit);
            return new ResponseMsg(count,sumService.getCommonSumList(query));
        }else if(queryType == QUERY_TYPE_EXPORT_EXCEL){
            query.put("start",(page - 1) * limit);query.put("limit",limit);
            exportExcel(response,sumService.getCommonSumList(query),"sum",
            new String[]{"id","基准价","参选公司","最终价","时间","排名","综合评价得分","综合得分","投标报价","专家"},
            new String[]{"","","","","","","","","",""});
        }
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        super.commonService = sumService;
        super.primaryKey = "id";//硬编码此实体的主键名称
    }
}
