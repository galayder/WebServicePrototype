package com.webservice.controllers;

import com.webservice.models.Product;
import com.webservice.services.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/home/add-product", method = RequestMethod.GET)
    public String returnAddProductPage(Model model) {
        model.addAttribute("newProduct", new Product());
        return "add-product-page";
    }

    @RequestMapping(value = "/home/add-product/add-next-product", method = RequestMethod.POST)
    public ModelAndView addNextProductPage(@ModelAttribute Product product, Model model) {
        model.addAttribute("newProduct", productService.create(product));
        return new ModelAndView("add-product-page");
    }

    @RequestMapping(value = "/home/add-product/add-and-quit", method = RequestMethod.POST)
    public ModelAndView addProductAndQuitPage(@ModelAttribute Product product, Model model) {
        model.addAttribute("newProduct", productService.create(product));
        return new ModelAndView("add-product-page");
    }
}
