package com.ajcarpinello.Robins_Nest_preschool_management_platform.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "teacher_profiles")
public class TeacherProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private boolean isAdmin = false;

    @OneToOne(mappedBy = "teacher", cascade = CascadeType.ALL)
    private Classroom classroom;
}
