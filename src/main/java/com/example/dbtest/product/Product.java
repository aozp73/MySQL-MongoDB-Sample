package com.example.dbtest.product;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;

@Document
@Getter
public class Product {
    @Id
    private String id;
    private String name;
}
