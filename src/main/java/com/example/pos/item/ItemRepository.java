package com.example.pos.item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemRepository
    extends JpaRepository <Item, Long> {

    Optional <Item> findItemByName (String item_name);
}
