package com.wrx.gulimall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * @author wangrongxiang
 * @date 2020/8/30 20:30
 * 配置跨域
 */
@Configuration
public class GulimallCorsConfiguration {

    @Bean
    public CorsWebFilter corsWebFilter() {
        UrlBasedCorsConfigurationSource urlBase = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();

//        在  corsConfiguration  中 配置跨域

        /*
         *允许所有源
         */
        corsConfiguration.addAllowedOrigin("*");
        /*
         *允许所有请求头
         */
        corsConfiguration.addAllowedHeader("*");
        /*
         * 允许所有的请求方式
         */
        corsConfiguration.addAllowedMethod("*");
        /*
         * 允许携带cookie
         */
        corsConfiguration.setAllowCredentials(true);


        urlBase.registerCorsConfiguration("/**", corsConfiguration);

        return new CorsWebFilter(urlBase);
    }
}
