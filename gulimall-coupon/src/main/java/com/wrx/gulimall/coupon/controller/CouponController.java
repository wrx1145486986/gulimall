package com.wrx.gulimall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wrx.gulimall.coupon.entity.CouponEntity;
import com.wrx.gulimall.coupon.service.CouponService;
import com.wrx.common.utils.PageUtils;
import com.wrx.common.utils.R;


/**
 * 优惠券信息
 *
 * @author wangrongxiang
 * @email 1145486986@wrx.com
 * @date 2020-08-26 22:24:16
 */

/*
 *  nacos 配置中心 使用方法
 * 1、引入依赖
 * 2、创建一个bootstrap.yml
 * 3、需要给配置中心添加一个数据集 dataId   默认规则  应用名.properties
 * 4、给这个数据集添加初始配置数据
 * 5、动态获取配置 @RefreshScope  动态获取并刷新配置   @value 获取值
 *
 *  ####  配置中心有数据的 默认使用配置中心的数据，配置中心没有数据的使用本地数据
 */

/*
 * 配置中心其他说明信息
 *
 * 1、命名空间：配置隔离
 * 默认的命名空间为 public   默认新增的所有配置都存在于public空间下
 * ## 利用命名空间做配置环境隔离   一定要写   环境的 id
 *       切换命名空间
 *    bootstrap.yml 中   添加   namespace: 7167cf10-9e8a-487c-b2fd-22051e218b3b
 *      可以使每一个微服务都有自己的命名空间   只加载自己的相应配置
 *
 * 2、配置集（概念）：所有的配置项的集合
 * 3、配置集ID：类似配置文件名  data Id
 * 3、配置分组：默认所有的配置集  都属于  DEFAULT_GROUP
 *  可以在配置文件中  在指定  命名空间之后   继续指定相应的  group
 *
 * #########  可以使用  微服务名称作为命名空间  然后根据  相应的环境进行分组操作
 * 例如：   gulimall-coupon    dev
 * 配置信息的任何配置文件都可以放在配置中心
 *
 * 拆分多个配置文件并使用
 *  extension-configs:
          - data-id: other.yml
            group: dev
            refresh: true
 *
 * 在yml中   -   表示一个数组
 */

@RefreshScope
@RestController
@RequestMapping("coupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    @Value("${coupon.user.name}")
    private String name;
    @Value("${coupon.user.age}")
    private String age;

    @Value("${test}")
    private String test;

    @RequestMapping("/test")
    public R test() {
        return R.ok().put("name", name).put("age", age).put("test", test);
    }

    @RequestMapping("/member/list")
    public R memberCoupons() {
        System.out.println("我被调用了！");
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("满100减10");
        return R.ok().put("coupons", Arrays.asList(couponEntity));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:coupon:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:coupon:info")
    public R info(@PathVariable("id") Long id) {
        CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:coupon:save")
    public R save(@RequestBody CouponEntity coupon) {
        couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:coupon:update")
    public R update(@RequestBody CouponEntity coupon) {
        couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:coupon:delete")
    public R delete(@RequestBody Long[] ids) {
        couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
