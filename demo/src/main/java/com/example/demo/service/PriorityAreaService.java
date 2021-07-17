package com.example.demo.service;

import com.example.demo.model.PriorityArea;
import com.example.demo.repo.PriorityAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PriorityAreaService {

    @Autowired
    private PriorityAreaRepository priorityAreaRepository;

    public List<String> getPriorityAreas(){
        return priorityAreaRepository.findAll().stream().map(x->x.getAreaName()).collect(Collectors.toList());
    }

    public PriorityArea savePriorityArea(PriorityArea priorityArea){
        return priorityAreaRepository.save(priorityArea);
    }
}
