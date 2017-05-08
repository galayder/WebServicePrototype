package com.webservice.controllers;

import com.webservice.models.Product;
import com.webservice.services.interfaces.ProductService;
import com.webservice.verify.interfaces.VerifyProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private VerifyProduct verifyProduct;

    @RequestMapping(value = "/home/add-product", method = RequestMethod.GET)
    public String returnAddProductPage(Model model) {
        model.addAttribute("newProduct", new Product());
        return "add-product-page";
    }

    @RequestMapping(value = "/home/add-product/add-next-product", method = RequestMethod.POST)
    public String addNextProductPage(@ModelAttribute Product product, Model model) {
        model.addAttribute("newProduct", productService.create(product));
        return "add-product-page";
    }

    @RequestMapping(value = "/home/view-products", method = RequestMethod.GET)
    public String returnViewProductPage() {
        return "view-product-page";
    }

    @RequestMapping(value = "/home/view-products/result", method = RequestMethod.GET)
    public String resultViewProductPage(@RequestParam("name") String name, Model model) {
        model.addAttribute("message", productService.readByName(name));
        return "view-product-page";
    }
}
