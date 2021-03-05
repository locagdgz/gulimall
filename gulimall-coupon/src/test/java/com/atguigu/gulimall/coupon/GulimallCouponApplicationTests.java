package com.atguigu.gulimall.coupon;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.atguigu.gulimall.coupon.service.CouponService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallCouponApplicationTests {

    @Autowired
    CouponService couponService;

    @Test
    public void contextLoads() {
        couponService.save(new CouponEntity().setAmount(new BigDecimal(1)).setNote("asd"));
    }

}
