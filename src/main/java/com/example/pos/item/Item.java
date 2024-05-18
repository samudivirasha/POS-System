package com.example.pos.item;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table

public class Item {

    private Long id;

    private String item_name;

    private String description;

}

public item(
        Long id,
        String item_name,
        String description){
this.id = id;
this.name = item_name;
this.description = description
}

@Override
public String toString() {
    return "Student{" +
            "id=" + id +
            ", name='" + item_name + '\'' +
            ", email='" + description + '\'' +
            '}';
}


