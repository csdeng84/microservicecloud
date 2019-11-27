package com.atguigu.springcloud.service.impl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheTest {

    @Cacheable(value = "API_PAGESUB")
    public void test() {
        System.out.println("get from db-------------------" + System.currentTimeMillis());

    }
}
