package com.sda.onlineshop;


import com.sda.onlineshop.productservice.ProductService;
import com.sda.onlineshop.productservice.ProductServiceFakeImpl;
import com.sda.onlineshop.productservice.ProductServiceUltraFake;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/product")
public class ProductController {
    ProductServiceUltraFake productServiceFakeImpl = new ProductServiceUltraFake();
    ProductService productServiceUltraFake = new ProductServiceFakeImpl();

    @GetMapping("/all")
    public String getAllProducts() {
        return productServiceFakeImpl.getMyFavouriteProduct();
    }



}
