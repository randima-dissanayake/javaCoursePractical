package com.randima.allocationservice.service;

import com.randima.allocationservice.model.Allocation;
import com.randima.allocationservice.repository.AllocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllocationServiceImpl implements AllocationService{

    @Autowired
    AllocationRepository allocationRepository;

    public Allocation save(Allocation allocation){
        return allocationRepository.save(allocation);
    }

    @Override
    public List<Allocation> getAllAllocations() {
        return allocationRepository.findAll();
    }

    @Override
    public List<Allocation> getAllocationById(Integer id) {
        return allocationRepository.findByEmpId(id);
    }
}
