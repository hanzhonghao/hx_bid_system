package com.magicalcoder.youyaboot.admin.api.sumspecial;

import com.magicalcoder.youyaboot.core.service.CommonRestController;
import com.magicalcoder.youyaboot.core.utils.*;
import com.magicalcoder.youyaboot.model.CommonSum;
import com.magicalcoder.youyaboot.model.SpecialSum;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
import com.magicalcoder.youyaboot.model.SumSpecial;
import com.magicalcoder.youyaboot.service.sumspecial.service.SumSpecialService;


/**
* 代码为自动生成 Created by www.magicalcoder.com
* 软件作者：何栋宇 qq:709876443
* 如果你改变了此类 read 请将此行删除
* 欢迎加入官方QQ群:648595928
*/

@RequestMapping("/admin/sum_special_rest/")
@RestController
public class AdminSumSpecialRestController extends CommonRestController<SpecialSum,Long> implements InitializingBean
{

    @Resource
    private SumSpecialService sumSpecialService;

    //分页查询
    @RequestMapping(value={"page"}, method={RequestMethod.GET})
    public ResponseMsg page(
        @RequestParam(required = false,value ="inputTimeFirst")String inputTimeFirst ,
        @RequestParam(required = false,value ="gs")String gs ,
        @RequestParam int page,@RequestParam int limit,@RequestParam(required = false) String safeOrderBy
        ,HttpServletResponse response,@RequestParam(required = false) Integer queryType
    ){
        Map<String,Object> query = new HashMap();
        if(StringUtils.isBlank(inputTimeFirst)){
            query.put("date", DateFormatUtil.getDateTimeStr());
        }else{
            query.put("date", inputTimeFirst);
        }

        if(StringUtils.isBlank(gs)){
            gs="1";
        }
        query.put("gs",gs);
        //  query.put("date", "2019-09-01");
        //query.put("inputTimeFirst",inputTimeFirst);
        List<SpecialSum> specialSumList1 = sumSpecialService.getSpecialSumList(query);
        Integer count = specialSumList1.size();
        Boolean result = sumSpecialService.setSpecialSumList(specialSumList1,inputTimeFirst);

        if(StringUtil.isBlank(safeOrderBy)){
            query.put("notSafeOrderBy","id desc");
        }else{
            query.put("safeOrderBy",safeOrderBy);
        }
        if(queryType==null || queryType == QUERY_TYPE_SEARCH){//普通查询
            limit = Math.min(limit, PageConstant.MAX_LIMIT);
            query.put("start",(page - 1) * limit);query.put("limit",limit);
            return new ResponseMsg(count,sumSpecialService.getSpecialSumListFromDB(query));
        }else if(queryType == QUERY_TYPE_EXPORT_EXCEL){
            query.put("start",(page - 1) * limit);query.put("limit",limit);

            String fileName = "设备仪器评分汇总表";
            // 列名
            String columnNames[] = {"编号","参选公司","综合评价得分","设备基准价","设备最终价","投标报价","综合得分","专家","专家评分","排名"};
            // map中的key
            String keys[] = { "numbers", "projectName","pj", "eBasePoint", "eFinalPoint", "tbdf", "zh","signature","scoreSum","numbers"};
            try {
                List<SpecialSum> specialSumList = sumSpecialService.getSpecialSumList(query);
                for (int i=1;i<=specialSumList.size();i++){
                    specialSumList.get(i-1).setNumbers(i);
                }

                ExportPOIUtils.start_download(response, fileName, specialSumList, columnNames, keys);
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        super.commonService = sumSpecialService;
        super.primaryKey = "id";//硬编码此实体的主键名称
    }
}
