package com.randima.allocationservice.controller;

import com.randima.allocationservice.model.Allocation;
import com.randima.allocationservice.repository.AllocationRepository;
import com.randima.allocationservice.service.AllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
public class AllocationController {
    @Autowired
    AllocationService allocationService;

    @RequestMapping(value = "/allocation", method = RequestMethod.POST)
    public Allocation save(@RequestBody Allocation allocation){
        return allocationService.save(allocation);
    }

    @RequestMapping(value = "/allocation", method = RequestMethod.GET)
    public List<Allocation> getAllAllocations() {
        return allocationService.getAllAllocations();
    }

    @RequestMapping(value = "allocation/{id}", method = RequestMethod.GET)
    public List<Allocation> getAllocationByEmployeeId(@PathVariable Integer id) {
        return allocationService.getAllocationById(id);
    }

}
