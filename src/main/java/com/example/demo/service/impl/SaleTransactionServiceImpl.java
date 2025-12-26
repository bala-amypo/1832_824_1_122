package com.example.demo.service.impl;

import com.example.demo.entity.SaleTransaction;
import com.example.demo.repository.SaleTransactionRepository;
import com.example.demo.service.SaleTransactionService;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class SaleTransactionServiceImpl implements SaleTransactionService {

    private final SaleTransactionRepository repository;

    public SaleTransactionServiceImpl(SaleTransactionRepository repository) {
        this.repository = repository;
    }

    @Override
    public SaleTransaction create(SaleTransaction transaction) {

        // set current time if not provided
        if (transaction.getTransactionDate() == null) {
            transaction.setTransactionDate(
                    new Timestamp(System.currentTimeMillis())
            );
        }

        return repository.save(transaction);
    }

    @Override
    public List<SaleTransaction> getAll() {
        return repository.findAll();
    }
}
