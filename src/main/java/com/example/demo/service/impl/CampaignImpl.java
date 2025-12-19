package com.example.demo.service.impl;
import com.example.demo.repository.CampaignRepository;
import com.example.demo.entity.Campaign;
import com.example.demo.service.Campaign;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class CampaignImpl implements CampaignService{

@Autowired
Campaign cm ;
public Campaign createCampaign(Campaign cm){

    return aer.save(cm);
}


}