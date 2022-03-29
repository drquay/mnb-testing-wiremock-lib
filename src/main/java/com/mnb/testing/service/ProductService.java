package com.mnb.testing.service;

import com.mnb.testing.model.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {

    @Value("${product.url}")
    private String productUrl;

    public Product[] findAll() {
        final RestTemplate restTemplate = new RestTemplate();
        final ResponseEntity<Product[]> response = restTemplate.getForEntity(productUrl, Product[].class);
        return response.getBody();
    }
}
