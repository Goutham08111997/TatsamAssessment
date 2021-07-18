package com.example.demo.service;

import com.example.demo.model.Priority;
import com.example.demo.repo.PriorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriorityService {

    @Autowired
    PriorityRepository priorityRepository;

    public List<Priority> getPriorities() {
        return priorityRepository.findAll();
    }


    public String saveRequest(Priority priority) {
        if (null != priorityRepository.save(priority))
            return "Success";
        else
            return "Failed";
    }

    public  Priority getPriorityByUserId(int userId){

        return priorityRepository.findByUserId(userId);
    }
}
