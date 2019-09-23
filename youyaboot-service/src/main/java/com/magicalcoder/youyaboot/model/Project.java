package com.magicalcoder.youyaboot.model;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.math.*;
import java.io.Serializable;
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
    private Integer fprice;//fprice
    private String location;//location
    private String origin;//origin
    private Integer price;//price
    private String projectName;//project_name
    private String recoder;//recoder
    private String responer;//responer
    private String reviewer;//reviewer
    private String type;//type
    private int numbers;
    private String dates;


    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getBargain(){
        return bargain;
    }
    public void setBargain(String bargain){
        this.bargain = bargain;
    }

    public String getComment(){
        return comment;
    }
    public void setComment(String comment){
        this.comment = comment;
    }

    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date = date;
    }

    public Integer getFprice(){
        return fprice;
    }
    public void setFprice(Integer fprice){
        this.fprice = fprice;
    }

    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }

    public String getOrigin(){
        return origin;
    }
    public void setOrigin(String origin){
        this.origin = origin;
    }

    public Integer getPrice(){
        return price;
    }
    public void setPrice(Integer price){
        this.price = price;
    }

    public String getProjectName(){
        return projectName;
    }
    public void setProjectName(String projectName){
        this.projectName = projectName;
    }

    public String getRecoder(){
        return recoder;
    }
    public void setRecoder(String recoder){
        this.recoder = recoder;
    }

    public String getResponer(){
        return responer;
    }
    public void setResponer(String responer){
        this.responer = responer;
    }

    public String getReviewer(){
        return reviewer;
    }
    public void setReviewer(String reviewer){
        this.reviewer = reviewer;
    }

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
}
