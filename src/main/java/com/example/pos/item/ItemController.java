package com.example.pos.item;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (path = "api/v1/item")
public class ItemController {

    private final ItemService itemService;

    public ItemController (ItemService itemService){
        this.itemService = itemService;
    }

    @GetMapping
    public List<Item> getItems () {
        return itemService.getItems();
    }
}

    @PostMapping
    public void addAnewItem (@RequestBody Item item) {
        itemService.addNewItem(item);
    }
