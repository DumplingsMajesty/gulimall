package com.atguigu.gulimall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@MapperScan("com.atguigu.gulimall.ware.dao")
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class GulimallWareApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(GulimallWareApplication.class, args);
	}

}
