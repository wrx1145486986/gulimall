package com.wrx.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wrx.gulimall.product.entity.BrandEntity;
import com.wrx.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.security.RunAs;
import java.util.List;


@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity entity = new BrandEntity();
//        entity.setName("ceshishuju");
//        brandService.save(entity);
        QueryWrapper<BrandEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("brand_id", 2);
        List<BrandEntity> list = brandService.list(queryWrapper);
        System.out.println(list);
    }

}
