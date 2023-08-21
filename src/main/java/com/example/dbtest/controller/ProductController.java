package com.example.dbtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbtest.product.Product;
import com.example.dbtest.product.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductController {
    
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }
}
