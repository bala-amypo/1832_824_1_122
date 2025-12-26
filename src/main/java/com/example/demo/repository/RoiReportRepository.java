package com.example.demo.repository;

import com.example.demo.model.RoiReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoiRepository extends JpaRepository<RoiReport, Long> {
}
