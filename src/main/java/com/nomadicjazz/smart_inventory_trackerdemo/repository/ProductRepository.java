package com.nomadicjazz.smart_inventory_trackerdemo.repository;

import com.nomadicjazz.smart_inventory_trackerdemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends  JpaRepository<Product, Long> {
    // add queries here later
}

