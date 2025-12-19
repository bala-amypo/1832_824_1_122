package com.example.demo.service.impl;
import com.example.demo.repository.InfluencerRepository;
import com.example.demo.entity.Influencer;
import com.example.demo.service.InfluencerService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class InfluencerServiceImpl implements InfluencerService{

@Autowired
AssignmentEvaluationRepository aer;
public AssignmentEvaluation createAssignmentEvaluation(AssignmentEvaluation ae){

    return aer.save(ae);
}


}