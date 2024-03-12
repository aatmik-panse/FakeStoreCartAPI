package dev.aatmik.fakestorecartapi.Model;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter

public class Cart {
    private Long id;
    private Long userId;
    private Date date;
    private ArrayList<Product> products;

    public Cart() {
    }

    public Cart(Long id, Long userId, Date date, ArrayList<Product> products) {
        this.id = id;
        this.userId = userId;
        this.date = date;
        this.products = products;
    }
}
//done
