package com.torik.InventoryManagementServer.service;

import com.torik.InventoryManagementServer.dto.LoginRequest;
import com.torik.InventoryManagementServer.dto.RegisterRequest;
import com.torik.InventoryManagementServer.dto.Response;
import com.torik.InventoryManagementServer.dto.UserDTO;
import com.torik.InventoryManagementServer.entity.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getCurrentLoggedInUser();
    Response updateUser(Long id, UserDTO userDTO);
    Response deleteUser(Long id);
    Response getUserTransactions(Long id);
}
