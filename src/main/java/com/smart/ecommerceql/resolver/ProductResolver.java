package com.smart.ecommerceql.resolver;


import com.smart.ecommerceql.model.Product;
import com.smart.ecommerceql.repository.ProductRepository;
import graphql.GraphqlErrorException;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ProductResolver implements GraphQLQueryResolver {
    @Autowired
    private ProductRepository productRepository;

    public Product getProduct(String id){
        Product product = productRepository.findById(id)
                .orElse(null);
        return product;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public String deleteProduct(String id){
        productRepository.deleteById(id);
        return "Product Deleted successfully";
    }
}
