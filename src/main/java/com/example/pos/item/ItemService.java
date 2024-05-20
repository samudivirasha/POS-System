package com.example.pos.item;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService (ItemRepository itemRepository) {this.itemRepository = itemRepository;}

    public List<Item> getItems() {return itemRepository.findAll();}

    public Map<String,String> addNewItem(Item item) {
        Optional<Item> itemOptional = itemRepository
                .findItemByName (item.getName());
        if (itemOptional.isPresent()){
            return Map.of(
                    "status", "error",
                    "message", "Name taken"
            );


        }
        itemRepository.save(item);
        return Map.of(
                "status", "success"

        );
    }

    public void deleteItem(Long itemId) {
        boolean exists = itemRepository.existsById(itemId);
        if (!exists){
            throw new IllegalStateException("Item with id" + itemId + "does not exist");

        }
        itemRepository.deleteById(itemId);

    }

    public void updateItem(Long itemId, String name, String description, String price, String stock) {
    }


}
