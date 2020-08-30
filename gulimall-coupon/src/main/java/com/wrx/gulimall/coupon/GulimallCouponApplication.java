package com.wrx.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
@EnableDiscoveryClient 注册中心开启

配置 mybats-plus  需要扫描的包在什么位置  以及映射文件 xml 的位置  后面的配置在 yml中配置
 */
@EnableDiscoveryClient
@MapperScan("com.wrx.gulimall.coupon.dao")
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
