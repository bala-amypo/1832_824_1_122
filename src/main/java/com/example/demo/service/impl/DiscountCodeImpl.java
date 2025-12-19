package com.example.demo.service.impl;
import com.example.demo.repository.DiscountCodeRepository;
import com.example.demo.entity.DiscountCode;
import com.example.demo.service.DiscountCodeService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class DiscountCodeServiceImpl implements DiscountCodeService{

@Autowired
DiscountCodeRepository ds;
public  createAssignmentEvaluation(AssignmentEvaluation ae){

    return aer.save(ds);
}


}