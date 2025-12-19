package com.example.demo.service.impl;
import com.example.demo.repository.UserRepository;
import com.example.demo.entity.;
import com.example.demo.service.AssignmentEvaluationService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class AssignmentEvaluationServiceImpl implements AssignmentEvaluationService{

@Autowired
AssignmentEvaluationRepository aer;
public AssignmentEvaluation createAssignmentEvaluation(AssignmentEvaluation ae){

    return aer.save(ae);
}


}