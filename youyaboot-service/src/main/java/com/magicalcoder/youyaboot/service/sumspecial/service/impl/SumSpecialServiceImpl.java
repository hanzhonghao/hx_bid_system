package com.magicalcoder.youyaboot.service.sumspecial.service.impl;

import com.magicalcoder.youyaboot.core.service.CommonServiceImpl;
import com.magicalcoder.youyaboot.core.utils.StringUtil;
import com.magicalcoder.youyaboot.model.SpecialSum;
import com.magicalcoder.youyaboot.service.score.mapper.ScoreMapper;
import com.magicalcoder.youyaboot.service.sumspecial.mapper.SumSpecialMapper;
import com.magicalcoder.youyaboot.service.sumspecial.service.SumSpecialService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
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
            list = sumSpecialMapper.getSpecialSumList4(query);
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
            });
        }else if("1".equals(gs)){
            list = sumSpecialMapper.getSpecialSumList1(query);
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
            });

        }else if("2".equals(gs)){
            list = sumSpecialMapper.getSpecialSumList2(query);
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
            });

        }else if("3".equals(gs)){
            list = sumSpecialMapper.getSpecialSumList3(query);
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
            });

        }


        return list;
    }

    @Override
    public Boolean setSpecialSumList(List<SpecialSum> specialSumList1, String inputTimeFirst) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(SpecialSum cs: specialSumList1){
            if (StringUtil.isBlank(inputTimeFirst)) {
                inputTimeFirst = sdf.format(new Date());
                cs.setDate(inputTimeFirst);
            } else {
                cs.setDate(inputTimeFirst);
            }
            int count = sumSpecialMapper.check(inputTimeFirst,cs.getProjectName());
            if(count>0){
                sumSpecialMapper.updateSpecialSum(cs);
            }else{
                sumSpecialMapper.setSpecialSumList(cs);
            }
        }
        return true;

    }

    @Override
    public List<SpecialSum> getSpecialSumListFromDB(Map<String, Object> query) {
        List<SpecialSum> specialSumListFromDB = sumSpecialMapper.getSpecialSumListFromDB(query);
        return specialSumListFromDB;
    }
}
