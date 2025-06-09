package com.torik.InventoryManagementServer.service;

import com.torik.InventoryManagementServer.dto.CategoryDTO;
import com.torik.InventoryManagementServer.dto.Response;

public interface CategoryService {
    Response createCategory(CategoryDTO categoryDTO);
    Response getAllCategories();
    Response getCategoryById(Long id);
    Response updateCategory(Long id, CategoryDTO categoryDTO);
    Response deleteCategory(Long id);
}