package com.sda.onlineshop;

import com.sda.onlineshop.productservice.ProductServiceFakeImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineshopApplication {

	//ProductController productController = new ProductController(new ProductServiceFakeImpl(new FakeDao()));

	public static void main(String[] args) {
		SpringApplication.run(OnlineshopApplication.class, args);
	}

}
