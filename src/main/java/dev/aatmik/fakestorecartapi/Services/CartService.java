package dev.aatmik.fakestorecartapi.Services;
import dev.aatmik.fakestorecartapi.Model.Cart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface CartService {
    List<Cart> getAllCarts();
    Cart getCartById(Long id);
    Cart getCartByUserId(Long userId);
    void createCart(Cart cart);
    void updateCart(Long id, Cart cart);
    void deleteCart(Long id);

    ArrayList<Cart> getByDateRange(Date start, Date end);
}