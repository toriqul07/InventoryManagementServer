package com.torik.InventoryManagementServer.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.torik.InventoryManagementServer.enums.TransactionStatus;
import com.torik.InventoryManagementServer.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionDTO {
    private Long id;

    private Integer totalProducts;

    private BigDecimal totalPrice;


    private TransactionType transactionType;

    private TransactionStatus status;

    private String description;

    private LocalDateTime updatedAt;

    private LocalDateTime createdAt;

    private UserDTO user;

    private ProductDTO product;

    private SupplierDTO supplier;
}
