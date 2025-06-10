package com.torik.InventoryManagementServer.service;

import com.torik.InventoryManagementServer.dto.Response;
import com.torik.InventoryManagementServer.dto.TransactionRequest;
import com.torik.InventoryManagementServer.enums.TransactionStatus;

public interface TransactionService {
    Response restockInventory(TransactionRequest transactionRequest);
    Response sell(TransactionRequest transactionRequest);
    Response returnToSupplier(TransactionRequest transactionRequest);
    Response getAllTransactions(int page, int size, String searchText);
    Response getTransactionById(Long id);
    Response getAllTransactionByMonthAndYear(int month, int year);
    Response updateTransactionStatus(Long transactionId, TransactionStatus transactionStatus);
}
