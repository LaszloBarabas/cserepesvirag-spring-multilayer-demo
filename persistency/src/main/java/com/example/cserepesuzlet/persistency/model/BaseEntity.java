package com.example.cserepesuzlet.persistency.model;

import lombok.Data;
import java.io.Serializable;

@Data
public abstract class BaseEntity implements Serializable {
    String id;
}