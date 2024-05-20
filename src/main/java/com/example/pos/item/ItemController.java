package com.example.pos.item;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping (path = "api/v1/item")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<Item> getItems() {
        return itemService.getItems();
    }


    @PostMapping
    public Map<String,String> addAnewItem(@RequestBody Item item) {
         return itemService.addNewItem(item);
    }

    @DeleteMapping (path = "{itemId}")
    public void deleteItem(@PathVariable ("itemId") Long itemId){
        itemService.deleteItem(itemId);
    }

    //change stock
    @PutMapping(path = "{itemId}")
    public void updateItem(
            @PathVariable("itemId") Long itemId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String description,
            @RequestParam(required = false) String price,
            @RequestParam(required = false) String stock
    ){
        itemService.updateItem(itemId, name, description, price, stock);
    }
}

