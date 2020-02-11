package com.randima.allocationservice.repository;

import com.randima.allocationservice.model.Allocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AllocationRepository extends JpaRepository<Allocation, Integer> {
    List<Allocation> findAllByEmpId(Integer id);
}
