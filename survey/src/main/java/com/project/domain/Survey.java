package com.project.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import javax.annotation.processing.Generated;
import java.util.UUID;

@Entity
public class Survey {

    @Id
    @GeneratedValue
    private UUID id;


}
