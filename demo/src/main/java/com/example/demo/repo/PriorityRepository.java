package com.example.demo.repo;

import com.example.demo.model.Priority;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PriorityRepository extends JpaRepository<Priority, Integer> {


    List<Priority> save(List<Priority> priorityList);
}
