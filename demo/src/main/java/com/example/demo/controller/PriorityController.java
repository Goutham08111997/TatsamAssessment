package com.example.demo.controller;

import com.example.demo.model.Priority;
import com.example.demo.service.PriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PriorityController {


    @Autowired
    PriorityService priorityService;

    @PostMapping("users/{id}/priority")
    public ResponseEntity<String> createPriority(@PathVariable int id, @RequestBody Priority priority) {
        priority.setUserId(id);

        if (null == priorityService.getPriorityByUserId(priority.getUserId())) {
            String response = priorityService.saveRequest(priority);

            if ("Success".equals(response))
                return new ResponseEntity<>(HttpStatus.OK);
            else
                return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        } else {
            return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);
        }

    }
}