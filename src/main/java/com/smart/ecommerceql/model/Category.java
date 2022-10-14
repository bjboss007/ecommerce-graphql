package com.smart.ecommerceql.model;

import com.smart.ecommerceql.core.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Category extends AbstractEntity {
    private String name;
    private String description;
    private List<String> subCategories;
}
