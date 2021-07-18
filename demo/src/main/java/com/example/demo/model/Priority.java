package com.example.demo.model;

import com.vladmihalcea.hibernate.type.json.JsonType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Map;

@Entity
@TypeDef(name = "json", typeClass = JsonType.class)
public class Priority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int userId;

    @Type(type = "json")
    @Column(columnDefinition = "json")

    private Map<String, PriorityData> priorityAreaMap;

    public Priority() {
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
