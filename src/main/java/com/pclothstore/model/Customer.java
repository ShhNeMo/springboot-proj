package com.pclothstore.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue
    private Long id;

    private String first_name;
    private String last_name;
    private LocalDate date_of_birth;

    @Column(unique = true)
    private String email;

}
