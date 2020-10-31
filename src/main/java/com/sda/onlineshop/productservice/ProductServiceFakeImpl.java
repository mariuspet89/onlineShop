package com.sda.onlineshop.productservice;

import com.sda.onlineshop.FakeDao;
import com.sda.onlineshop.Product;
import com.sda.onlineshop.productservice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class ProductServiceFakeImpl implements ProductService {


    FakeDao fakeDao = new FakeDao();

    @Override
    public List<Product> getAllProducts() {
        return fakeDao.getProductList();
    }

    public String myFavouriteProductName() {
        return "limonada";
    }
}
