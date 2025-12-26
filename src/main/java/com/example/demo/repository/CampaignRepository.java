package com.example.demo.repository;

import com.example.demo.model.Campaign;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {

    Optional<Campaign> findByCampaignName(String campaignName);
}
