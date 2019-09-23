package com.magicalcoder.youyaboot.service.sum.service.impl;

import com.magicalcoder.youyaboot.model.CommonSum;
import com.magicalcoder.youyaboot.service.score.mapper.ScoreMapper;
import com.magicalcoder.youyaboot.service.sum.mapper.SumMapper;
import com.magicalcoder.youyaboot.service.sum.service.SumService;
import com.magicalcoder.youyaboot.model.Sum;
import com.magicalcoder.youyaboot.core.service.CommonServiceImpl;
import com.magicalcoder.youyaboot.core.utils.StringUtil;

import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.magicalcoder.youyaboot.core.utils.CopyUtil;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
@Slf4j
public class SumServiceImpl extends CommonServiceImpl<CommonSum,Long> implements SumService,InitializingBean{
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
            String signature = imtp.getSignature();
            if (null!=scoreSum&&null!=signature) {
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





//                 for (int j=0;j<zhuangjiaList.size();j++){
//                    for (int i=0;i<signatureArr.length;i++){
//                        if (signatureArr[i].equals(zhuangjiaList.get(j))){
//                            if(j==0){
//                                imtp.setScoreSum0(scoreSumArr[i]);
//                            }
//                            if(j==1){
//                                imtp.setScoreSum1(scoreSumArr[i]);
//                                break;
//                            }else if(j==2){
//                                imtp.setScoreSum2(scoreSumArr[i]);
//                                break;
//                            }else if(j==3){
//                                imtp.setScoreSum3(scoreSumArr[i]);
//                                break;
//                            }else if(j==4){
//                                imtp.setScoreSum4(scoreSumArr[i]);
//                                break;
//                            }else if(j==5){
//                                imtp.setScoreSum5(scoreSumArr[i]);
//                                break;
//                            }
//                        }
//                    }
//
//                }
            }
        });

        return list;
    }

    @Override
    public Boolean setCommonSumList(List<CommonSum> commonSumList,String inputTimeFirst) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(CommonSum cs: commonSumList){
            if (StringUtil.isBlank(inputTimeFirst)) {
                inputTimeFirst = sdf.format(new Date());
                cs.setDate(inputTimeFirst);
            } else {
                cs.setDate(inputTimeFirst);
            }
            int count = sumMapper.check(inputTimeFirst,cs.getProjectName());
           if(count>0){
               sumMapper.updateCommonSum(cs);
           }else{
               sumMapper.setCommmonSumList(cs);
           }
        }
        return true;
    }

    @Override
    public List<CommonSum> getCommonSumListFromDB(Map<String, Object> query) {
        List<CommonSum> commonSumListFromDB = sumMapper.getCommonSumListFromDB(query);
        return commonSumListFromDB;
    }
}
