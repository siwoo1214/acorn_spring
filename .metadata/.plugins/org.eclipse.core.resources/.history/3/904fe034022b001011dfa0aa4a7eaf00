package com.acorn.day1prac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/cart")
public class CartController {

	
    @RequestMapping(value="/form" , method = RequestMethod.GET)
    public String Form(Model model) {        
        return "cartForm";
    }
    

    @RequestMapping(value="/update"  , method=RequestMethod.POST)
    public String updateCart(@ModelAttribute CartForm cartForm) {
    	
        for (CartItem item : cartForm.getItems()) {
            System.out.println("상품 ID: " + item.getProductId());
            System.out.println("수량: " + item.getQuantity());
            System.out.println("옵션: " + item.getOption());
        }
        return "redirect:/";
    }
}
