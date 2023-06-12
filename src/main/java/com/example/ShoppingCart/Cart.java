package com.example.ShoppingCart;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@SessionScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
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
