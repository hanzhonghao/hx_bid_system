package com.magicalcoder.youyaboot.admin.api.history;

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
import com.magicalcoder.youyaboot.model.History;
import com.magicalcoder.youyaboot.service.history.service.HistoryService;

import com.magicalcoder.youyaboot.core.utils.ListUtil;
import com.magicalcoder.youyaboot.core.utils.MapUtil;
import com.magicalcoder.youyaboot.core.utils.StringUtil;


/**
* 代码为自动生成 Created by www.magicalcoder.com
* 软件作者：何栋宇 qq:709876443
* 如果你改变了此类 read 请将此行删除
* 欢迎加入官方QQ群:648595928
*/

@RequestMapping("/admin/history_rest/")
@RestController
public class AdminHistoryRestController extends CommonRestController<History,Long> implements InitializingBean
{

    @Resource
    private HistoryService historyService;

        //分页查询
    @RequestMapping(value={"page"}, method={RequestMethod.GET})
    public ResponseMsg page(
        @RequestParam(required = false,value ="bidProjectFirst")                            String bidProjectFirst ,
        @RequestParam(required = false,value ="bidTimeFirst")                    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date bidTimeFirst ,
        @RequestParam(required = false,value ="bidTimeSecond")                    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date bidTimeSecond ,
        @RequestParam(required = false,value ="projectNameFirst")                            String projectNameFirst ,
        @RequestParam(required = false,value ="purchaserNameFirst")                            String purchaserNameFirst ,
        @RequestParam int page,@RequestParam int limit,@RequestParam(required = false) String safeOrderBy
        ,HttpServletResponse response,@RequestParam(required = false) Integer queryType
    ){
        Map<String,Object> query = new HashMap();
        query.put("bidProjectFirst",coverBlankToNull(bidProjectFirst));
        query.put("bidTimeFirst",bidTimeFirst);
        query.put("bidTimeSecond",bidTimeSecond);
        query.put("projectNameFirst",coverBlankToNull(projectNameFirst));
        query.put("purchaserNameFirst",coverBlankToNull(purchaserNameFirst));
        Integer count = historyService.getModelListCount(query);
        if(StringUtil.isBlank(safeOrderBy)){
            query.put("notSafeOrderBy","id asc");
        }else{
            query.put("safeOrderBy",safeOrderBy);
        }
        if(queryType==null || queryType == QUERY_TYPE_SEARCH){//普通查询
            limit = Math.min(limit, PageConstant.MAX_LIMIT);
            query.put("start",(page - 1) * limit);query.put("limit",limit);
            return new ResponseMsg(count,historyService.getModelList(query));
        }else if(queryType == QUERY_TYPE_EXPORT_EXCEL){
            query.put("start",(page - 1) * limit);query.put("limit",limit);
            exportExcel(response,historyService.getModelList(query),"history",
            new String[]{"编号","中标供应商名称","中标时间","项目名称","采购员姓名"},
            new String[]{"","","","",""});
        }
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        super.commonService = historyService;
        super.primaryKey = "id";//硬编码此实体的主键名称
    }
}
