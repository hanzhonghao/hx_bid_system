package com.magicalcoder.youyaboot.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
* 代码为自动生成 Created by www.magicalcoder.com
* 软件作者：何栋宇 qq:709876443
* 如果你改变了此类 read 请将此行删除
* 欢迎加入官方QQ群:648595928
*/
@Data
public class CommonSum implements Serializable{
    private Long id;//id
    private int numbers;
    private String tbdf;
    private String zh;
    private String projectName;
    private String scoreSum;
    private String scoreSum0="0";
    private String scoreSum1="0";
    private String scoreSum2="0";
    private String scoreSum3="0";
    private String scoreSum4="0";
    private String scoreSum5="0";
    private String pj;
    private String signature;
    private String count;
    private double basePoint;
    private double finalPoint;
    private String date;

}
