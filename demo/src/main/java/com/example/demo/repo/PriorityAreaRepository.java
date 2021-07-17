package com.example.demo.repo;

import com.example.demo.model.PriorityArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriorityAreaRepository extends JpaRepository<PriorityArea,Integer> {

    public PriorityArea save(PriorityArea priorityArea);
}
