package com.nomadicjazz.smart_inventory_trackerdemo.controller;

import com.nomadicjazz.smart_inventory_trackerdemo.model.Product;
import com.nomadicjazz.smart_inventory_trackerdemo.repository.ProductRepository;
import com.nomadicjazz.smart_inventory_trackerdemo.service.ProductService;
import com.nomadicjazz.smart_inventory_trackerdemo.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }


    @GetMapping
    public List<Product> getAllProducts(@RequestParam(required = false) Boolean lowStock) {
        if (Boolean.TRUE.equals(lowStock)) {
            return service.getLowStockProducts();
        }
        return service.getAllProducts();
    }

    // --- Get product by ID ---
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Product product = service.getProductById(id);
        return ResponseEntity.ok(product);
    }

    // --- Create a new product ---
    @PostMapping
    public ResponseEntity<Product> createProduct(@Valid @RequestBody Product product) {
        Product created = service.createProduct(product);
        return ResponseEntity.ok(created);
    }

    // --- Update existing product ---
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @Valid @RequestBody Product productDetails) {
        Product updated = service.updateProduct(id, productDetails);
        return ResponseEntity.ok(updated);
    }

    // --- Delete product ---
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        service.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }

    // --- Test endpoint ---
    @GetMapping("/test")
    public String test() {
        return "Controller works!";
    }
}
