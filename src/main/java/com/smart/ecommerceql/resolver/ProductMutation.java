package com.smart.ecommerceql.resolver;

import com.smart.ecommerceql.model.Product;
import com.smart.ecommerceql.mutation.ProductInput;
import com.smart.ecommerceql.repository.ProductRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductMutation implements GraphQLMutationResolver {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ModelMapper modelMapper;

    public Product createProduct(ProductInput productInput){
        Product product = modelMapper.map(productInput, Product.class);
        productRepository.save(product);
        return product;
    }
}
