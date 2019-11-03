package com.magicalcoder.youyaboot.model;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.math.*;
import java.io.Serializable;
import java.util.List;

import lombok.Data;
/**
* 代码为自动生成 Created by www.magicalcoder.com
* 软件作者：何栋宇 qq:709876443
* 如果你改变了此类 read 请将此行删除
* 欢迎加入官方QQ群:648595928
*/
@Data
public class Project implements Serializable{

    private Long id;//id
    private String bargain;//bargain
    private String comment;//comment
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    @JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
    private Date date;//date
    private double fprice;//fprice
    private String location;//location
    private String origin;//origin
    private double price;//price
    private String projectName;//project_name
    private String recoder;//recoder
    private String responer;//responer
    private String reviewer;//reviewer
    private String type;//type
    private int numbers;
    private String dates;
    private String dateForPrint;
    private List<Project> projectList;
   private String xiangmu;//xiangmu

}
