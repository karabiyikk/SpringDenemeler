package com.karabiyik.controller;

import com.karabiyik.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {
    @GetMapping({"/", "index"})
    public String index() {
        return "index";
    }

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

    //@PathVariable
    @GetMapping({"/thymeleaf6", "/thymeleaf6/{id}"})
    public String getTymeleaf6(Model model, @PathVariable(name = "id", required = false) Long id) {
        if (id != null) {
            model.addAttribute("key_model2", "id : " + id);
        } else {
            model.addAttribute("key_model2", "id bulunamadı");
        }
        return "thymeleaf6";
    }

    //RequestParam
    //http://localhost:8080/thymeleaf7?id=5&name=AlperKarabiyik
    @GetMapping("/thymeleaf7")
    public String getTymeleaf7(Model model, @RequestParam(name = "id", required = false) Long id,
                               @RequestParam(name = "name") String name) {
        model.addAttribute("key_model2", "id : " + id);
        if (id != null) {
            model.addAttribute("key_model2", "id : " + id + " Adı Soyadı : " + name);
        } else {
            model.addAttribute("key_model2", "id bulunamadı");
        }
        return "thymeleaf7";
    }
}
