package com.nomadicjazz.smart_inventory_trackerdemo.service;

import com.nomadicjazz.smart_inventory_trackerdemo.model.Supplier;
import java.util.List;

public interface SupplierService {
    Supplier createSupplier(Supplier supplier);
    Supplier getSupplierById(Long id);
    List<Supplier> getAllSuppliers();
    Supplier updateSupplier(Long id, Supplier supplier);
    void deleteSupplier(Long id);
}
