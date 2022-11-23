package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication(exclude=MongoAutoConfiguration.class)
@EnableDiscoveryClient
public class GulimallProductApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(GulimallProductApplication.class,args);
		
		
	}

}
