package dev.aatmik.fakestorecartapi.Dtos;

import dev.aatmik.fakestorecartapi.Model.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter

public class FakeStoreCartDTO {
    private Long id;
    private Long userId;
    private Date date;
    private ArrayList<Product> products  ;
}
//done