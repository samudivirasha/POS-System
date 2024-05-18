package com.example.pos.item;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService (ItemRepository itemRepository) {this.itemRepository = itemRepository;}

    public List<Item> getItems() {return itemRepository.findAll();}

    public void addNewItem(Item item) {
        Optional<Item> itemOptional = itemRepository
                .findItemByName (item.getName());
        if (itemOptional.isPresent()){
            throw new IllegalStateException("Name taken");
        }
        itemRepository.save(item);
    }

    public void deleteItem(Long itemId) {
        boolean exists = itemRepository.existsById(itemId);
        if (!exists){
            throw new IllegalStateException("Item with id" + itemId + "does not exist");

        }
        itemRepository.deleteById(itemId);

    }
}
