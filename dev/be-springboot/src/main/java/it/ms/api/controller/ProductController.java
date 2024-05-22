package it.ms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.ms.api.data.entity.Products;
import it.ms.api.data.repo.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired 
    ProductRepository productRepo;

    @GetMapping("/{id}")
    public Products listUno(@PathVariable("id") long id) {
        return productRepo.findById(id).get();
    }

    @GetMapping("/lista")
    public List<Products> lista(@RequestParam(name = "nome", required = false) String name){
        if(name != null && name.trim().length() > 0){
            return productRepo.findProductsByName(name);
        } else {
            return productRepo.findAll();
        }
    }

    @PostMapping
    public Products createProduct(@RequestBody Products product) {
        return productRepo.save(product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        if (productRepo.existsById(id)) {
            productRepo.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}

