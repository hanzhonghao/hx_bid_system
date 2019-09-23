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
public class History implements Serializable{

    private Long id;//id
    private Long bidProject;//bid_project
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    @JsonFormat(pattern = "yyyy-MM-dd HH", timezone="GMT+8")
    private Date bidTime;//bid_time
    private String projectName;//project_name
    private String purchaserName;//purchaser_name
    private int numbers;
    private String project_str;
    private String dates;


    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public Long getBidProject(){
        return bidProject;
    }
    public void setBidProject(Long bidProject){
        this.bidProject = bidProject;
    }

    public Date getBidTime(){
        return bidTime;
    }
    public void setBidTime(Date bidTime){
        this.bidTime = bidTime;
    }

    public String getProjectName(){
        return projectName;
    }
    public void setProjectName(String projectName){
        this.projectName = projectName;
    }

    public String getPurchaserName(){
        return purchaserName;
    }
    public void setPurchaserName(String purchaserName){
        this.purchaserName = purchaserName;
    }
}
