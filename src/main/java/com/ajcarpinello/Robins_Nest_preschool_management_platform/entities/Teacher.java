package com.ajcarpinello.Robins_Nest_preschool_management_platform.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "teachers")
public class Teacher {

    @Id
    // IDENTITY lets the DB handle incrementation but prevents batch operations
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // wrapper class prevents a zero id, which can cause errors in the DB
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String phoneNumber;

    @OneToOne(mappedBy = "classroom", cascade = CascadeType.ALL)
    private Classroom classroom;
}
