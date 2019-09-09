package com.magicalcoder.youyaboot.service.score.service.impl;

import com.magicalcoder.youyaboot.service.score.mapper.ScoreMapper;
import com.magicalcoder.youyaboot.service.score.service.ScoreService;
import com.magicalcoder.youyaboot.model.Score;
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
public class ScoreServiceImpl extends CommonServiceImpl<Score,Long> implements ScoreService,InitializingBean{
    @Resource
    private ScoreMapper scoreMapper;

    @Override
    public void afterPropertiesSet() {
        super.commonMapper = scoreMapper;
    }

    @Override
    public List<String> getDayZhangJia(String date) {
        List<String> list=scoreMapper.getDayZhangJia(date);
        return list;
    }
}
