package com.example.pos.category;

import com.example.pos.item.Item;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (path = "api/v1/category")


public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController (CategoryService categoryService) {this.categoryService = categoryService;}

    @GetMapping
    public List<Category> getCategory() {return categoryService.getCategory();}

    @PostMapping
    public void addNewCategory(@RequestBody Category category) {categoryService.addNewCategory(category);}



}
