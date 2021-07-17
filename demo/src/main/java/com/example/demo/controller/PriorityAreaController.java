package com.example.demo.controller;

import com.example.demo.model.PriorityArea;
import com.example.demo.service.PriorityAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/priorityAreas")
public class PriorityAreaController {

    @Autowired

    private PriorityAreaService priorityAreaService;

    @GetMapping()
    public List<String> getPriorityAreas(){
        return  priorityAreaService.getPriorityAreas();
    }

    @PostMapping("/area")
    public PriorityArea savePriorityArea(@RequestBody PriorityArea priorityArea){
        return priorityAreaService.savePriorityArea(priorityArea);
    }

}
