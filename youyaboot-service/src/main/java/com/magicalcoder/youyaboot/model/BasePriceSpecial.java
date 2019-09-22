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
public class BasePriceSpecial implements Serializable{

    private Long id;//id
    private Long projectId;//project_id
    private Integer ebasePoint;//e_base_point
    private Integer efinalPoint;//e_final_point
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    @JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
    private Date inputTime;//input_time
    private Integer sbasePoint;//s_base_point
    private Integer sfinalPoint;//s_final_point
    private Integer numbers;
    private String project_str;



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

    public Integer getEbasePoint(){
        return ebasePoint;
    }
    public void setEbasePoint(Integer ebasePoint){
        this.ebasePoint = ebasePoint;
    }

    public Integer getEfinalPoint(){
        return efinalPoint;
    }
    public void setEfinalPoint(Integer efinalPoint){
        this.efinalPoint = efinalPoint;
    }

    public Date getInputTime(){
        return inputTime;
    }
    public void setInputTime(Date inputTime){
        this.inputTime = inputTime;
    }

    public Integer getSbasePoint(){
        return sbasePoint;
    }
    public void setSbasePoint(Integer sbasePoint){
        this.sbasePoint = sbasePoint;
    }

    public Integer getSfinalPoint(){
        return sfinalPoint;
    }
    public void setSfinalPoint(Integer sfinalPoint){
        this.sfinalPoint = sfinalPoint;
    }
}
