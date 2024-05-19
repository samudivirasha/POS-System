package com.example.pos.category;

import jakarta.persistence.*;

@Entity
@Table
public class Category {


    @Id
    @SequenceGenerator(
            name = "category_sequence",
            sequenceName = "category_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "category_sequence"
    )

    private Long id;
    private String cat_name;
    private String brand;
    private String cat_description;

    public Category(Long id,
                    String cat_name,
                    String brand,
                    String cat_description) {
        this.id = id;
        this.cat_name = cat_name;
        this.brand = brand;
        this.cat_description = cat_description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCat_description() {
        return cat_description;
    }

    public void setCat_description(String cat_description) {
        this.cat_description = cat_description;
    }

    public Category(String cat_name, String brand, String cat_description) {
        this.cat_name = cat_name;
        this.brand = brand;
        this.cat_description = cat_description;
    }
}
