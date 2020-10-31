package com.sda.onlineshop.productservice;

import com.sda.onlineshop.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("productServiceUltraFake")
public class ProductServiceUltraFake implements ProductService  {

    public Map<String, List<Product>> getListProduct() {
        return null;
        //more code to come ....
    }

    public String getMyFavouriteProduct() {
        return "paine";
    }

    @Override
    public List<Product> getAllProducts() {

        return getListProduct().get("abc");
    }

    @Override
    public void addProduct(Product product) {

    }
}
