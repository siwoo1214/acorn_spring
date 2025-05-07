package com.acorn.day1prac;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
 

@Data
public class CartForm {
    private List<CartItem> items = new ArrayList<>();
     
}