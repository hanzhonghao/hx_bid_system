package com.magicalcoder.youyaboot.service.sumspecial.service;

import com.magicalcoder.youyaboot.core.service.ICommonService;
import com.magicalcoder.youyaboot.model.CommonSum;
import com.magicalcoder.youyaboot.model.SpecialSum;
import com.magicalcoder.youyaboot.model.SumSpecial;
import java.util.List;
import java.util.Map;
import java.util.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.math.*;
/**
* 代码为自动生成 Created by www.magicalcoder.com
* 软件作者：何栋宇 qq:709876443
* 如果你改变了此类 read 请将此行删除
* 欢迎加入官方QQ群:648595928
*/

public interface SumSpecialService extends ICommonService<SpecialSum,Long>{
    List<SpecialSum> getSpecialSumList(Map<String, Object> query);

    Boolean setSpecialSumList(List<SpecialSum> specialSumList1, String inputTimeFirst);

    List<SpecialSum> getSpecialSumListFromDB(Map<String, Object> query);
}
