package com.smart.ecommerceql.mutation;


import com.smart.ecommerceql.model.Category;
import lombok.Data;

import java.util.List;

@Data
public class ProductInput {
    private String name;
    private double price;
    private double comparePrice;
    private Category category;
    private List<String> variants;
    private String description;
    private int stocks;
    private int sold;
    private int tax;
    private boolean active;
    private double rating;
}
