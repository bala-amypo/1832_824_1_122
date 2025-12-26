package com.example.demo.service;

import com.example.demo.entity.SaleTransaction;
import java.util.List;

public interface SaleTransactionService {

    SaleTransaction create(SaleTransaction transaction);

    List<SaleTransaction> getAll();
}
