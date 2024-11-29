package com.Varcons_Tec.Photography_Website.Models;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
//this tag represents the below class as class managed by JPA (creates table of this name)
public class Image_Model {
    @Id
    //this tag, specifies that below var is primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //this tag specifies that how to generate primary key value
    private Long id;

    private String name;
    private String type;
    private String path;

    // Getters and setters
}
