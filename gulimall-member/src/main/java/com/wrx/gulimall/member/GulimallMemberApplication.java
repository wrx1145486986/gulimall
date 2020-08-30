package com.wrx.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 想要使用远程调用的步骤
 * 1、引入 open-feign
 * 2、编写接口 并告诉springboot，这个接口要使用远程调用服务
 * <p>
 * 1、首先 声明这是一个 远程调用接口
 * 2、将要调用的微服务的完整的方法签名写在接口的位置
 * 3、开启远程调用功能 @EnableFeignClients
 */

@EnableFeignClients(basePackages = "com.wrx.gulimall.member.feign")
@EnableDiscoveryClient
@MapperScan("com.wrx.gulimall.member.dao")
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
