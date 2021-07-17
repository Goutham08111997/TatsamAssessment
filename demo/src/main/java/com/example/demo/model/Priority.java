package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Map;

@Entity
public class Priority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Map<String, PriorityData> priorityAreaMap;

    public Priority() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<String, PriorityData> getPriorityAreaMap() {
        return priorityAreaMap;
    }

    public void setPriorityAreaMap(Map<String, PriorityData> priorityAreaMap) {
        this.priorityAreaMap = priorityAreaMap;
    }
}
