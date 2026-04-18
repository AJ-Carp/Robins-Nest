package com.ajcarpinello.Robins_Nest_preschool_management_platform.repository;

import com.ajcarpinello.Robins_Nest_preschool_management_platform.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Long, Student> {
}
