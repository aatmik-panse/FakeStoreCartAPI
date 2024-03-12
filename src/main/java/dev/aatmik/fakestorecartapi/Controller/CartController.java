package dev.aatmik.fakestorecartapi.Controller;

import dev.aatmik.fakestorecartapi.Model.Cart;
import dev.aatmik.fakestorecartapi.Services.CartService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class CartController {
    private CartService cartService;
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
    @GetMapping("/carts")
    public List<Cart> getAllCart() {
        return cartService.getAllCarts();
    }
    @GetMapping("/carts/{id}")
    public Cart getCartById(@PathVariable("id") Long id) {
        return cartService.getCartById(id);
    }
    @GetMapping("/carts/user/{userId}")
    public Cart getCartByUserId(@PathVariable("userId") Long userId) {
        return cartService.getCartByUserId(userId);
    }

    @PostMapping("/carts")
    public void createCart(Cart cart) {
         cartService.createCart(cart);
    }
    @PutMapping("/carts/{id}")
    public void updateCart(@PathVariable("id") Long id, Cart cart) {
        cartService.updateCart(id, cart);
    }
    @DeleteMapping("/carts/{id}")
    public void deleteCart(@PathVariable("id") Long id) {
        cartService.deleteCart(id);
    }

    @GetMapping("/carts/{start}/{end}")
    public ArrayList<Cart> getByRange(@PathVariable Date start, @PathVariable Date end){
        return cartService.getByDateRange(start, end);
    }
}