package com.crud.crud.controllers;

import com.crud.crud.models.Product;
import com.crud.crud.services.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository repo;

    // create the method that allows you to read (view/show rows from the product table in the crud database)
    @GetMapping({"","/"})
    public String viewProduct(Model model){
        List<Product> products = repo.findAll();
        model.addAttribute("products",products);
        return "products/index";
    }
}
// this allows use to connect to the product page using the Product Repository/Service


/*  This code snippet is part of a Spring Boot application using the Spring MVC(Model-View Controller) framework.
It defines a ProductController class that handles HTTP requests related to products. Here's a breakdown of what each part does:

@Controller Annotation: This marks the class as a Spring MVC controller. It is responsible for handling web requests and returning views.

@RequestMapping("/products") Annotation: This annotation specifies that the methods in this controller will handle requests with the path /products.

@Autowired Annotation: This tells Spring to inject an instance of ProductRepository into this controller.
                        ProductRepository is likely an interface extending a Spring Data JPA repository,
                        which provides methods for interacting with the Product entity in the database.

public String viewProduct(Model model) Method: This method is designed to handle requests to view a list of products.
    Although it is not annotated with @RequestMapping or @GetMapping, it's meant to be a handler method. Here’s what happens inside it:

        List<Product> products = repo.findAll();: This line retrieves all Product records from the database using the findAll method of ProductRepository.
        model.addAttribute("products", products);: This adds the list of products to the Model object, making it available for the view.
        return "products/index";: This returns the name of the view (in this case, products/index).
         Spring MVC will use this view name to render the HTML page that displays the list of products.*/