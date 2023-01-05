package com.example.cserepesuzlet.persistency.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class CserepesVirag extends BaseEntity {
    @Id
    private String id;
    private String name;
}
