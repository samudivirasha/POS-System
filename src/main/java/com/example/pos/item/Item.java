package com.example.pos.item;

import jakarta.persistence.*;

@Entity
@Table

public class Item {

    @Id
    @SequenceGenerator(
            name = "item_sequence",
            sequenceName = "item_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "item_sequence"
    )

    

    public Item() {
    }
}



