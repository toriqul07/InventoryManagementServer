package com.torik.InventoryManagementServer.service;

import com.torik.InventoryManagementServer.dto.Response;
import com.torik.InventoryManagementServer.dto.SupplierDTO;

public interface SupplierService {
    Response addSupplier(SupplierDTO supplierDTO);
    Response updateSupplier(Long id, SupplierDTO supplierDTO);
    Response getAllSuppliers();
    Response getSupplierById(Long id);
    Response deleteSupplier(Long id);
}
