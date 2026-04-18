package com.ajcarpinello.Robins_Nest_preschool_management_platform.repository;

import com.ajcarpinello.Robins_Nest_preschool_management_platform.entities.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepo extends JpaRepository<Long, Classroom> {
}
