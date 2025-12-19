package com.example.demo.service.impl;
import com.example.demo.repository.RoiRepository;
import com.example.demo.entity.Roi;
import com.example.demo.service.RoiService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class RoiServiceImpl implements RoiService{

@Autowired
RoiRepository ri;
public Roi createRoi( ri){

    return aer.save(ri);
}


}