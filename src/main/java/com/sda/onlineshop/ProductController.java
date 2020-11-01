package com.sda.onlineshop;


import com.sda.onlineshop.productservice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/product")
public class ProductController {


    private final ProductService productService;



    @Autowired
    public ProductController(@Qualifier("productServiceImpl") ProductService productService) {
        this.productService = productService;
    }

    //@GetMapping("/all")
    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }



    @PostMapping("/add")
    public void addProduct(@RequestBody Product abc) {
        productService.addProduct(abc);
    }

}
