package com.example.demo.controller;

import com.example.demo.model.Priority;
import com.example.demo.service.PriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PriorityController {


    @Autowired
    PriorityService priorityService;

    @GetMapping("/priorities")
    public List<Priority> getPriorities() {

        return priorityService.getPriorities();
    }

    @PostMapping()
    public ResponseEntity<String> createPriority(@RequestBody List<Priority> priorityList) {
        String response = priorityService.saveRequest(priorityList);

        if ("Success".equals(response))
            return new ResponseEntity<>(HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
    }

}
