package com.magicalcoder.youyaboot.service.sumspecial.mapper;

import com.magicalcoder.youyaboot.core.service.ICommonMapper;
import com.magicalcoder.youyaboot.model.CommonSum;
import com.magicalcoder.youyaboot.model.SpecialSum;
import com.magicalcoder.youyaboot.model.SumSpecial;
import org.apache.ibatis.annotations.Param;

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

public interface SumSpecialMapper extends ICommonMapper<SpecialSum,Long>{
    List<SpecialSum>  getSpecialSumList1(Map query);
    List<SpecialSum>  getSpecialSumList2(Map query);
    List<SpecialSum>  getSpecialSumList3(Map query);
    List<SpecialSum>  getSpecialSumList4(Map query);

    int check(@Param("inputTimeFirst") String inputTimeFirst, @Param("projectName") String projectName);

    void updateSpecialSum(SpecialSum cs);

    List<SpecialSum> getSpecialSumListFromDB(Map<String, Object> query);
    Boolean setSpecialSumList(SpecialSum SpecialSumList);
}
