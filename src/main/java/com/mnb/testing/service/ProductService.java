package com.mnb.testing.service;

import com.mnb.testing.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    public List<Product> findAll() {
        return List.of(new Product());
    }
}
