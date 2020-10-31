package com.sda.onlineshop.productservice;

import com.sda.onlineshop.FakeDao;
import com.sda.onlineshop.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceFakeImpl implements ProductService {



    private final FakeDao fakeDao;

    @Autowired
    public ProductServiceFakeImpl(FakeDao fakeDao) {
        this.fakeDao = fakeDao;
    }

    @Override
    public List<Product> getAllProducts() {
        return fakeDao.getProductList();
    }

    @Override
    public void addProduct(Product abc) {
       fakeDao.getProductList().add(abc);
    }

    public String myFavouriteProductName() {
        return "limonada";
    }
}
