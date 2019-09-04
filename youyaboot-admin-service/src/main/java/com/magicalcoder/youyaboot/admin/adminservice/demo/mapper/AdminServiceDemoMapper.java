package com.magicalcoder.youyaboot.admin.adminservice.demo.mapper;

import com.magicalcoder.youyaboot.admin.model.MyDemo;

import java.util.Map;

public interface AdminServiceDemoMapper {
    MyDemo daoDemoGoods(Map<String,Object> query);

}
