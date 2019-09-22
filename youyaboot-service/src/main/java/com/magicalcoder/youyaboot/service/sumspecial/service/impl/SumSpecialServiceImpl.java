package com.magicalcoder.youyaboot.service.sumspecial.service.impl;

import com.magicalcoder.youyaboot.model.CommonSum;
import com.magicalcoder.youyaboot.model.SpecialSum;
import com.magicalcoder.youyaboot.service.score.mapper.ScoreMapper;
import com.magicalcoder.youyaboot.service.sumspecial.mapper.SumSpecialMapper;
import com.magicalcoder.youyaboot.service.sumspecial.service.SumSpecialService;
import com.magicalcoder.youyaboot.model.SumSpecial;
import com.magicalcoder.youyaboot.core.service.CommonServiceImpl;
import com.magicalcoder.youyaboot.core.utils.StringUtil;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.magicalcoder.youyaboot.core.utils.CopyUtil;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.Resource;
import java.util.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.math.*;
/**
* 代码为自动生成 Created by www.magicalcoder.com
* 软件作者：何栋宇 qq:709876443
* 如果你改变了此类 read 请将此行删除
* 欢迎加入官方QQ群:648595928
*/

@Service
public class SumSpecialServiceImpl extends CommonServiceImpl<SpecialSum,Long> implements SumSpecialService,InitializingBean{
    @Resource
    private SumSpecialMapper sumSpecialMapper;
    @Resource
    private ScoreMapper scoreMapper;

    @Override
    public void afterPropertiesSet() {
        super.commonMapper = sumSpecialMapper;
    }

    @Override
    public List<SpecialSum> getSpecialSumList(Map<String, Object> query) {
        String gs =query.get("gs")+"";
        List<SpecialSum> list =new ArrayList<>();
        if("4".equals(gs)){
            list = sumSpecialMapper.getSpecialSumList(query);
            List<String> zhuanjiaList=scoreMapper.getDayZhangJia(query.get("date")+"");
            list.forEach((SpecialSum imtp)->{
                String scoreSum = imtp.getScoreSum();
                String signature = imtp.getSignature();
                if (null!=scoreSum&&null!=signature){
                    String[] scoreSumArr=scoreSum.split(",");
                    String[] signatureArr=signature.split(",");
                    for (int i=0;i<scoreSumArr.length;i++) {
                        if (i == 0) {
                            imtp.setScoreSum1(scoreSumArr[i]);
                            System.out.println(scoreSumArr[i]);
                        }else if (i == 1) {
                            imtp.setScoreSum2(scoreSumArr[i]);
                        }else if (i == 2) {
                            imtp.setScoreSum3(scoreSumArr[i]);
                        }else if (i == 3) {
                            imtp.setScoreSum4(scoreSumArr[i]);
                        }else if (i == 4) {
                            imtp.setScoreSum5(scoreSumArr[i]);
                        }
                    }

                }

//            zhuanjiaList.forEach((String str)->{
//                for (int i=0;i<signatureArr.length;i++){

//                    if (signatureArr[i].equals(str)){
//                        if(i==1){
//                            imtp.setScoreSum1(scoreSumArr[i]);
//                        }else if(i==2){
//                            imtp.setScoreSum2(scoreSumArr[i]);
//                        }else if(i==3){
//                            imtp.setScoreSum3(scoreSumArr[i]);
//                        }
//                    }
//                }
//
//            });

            });
        }else if("1".equals(gs)){

        }else if("2".equals(gs)){

        }else if("3".equals(gs)){

        }


        return list;
    }
}
