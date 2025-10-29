package com.nomadicjazz.smart_inventory_trackerdemo.service;

import com.nomadicjazz.smart_inventory_trackerdemo.exception.ProductNotFoundException;
import com.nomadicjazz.smart_inventory_trackerdemo.model.Product;
import com.nomadicjazz.smart_inventory_trackerdemo.repository.ProductRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository){
        this.repository = repository;
    }

    // Get all products
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product getProductById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
    }
    // Create product
    public Product createProduct(Product product) {
        return repository.save(product);
    }

    // Update product
    public Product updateProduct(Long id, Product productDetails) {
        Product product = getProductById(id);
        product.setName(productDetails.getName());
        product.setCategory(productDetails.getCategory());
        product.setQuantity(productDetails.getQuantity());
        product.setReorderLevel(productDetails.getReorderLevel());
        product.setPrice(productDetails.getPrice());
        product.setSupplierId(productDetails.getSupplierId());
        return repository.save(product);
    }

    // Delete Product
    public void deleteProduct(Long id) {
        Product product = getProductById(id);
        repository.delete(product);
    }

    // Get low-stock products
    public List<Product> getLowStockProducts(){
        return repository.findAll().stream()
                .filter(Product::isLowStock)
                .toList();
    }
}
