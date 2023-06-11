package com.example.ShoppingCart;

import java.util.List;

public interface CartService {
    void addItem(Integer... itemId);
    List<Integer> getItems();
}

