package com.example.distem.services;

import com.example.distem.models.Product;
import com.example.distem.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.findAll();
    }
    public Product getById(Long idUser){
        return productRepository.findById(idUser).orElse(null);
    }

    public void addReclamo(Product product){
        productRepository.save(product);
    }

}
