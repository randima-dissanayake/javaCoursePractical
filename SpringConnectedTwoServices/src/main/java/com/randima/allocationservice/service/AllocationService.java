package com.randima.allocationservice.service;

import com.randima.allocationservice.model.Allocation;

import java.util.List;

public interface AllocationService {
    Allocation save(Allocation allocation);
    List<Allocation> getAllAllocations();
    List<Allocation> getAllocationById(Integer id);
}
