package com.smart.ecommerceql.repository;

import com.smart.ecommerceql.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {


    boolean existsCategoryByName(String name);
}
