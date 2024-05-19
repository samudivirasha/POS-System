package com.example.pos.category;

import com.example.pos.item.Item;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CatRepository catRepository;

    public CategoryService (CatRepository catRepository) {this.catRepository = catRepository;}

    public List<Category> getCategory() {return catRepository.findAll();}

    public void addNewCategory(Category category) {
        Optional<Category> categoryOptional = catRepository
                .findCategoryByName (category.getCat_name());
        if (categoryOptional.isPresent()){
            throw new IllegalStateException("Name taken");
        }
        catRepository.save(category);
    }
}
