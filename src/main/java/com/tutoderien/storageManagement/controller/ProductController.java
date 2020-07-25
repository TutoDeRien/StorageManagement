package com.tutoderien.storageManagement.controller;

import com.tutoderien.storageManagement.model.Product;
import com.tutoderien.storageManagement.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
public class ProductController {

    @Autowired
    ProductRepo productRepo;

    @GetMapping("/productList")
    public List<Product> getProductList(){
        return productRepo.findAll();
    }

    @GetMapping("/product")
    public Optional<Product> getProductById(@RequestParam Long id){
        return productRepo.findById(id);
    }

    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product product){
        return productRepo.save(product);
    }

    @DeleteMapping("/product")
    public void deleteProduct(@RequestParam Long id){
        productRepo.deleteById(id);
    }

}




















