package com.atguigu.gulimall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class})
@EnableDiscoveryClient
public class GulimallGatewayApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(GulimallGatewayApplication.class, args);
	}

}
