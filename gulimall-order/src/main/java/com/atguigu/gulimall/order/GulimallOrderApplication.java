package com.atguigu.gulimall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@MapperScan("com.atguigu.gulimall.order.dao")
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class GulimallOrderApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(GulimallOrderApplication.class, args);
	}

}
