package com.magicalcoder.youyaboot.model;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
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
public class ScoreFuwu implements Serializable{

    private Long id;//id
    private Integer afterSale;//after_sale
    private Integer apply;//apply
    private String companyName;//company_name
    private Integer geneSitu;//gene_situ
    private Integer standard;//standard
    private Integer techRequire;//tech_require
    private String signature;//signature

    
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
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

    public String getCompanyName(){
        return companyName;
    }
    public void setCompanyName(String companyName){
        this.companyName = companyName;
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

    public Integer getTechRequire(){
        return techRequire;
    }
    public void setTechRequire(Integer techRequire){
        this.techRequire = techRequire;
    }

    public String getSignature(){
        return signature;
    }
    public void setSignature(String signature){
        this.signature = signature;
    }
}
