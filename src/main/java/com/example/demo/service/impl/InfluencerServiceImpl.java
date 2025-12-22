package com.example.demo.service.impl;

import com.example.demo.entity.Influencer;
import com.example.demo.repository.InfluencerRepository;
import com.example.demo.service.InfluencerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfluencerServiceImpl implements InfluencerService {

    @Autowired
    private InfluencerRepository influencerRepository;

    @Override
    public Influencer createInfluencer(Influencer influencer) {
        influencer.setActive(true);
        return influencerRepository.save(influencer);
    }

    @Override
    public Influencer updateInfluencer(Long id, Influencer influencer) {
        Influencer existing = getInfluencerById(id);
        existing.setName(influencer.getName());
        existing.setEmail(influencer.getEmail());
        return influencerRepository.save(existing);
    }

    @Override
    public Influencer getInfluencerById(Long id) {
        return influencerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Influencer not found"));
    }

    @Override
    public List<Influencer> getAllInfluencers() {
        return influencerRepository.findAll();
    }

    @Override
    public void deactivateInfluencer(Long id) {
        Influencer influencer = getInfluencerById(id);
        influencer.setActive(false);
        influencerRepository.save(influencer);
    }
}
