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
public class ScoreCategory implements Serializable{

    private Long id;//id
    private String childCategore;//child_categore

    
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getChildCategore(){
        return childCategore;
    }
    public void setChildCategore(String childCategore){
        this.childCategore = childCategore;
    }
}
