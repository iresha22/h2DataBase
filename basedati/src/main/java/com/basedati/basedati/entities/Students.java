package com.basedati.basedati.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Students {
    // fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(unique = true)
    private String email;
}
