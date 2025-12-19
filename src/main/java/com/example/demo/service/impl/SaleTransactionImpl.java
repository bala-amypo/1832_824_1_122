package com.example.demo.service.impl;
import com.example.demo.repository.SaleTransactionRepository;
import com.example.demo.entity.SaleTransaction;
import com.example.demo.service.SalesTransactionService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class SaleTransactionServiceImpl implements SaleTransactionService{

@Autowired
SaleTransactionRepository st;
public AssignmentEvaluation createAssignmentEvaluation(AssignmentEvaluation ae){

    return aer.save(ae);
}


}