package com.smart.ecommerceql.mutation;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryInput {
    private String name;
    private String description;
    private List<String> subCategories;
}
