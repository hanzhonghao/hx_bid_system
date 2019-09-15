package com.magicalcoder.youyaboot.model;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
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
    private Integer eBasePoint;//e_base_point
    private Integer eFinalPoint;//e_final_point
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date inputTime;//input_time
    private Integer sBasePoint;//s_base_point
    private Integer sFinalPoint;//s_final_point


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

    public Integer getEBasePoint(){
        return eBasePoint;
    }
    public void setEBasePoint(Integer eBasePoint){
        this.eBasePoint = eBasePoint;
    }

    public Integer getEFinalPoint(){
        return eFinalPoint;
    }
    public void setEFinalPoint(Integer eFinalPoint){
        this.eFinalPoint = eFinalPoint;
    }

    public Date getInputTime(){
        return inputTime;
    }
    public void setInputTime(Date inputTime){
        this.inputTime = inputTime;
    }

    public Integer getSBasePoint(){
        return sBasePoint;
    }
    public void setSBasePoint(Integer sBasePoint){
        this.sBasePoint = sBasePoint;
    }

    public Integer getSFinalPoint(){
        return sFinalPoint;
    }
    public void setSFinalPoint(Integer sFinalPoint){
        this.sFinalPoint = sFinalPoint;
    }
}
