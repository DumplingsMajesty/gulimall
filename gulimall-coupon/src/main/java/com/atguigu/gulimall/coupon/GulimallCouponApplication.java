package com.atguigu.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@MapperScan("com.atguigu.gulimall.coupon.dao")
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class GulimallCouponApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(GulimallCouponApplication.class, args);
	}

}
