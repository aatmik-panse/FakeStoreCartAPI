package dev.aatmik.fakestorecartapi.Services;

import dev.aatmik.fakestorecartapi.Dtos.FakeStoreCartDTO;
import dev.aatmik.fakestorecartapi.Model.Cart;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service

public class FakeStoreCartService implements CartService{
    private RestTemplate restTemplate = new RestTemplate();
    @Override
    public List<Cart> getAllCarts() {
        FakeStoreCartDTO[] fakeStoreCartDTOS = restTemplate.getForObject(
                "https://fakestoreapi.com/carts",
                FakeStoreCartDTO[].class
        );
        List<Cart> carts = new ArrayList<>();
        for(FakeStoreCartDTO ele: fakeStoreCartDTOS) {
            Cart cart = new Cart();
            cart.setId(ele.getId());
            cart.setUserId(ele.getUserId());
            cart.setDate(ele.getDate());
            cart.setProducts(ele.getProducts());
            carts.add(cart);
        }
        System.out.println("All products fetched successfully!!!");
        return carts;
    }

    @Override
    public Cart getCartById(Long id) {
        FakeStoreCartDTO fakeStoreCartDTO = restTemplate.getForObject("https://fakestoreapi.com/carts/" + id,
                FakeStoreCartDTO.class);
        Cart cart = new Cart();
        cart.setId(fakeStoreCartDTO.getId());
        cart.setUserId(fakeStoreCartDTO.getUserId());
        cart.setDate(fakeStoreCartDTO.getDate());
        cart.setProducts(fakeStoreCartDTO.getProducts());
        return cart;
    }
    @Override
    public ArrayList<Cart> getCartByUserId(Long userId){
        FakeStoreCartDTO[] fakeStoreCartDTOS = restTemplate.getForObject(
                "https://fakestoreapi.com/carts/user/"+userId,
                FakeStoreCartDTO[].class
        );
        ArrayList<Cart> carts = new ArrayList<>();
        for(FakeStoreCartDTO ele: fakeStoreCartDTOS) {
            Cart cart = new Cart();
            cart.setId(ele.getId());
            cart.setUserId(ele.getUserId());
            cart.setDate(ele.getDate());
            cart.setProducts(ele.getProducts());
            carts.add(cart);
        }
        System.out.println("All products fetched successfully!!!");
        return carts;

    }
    @Override
    public void createCart(Cart cart) {
        FakeStoreCartDTO fakeStoreCartDTO = new FakeStoreCartDTO();
        fakeStoreCartDTO.setId(cart.getId());
        fakeStoreCartDTO.setUserId(cart.getUserId());
        fakeStoreCartDTO.setDate(cart.getDate());
        fakeStoreCartDTO.setProducts(cart.getProducts());
        restTemplate.postForObject("https://fakestoreapi.com/carts", fakeStoreCartDTO, FakeStoreCartDTO.class);
        System.out.println("Product added successfully!!!");
    }
    @Override
    public void updateCart(Long id, Cart cart) {
        FakeStoreCartDTO fakeStoreCartDTO = new FakeStoreCartDTO();
        fakeStoreCartDTO.setId(cart.getId());
        fakeStoreCartDTO.setUserId(cart.getUserId());
        fakeStoreCartDTO.setDate(cart.getDate());
        fakeStoreCartDTO.setProducts(cart.getProducts());
        restTemplate.put("https://fakestoreapi.com/carts/" + id, fakeStoreCartDTO);
        System.out.println("Product with id: " + id + " updated successfully!!!");
    }

    @Override
    public void deleteCart(Long id) {
        restTemplate.delete("https://fakestoreapi.com/carts/" + id);
        System.out.println("Product with id: " + id + " deleted successfully!!!");
    }


    @Override
    public ArrayList<Cart> getByDateRange(Date start, Date end) {
        String url = "https://fakestoreapi.com/carts?startdate="+start+"&enddate="+end;
        FakeStoreCartDTO[] fakeStoreCartDTOS = restTemplate.getForObject(url, FakeStoreCartDTO[].class);
        ArrayList<Cart> cartList = new ArrayList<>();
        for(FakeStoreCartDTO c: fakeStoreCartDTOS){
            Cart cart = new Cart();
            cart.setId(c.getId());
            cart.setUserId(c.getUserId());
            cart.setDate(c.getDate());
            cart.setProducts(c.getProducts());
            cartList.add(cart);
        }
        return cartList;
    }
}