package com.example.demo.service.impl;
import com.example.demo.repository.InfluencerRepository;
import com.example.demo.entity.Influencer;
import com.example.demo.service.InfluencerService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class InfluencerServiceImpl implements InfluencerService{

@Autowired
InfluencerRepository in;
public Influencer createInfluencer(Influencer in){

    return aer.save(in);
}


}