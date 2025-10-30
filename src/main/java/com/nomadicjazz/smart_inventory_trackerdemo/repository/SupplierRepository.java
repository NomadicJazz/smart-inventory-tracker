package com.nomadicjazz.smart_inventory_trackerdemo.repository;

import com.nomadicjazz.smart_inventory_trackerdemo.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    // You can define custom queries here later if needed
    // Example: List<Supplier> findByNameContainingIgnoreCase(String name);
}
