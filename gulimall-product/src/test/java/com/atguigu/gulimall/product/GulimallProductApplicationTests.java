package com.atguigu.gulimall.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;

@SpringBootTest 
class GulimallProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
		


		
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setName("IBM2");
		brandService.save(brandEntity);
		System.out.print("save success");
	}

}
