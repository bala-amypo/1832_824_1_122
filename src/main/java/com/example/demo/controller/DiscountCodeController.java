package com.example.demo.controller;

import com.example.demo.entity.DiscountCode;
import com.example.demo.service.DiscountCodeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/discount-codes")
public class DiscountCodeController {

    private final DiscountCodeService service;

    public DiscountCodeController(DiscountCodeService service) {
        this.service = service;
    }

    @PostMapping
    public DiscountCode create(@RequestBody DiscountCode code) {
        return service.create(code);
    }

    @GetMapping
    public List<DiscountCode> getAll() {
        return service.getAll();
    }
}
