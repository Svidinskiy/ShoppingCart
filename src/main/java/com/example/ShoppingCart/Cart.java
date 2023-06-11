package com.example.ShoppingCart;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cart {
    private final Set<Integer> itemIds;

    public Cart() {
        this.itemIds = new HashSet<>();
    }

    public void addItem(Integer itemId) {
        itemIds.add(itemId);
    }

    public List<Integer> getItems() {
        return new ArrayList<>(itemIds);
    }
}