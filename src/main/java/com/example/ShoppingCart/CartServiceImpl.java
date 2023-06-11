package com.example.ShoppingCart;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
import java.util.*;

@Service
public class CartServiceImpl implements CartService {
    @Override
    public void addItem(Integer... itemIds) {
        Cart cart = getCart();
        for (Integer itemId : itemIds) {
            cart.addItem(itemId);
        }
    }

    @Override
    public List<Integer> getItems() {
        Cart cart = getCart();
        return cart.getItems();
    }

    private Cart getCart() {
        HttpSession session = getSession();
        Cart cart = (Cart) session.getAttribute("cart");
        if (cart == null) {
            cart = new Cart();
            session.setAttribute("cart", cart);
        }
        return cart;
    }

    private HttpSession getSession() {
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        return attr.getRequest().getSession(true);
    }
}

