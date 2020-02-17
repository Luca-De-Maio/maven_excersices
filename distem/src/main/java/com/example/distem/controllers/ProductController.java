package com.example.distem.controllers;

import com.example.distem.models.Product;
import com.example.distem.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/all")
    public List<Product> getAll() {
        return productService.getAll();
    }

    @PostMapping(value = "/add")
    public Long agregarProducto(@RequestBody Product product){
        productService.addReclamo(product);
        return product.getIdProduct();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Product getOne(@PathVariable("id") Long pepito) {
        return productService.getById(pepito);
    }

}
