package com.smart.ecommerceql.model;


import com.smart.ecommerceql.core.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product extends AbstractEntity {
    private String name;
    private double price;
    private double comparePrice;
    private Category category;
    private List<String> variants;
    private String description;
    private int stocks;
    private int sold = 0;
    private int tax;
    private boolean active = true;
    private double rating = 0;
}
