package com.ajcarpinello.Robins_Nest_preschool_management_platform.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private TeacherProfile teacherProfile;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private GuardianProfile guardianProfile;

    // this method fires right before persisting a user, making sure the correct profile has been created
    @PrePersist
    public void validateProfile() {
        if (role == Role.TEACHER && teacherProfile == null) {
            throw new IllegalStateException("Teacher must have a TeacherProfile");
        }
        if (role == Role.GUARDIAN && guardianProfile == null) {
            throw new IllegalStateException("Parent must have a ParentProfile");
        }
    }
}
