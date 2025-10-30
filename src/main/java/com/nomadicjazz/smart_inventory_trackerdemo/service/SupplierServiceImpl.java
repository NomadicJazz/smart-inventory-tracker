package com.nomadicjazz.smart_inventory_trackerdemo.service;

import com.nomadicjazz.smart_inventory_trackerdemo.exception.ResourceNotFoundException;
import com.nomadicjazz.smart_inventory_trackerdemo.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import com.nomadicjazz.smart_inventory_trackerdemo.repository.SupplierRepository;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class SupplierServiceImpl implements SupplierService {

        @Autowired
        private SupplierRepository supplierRepository;

        @Override
        public Supplier createSupplier(Supplier supplier) {
            return supplierRepository.save(supplier);
        }

        @Override
        public Supplier getSupplierById(Long id) {
            return supplierRepository.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Supplier not found with id: " + id));
        }

        @Override
        public List<Supplier> getAllSuppliers() {
            return supplierRepository.findAll();
        }

        @Override
        public Supplier updateSupplier(Long id, Supplier supplierDetails) {
            Supplier supplier = getSupplierById(id);
            supplier.setName(supplierDetails.getName());
            supplier.setContactName(supplierDetails.getContactName());
            supplier.setPhone(supplierDetails.getPhone());
            supplier.setEmail(supplierDetails.getEmail());
            supplier.setAddress(supplierDetails.getAddress());
            return supplierRepository.save(supplier);
        }

        @Override
        public void deleteSupplier(Long id) {
            Supplier supplier = getSupplierById(id);
            supplierRepository.delete(supplier);
        }
    }