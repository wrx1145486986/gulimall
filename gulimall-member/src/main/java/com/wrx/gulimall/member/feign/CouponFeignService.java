package com.wrx.gulimall.member.feign;

import com.wrx.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangrongxiang
 * @date 2020/8/28 23:04
 */

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    /*
     * 一定要注意 这里的 @requestMapping 中的路径要写全
     */
    @RequestMapping("coupon/coupon/member/list")
    public R memberCoupons();


}
