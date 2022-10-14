package com.smart.ecommerceql.resolver;

import com.smart.ecommerceql.model.Category;
import com.smart.ecommerceql.mutation.CategoryInput;
import com.smart.ecommerceql.repository.CategoryRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoryMutation implements GraphQLMutationResolver {

    @Autowired
    private CategoryRepository repository;
    @Autowired
    private ModelMapper modelMapper;


    public Category createCategory(CategoryInput input){
        Category category = modelMapper.map(input, Category.class);
        if(repository.existsCategoryByName(category.getName())){
            System.out.println("Item already exist");
            return category;
        }
        return repository.save(category);
    }
}
