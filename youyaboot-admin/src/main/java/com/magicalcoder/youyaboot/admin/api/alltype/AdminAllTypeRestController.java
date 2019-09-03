package com.magicalcoder.youyaboot.admin.api.alltype;

import com.magicalcoder.youyaboot.core.service.CommonRestController;
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
import com.magicalcoder.youyaboot.model.AllType;
import com.magicalcoder.youyaboot.service.alltype.service.AllTypeService;

import com.magicalcoder.youyaboot.core.utils.ListUtil;
import com.magicalcoder.youyaboot.core.utils.MapUtil;
import com.magicalcoder.youyaboot.core.utils.StringUtil;


/**
* 代码为自动生成 Created by www.magicalcoder.com
* 软件作者：何栋宇 qq:709876443
* 如果你改变了此类 read 请将此行删除
* 欢迎加入官方QQ群:648595928
*/

@RequestMapping("/admin/all_type_rest/")
@RestController
public class AdminAllTypeRestController extends CommonRestController<AllType,Long> implements InitializingBean
{

    @Resource
    private AllTypeService allTypeService;

        //分页查询
    @RequestMapping(value={"page"}, method={RequestMethod.GET})
    public ResponseMsg page(
        @RequestParam(required = false,value ="longIdFirst")                            Long longIdFirst ,
        @RequestParam int page,@RequestParam int limit,@RequestParam(required = false) String safeOrderBy
        ,HttpServletResponse response,@RequestParam(required = false) Integer queryType
    ){
        Map<String,Object> query = new HashMap();
        query.put("longIdFirst",longIdFirst);
        Integer count = allTypeService.getModelListCount(query);
        if(StringUtil.isBlank(safeOrderBy)){
            query.put("notSafeOrderBy","long_id desc");
        }else{
            query.put("safeOrderBy",safeOrderBy);
        }
        if(queryType==null || queryType == QUERY_TYPE_SEARCH){//普通查询
            limit = Math.min(limit, PageConstant.MAX_LIMIT);
            query.put("start",(page - 1) * limit);query.put("limit",limit);
            return new ResponseMsg(count,allTypeService.getModelList(query));
        }else if(queryType == QUERY_TYPE_EXPORT_EXCEL){
            query.put("start",(page - 1) * limit);query.put("limit",limit);
            exportExcel(response,allTypeService.getModelList(query),"all_type",
            new String[]{"主键","bytes_binary","bytes_blob","bytes_mediumblob","bytes_varbinary","bytes_tinyblob","bytes_longblob","boolean_bit","boolean_bool","boolean_boolean","string_enum","string_char","string_longtext","string_mediumtext","string_varchar","string_set","string_tinytext","string_text","byte_tinyint","short_smallint","integer_int","integer_mediumint","float_float","double_double","double_real","bigdecimal_decimal","bigdecimal_numeric","date_date","date_year","time_time","timestemp_datetime","timestemp_timestemp"},
            new String[]{"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""});
        }
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        super.commonService = allTypeService;
        super.primaryKey = "longId";//硬编码此实体的主键名称
    }
}
