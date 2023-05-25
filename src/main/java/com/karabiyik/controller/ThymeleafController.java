package com.karabiyik.controller;

import com.karabiyik.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {

    @GetMapping("/thymeleaf1")
    public String getTymeleaf1(Model model) {
        model.addAttribute("key_model", "modelden geldi");
        model.addAttribute("key_model2", "model2'den geldi");

        return "thymeleaf1";
    }

    @GetMapping("/thymeleaf2")
    public String getThymeleaf2Model() {
        return "thymeleaf1";
    }

    @GetMapping("/thymeleaf3")
    public String getTymeleaf3(Model model) {
        model.addAttribute("key_model2", "model3'den geldi");

        return "thymeleaf3";
    }

    //Model Object Gönderme
    @GetMapping("/thymeleaf4")
    public String getTymeleaf4(Model model) {
        model.addAttribute("key_model2", "text");

        ProductDto productDto = ProductDto.builder().productID(0).productName("Ürün Adı").productPrice(25.5).build();
        model.addAttribute("key_model3", productDto);
        return "thymeleaf4";
    }

    //Model Object List Gönderme
    @GetMapping("/thymeleaf5")
    public String getTymeleaf5(Model model) {
        model.addAttribute("key_model1", "text");
        List<ProductDto> myList = new ArrayList<>();
        myList.add(ProductDto.builder().productID(1).productName("Ürün Adı1").productPrice(100.0).build());
        myList.add(ProductDto.builder().productID(2).productName("Ürün Adı2").productPrice(200.0).build());
        myList.add(ProductDto.builder().productID(3).productName("Ürün Adı3").productPrice(300.0).build());
        myList.add(ProductDto.builder().productID(4).productName("Ürün Adı4").productPrice(400.0).build());
        model.addAttribute("product_liste", myList);
        return "thymeleaf5";
    }
}
