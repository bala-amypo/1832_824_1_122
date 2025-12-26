package com.example.demo.service;

import java.util.List;

public interface RoiService {

    Double calculateRoi(Long discountCodeId);

    List<Double> getAllRoiReports();
}
