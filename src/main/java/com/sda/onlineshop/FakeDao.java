package com.sda.onlineshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;



@Repository
public class FakeDao {



   private List<Product> productList = new ArrayList<>();

    {
        productList.add(new Product(1, "paine", "Dorbob", 3, 3, "rfew", "fdwf", "gufids"));
        productList.add(new Product(2, "paine1", "Dorbobbb", 3, 3, "rfew", "fdwf", "gufids"));
        productList.add(new Product(3, "paine2", "Dorbooob", 3, 3, "rfew", "fdwf", "gufids"));
    }

    public List<Product> getProductList() {
        return productList;
    }

}
