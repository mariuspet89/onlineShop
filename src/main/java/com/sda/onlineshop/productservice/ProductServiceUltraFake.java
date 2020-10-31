package com.sda.onlineshop.productservice;

import com.sda.onlineshop.Product;

import java.util.List;
import java.util.Map;

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
}
