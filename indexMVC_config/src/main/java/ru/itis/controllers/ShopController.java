package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.itis.models.ProductName;
import ru.itis.services.ProductService;

import java.util.List;

@Controller
public class ShopController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/shop", method = RequestMethod.GET)
    public String showProducts(ModelMap modelMap) {
        List<ProductName> showProducts = productService.showProducts();
        modelMap.addAttribute("products", showProducts);
        return "choose-car";
    }



}
