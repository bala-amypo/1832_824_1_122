package com.example.demo.service.impl;
import com.example.demo.repository.CampaignRepository;
import com.example.demo.entity.Campaign;
import com.example.demo.service.Campaign;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class CampaignImpl implements CampaignService{

@Autowired
AssignmentEvaluationRepository aer;
public AssignmentEvaluation createAssignmentEvaluation(AssignmentEvaluation ae){

    return aer.save(ae);
}


}