package com.magicalcoder.youyaboot.service.sum.service.impl;

import com.magicalcoder.youyaboot.model.CommonSum;
import com.magicalcoder.youyaboot.service.score.mapper.ScoreMapper;
import com.magicalcoder.youyaboot.service.sum.mapper.SumMapper;
import com.magicalcoder.youyaboot.service.sum.service.SumService;
import com.magicalcoder.youyaboot.model.Sum;
import com.magicalcoder.youyaboot.core.service.CommonServiceImpl;
import com.magicalcoder.youyaboot.core.utils.StringUtil;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.magicalcoder.youyaboot.core.utils.CopyUtil;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.Resource;
import java.util.HashMap;
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

@Service
public class SumServiceImpl extends CommonServiceImpl<Sum,Long> implements SumService,InitializingBean{
    @Resource
    private SumMapper sumMapper;

    @Resource
    private ScoreMapper scoreMapper;

    @Override
    public void afterPropertiesSet() {
        super.commonMapper = sumMapper;
    }

    @Override
    public List<CommonSum> getCommonSumList(Map<String, Object> query) {
        List<CommonSum> list= sumMapper.getCommonSumList(query);
        List<String> zhuangjiaList=scoreMapper.getDayZhangJia(query.get("date")+"");
        list.forEach((CommonSum imtp)->{
            String scoreSum = imtp.getScoreSum();
            String[] scoreSumArr=scoreSum.split(",");
            String signature = imtp.getSignature();
            String[] signatureArr=signature.split(",");

//            zhuangjiaList.forEach((String str)->{
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

        });

        return list;
    }
}
