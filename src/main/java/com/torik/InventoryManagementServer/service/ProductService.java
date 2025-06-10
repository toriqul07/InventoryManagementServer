package com.torik.InventoryManagementServer.service;

import com.torik.InventoryManagementServer.dto.ProductDTO;
import com.torik.InventoryManagementServer.dto.Response;
import org.springframework.web.multipart.MultipartFile;

public interface ProductService {
    Response saveProduct(ProductDTO productDTO, MultipartFile imageFile);
    Response updateProduct(ProductDTO productDTO, MultipartFile imageFile);
    Response getAllProducts();
    Response getProductById(Long id);
    Response deleteProduct(Long id);
}
