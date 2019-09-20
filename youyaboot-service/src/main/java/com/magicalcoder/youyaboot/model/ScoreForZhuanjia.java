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
public class ScoreForZhuanjia implements Serializable{

    private Long id;//id
    private Long projectId;//project_id
    private Integer categoryId;//category_id
    private Integer techRequire;//tech_require
    private Integer afterSale;//after_sale
    private Integer apply;//apply
    private Integer geneSitu;//gene_situ
    private Integer standard;//standard
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date date;//date
    private String signature;//signature

    
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public Long getProjectId(){
        return projectId;
    }
    public void setProjectId(Long projectId){
        this.projectId = projectId;
    }

    public Integer getCategoryId(){
        return categoryId;
    }
    public void setCategoryId(Integer categoryId){
        this.categoryId = categoryId;
    }

    public Integer getTechRequire(){
        return techRequire;
    }
    public void setTechRequire(Integer techRequire){
        this.techRequire = techRequire;
    }

    public Integer getAfterSale(){
        return afterSale;
    }
    public void setAfterSale(Integer afterSale){
        this.afterSale = afterSale;
    }

    public Integer getApply(){
        return apply;
    }
    public void setApply(Integer apply){
        this.apply = apply;
    }

    public Integer getGeneSitu(){
        return geneSitu;
    }
    public void setGeneSitu(Integer geneSitu){
        this.geneSitu = geneSitu;
    }

    public Integer getStandard(){
        return standard;
    }
    public void setStandard(Integer standard){
        this.standard = standard;
    }

    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date = date;
    }

    public String getSignature(){
        return signature;
    }
    public void setSignature(String signature){
        this.signature = signature;
    }
}