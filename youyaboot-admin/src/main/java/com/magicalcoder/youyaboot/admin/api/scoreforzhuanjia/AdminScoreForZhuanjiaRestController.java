package com.magicalcoder.youyaboot.admin.api.scoreforzhuanjia;

import com.magicalcoder.youyaboot.admin.rmp.dto.SysAdminUserDto;
import com.magicalcoder.youyaboot.admin.rmp.util.AdminUtil;
import com.magicalcoder.youyaboot.core.service.CommonRestController;
import com.magicalcoder.youyaboot.core.utils.DateFormatUtil;
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
import com.magicalcoder.youyaboot.model.ScoreForZhuanjia;
import com.magicalcoder.youyaboot.service.scoreforzhuanjia.service.ScoreForZhuanjiaService;

import com.magicalcoder.youyaboot.core.utils.ListUtil;
import com.magicalcoder.youyaboot.core.utils.MapUtil;
import com.magicalcoder.youyaboot.core.utils.StringUtil;


/**
* 代码为自动生成 Created by www.magicalcoder.com
* 软件作者：何栋宇 qq:709876443
* 如果你改变了此类 read 请将此行删除
* 欢迎加入官方QQ群:648595928
*/

@RequestMapping("/admin/score_for_zhuanjia_rest/")
@RestController
public class AdminScoreForZhuanjiaRestController extends CommonRestController<ScoreForZhuanjia,Long> implements InitializingBean
{

    @Resource
    private ScoreForZhuanjiaService scoreForZhuanjiaService;

        //分页查询
    @RequestMapping(value={"page"}, method={RequestMethod.GET})
    public ResponseMsg page(
        @RequestParam(required = false,value ="projectIdFirst")                            Long projectIdFirst ,
        @RequestParam(required = false,value ="categoryIdFirst")                            Integer categoryIdFirst ,
        @RequestParam int page,@RequestParam int limit,@RequestParam(required = false) String safeOrderBy
        ,HttpServletResponse response,@RequestParam(required = false) Integer queryType
    ){
        Map<String,Object> query = new HashMap();
        query.put("projectIdFirst",projectIdFirst);
        query.put("categoryIdFirst",categoryIdFirst);
        Integer count = scoreForZhuanjiaService.getModelListCount(query);
        if(StringUtil.isBlank(safeOrderBy)){
            query.put("notSafeOrderBy","id desc");
        }else{
            query.put("safeOrderBy",safeOrderBy);
        }
        if(queryType==null || queryType == QUERY_TYPE_SEARCH){//普通查询
            limit = Math.min(limit, PageConstant.MAX_LIMIT);
            query.put("start",(page - 1) * limit);query.put("limit",limit);
            SysAdminUserDto admin = AdminUtil.getAdmin();
            String realName = admin.getRealName();
            String time= DateFormatUtil.getDateTimeStr();
            query.put("name",realName);
            query.put("date",time);
            return new ResponseMsg(count,scoreForZhuanjiaService.getSelfModelList(query));
        }else if(queryType == QUERY_TYPE_EXPORT_EXCEL){
            query.put("start",(page - 1) * limit);query.put("limit",limit);
            exportExcel(response,scoreForZhuanjiaService.getModelList(query),"score_for_zhuanjia",
            new String[]{"编号","参选公司","打分表分类","商务技术要求响应情况","售后服务方案情况","投标文件供应商业绩","制造厂商综合情况","投标文件规范性","打分日期","打分人"},
            new String[]{"","","","","","","","","",""});
        }
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        super.commonService = scoreForZhuanjiaService;
        super.primaryKey = "id";//硬编码此实体的主键名称
    }
}
