package com.example.common.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.xml.internal.ws.developer.Serialization;
import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "user")
@Entity
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class User {

    @Id
    @Column(name = "u_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "u_name")
    private String name;

    @Column(name = "u_phone")
    private String phone;
}



