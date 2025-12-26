package com.example.demo.controller;

import com.example.demo.entity.SaleTransaction;
import com.example.demo.service.SaleTransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SaleTransactionController {

    private final SaleTransactionService service;

    public SaleTransactionController(SaleTransactionService service) {
        this.service = service;
    }

    @PostMapping
    public SaleTransaction create(@RequestBody SaleTransaction transaction) {
        return service.create(transaction);
    }

    @GetMapping
    public List<SaleTransaction> getAll() {
        return service.getAll();
    }
}
