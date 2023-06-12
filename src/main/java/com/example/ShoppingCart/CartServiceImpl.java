package com.example.ShoppingCart;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
import java.util.*;

@Service
public class CartServiceImpl implements CartService {
    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void addItem(Integer... itemIds) {
        for (Integer itemId : itemIds) {
            cart.addItem(itemId);
        }
    }

    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }
}

