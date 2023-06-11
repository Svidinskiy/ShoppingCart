package com.example.ShoppingCart;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public void addItem(@RequestParam("itemId") Integer... itemId) {
        cartService.addItem(itemId);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return cartService.getItems();
    }
}
