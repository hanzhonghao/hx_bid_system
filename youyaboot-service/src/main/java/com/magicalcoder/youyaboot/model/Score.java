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
public class Score implements Serializable{

    private Long id;//id
    private Integer afterSale;//after_sale
    private Integer apply;//apply
    private Integer geneSitu;//gene_situ
    private Integer standard;//standard
    private Integer techRequire;//tech_require
    private String signature;//signature
    private Long categoryId;//category_id
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    @JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
    private Date date;//date
    private Long projectId;//project_id
    private int numbers;
    private String project_str;
    private String category_str;
    private String dates;
    private String comment;//comment
}
