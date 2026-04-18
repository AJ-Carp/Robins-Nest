package com.ajcarpinello.Robins_Nest_preschool_management_platform.repository;

import com.ajcarpinello.Robins_Nest_preschool_management_platform.entities.Student;
import com.ajcarpinello.Robins_Nest_preschool_management_platform.entities.TeacherProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherProfileRepo extends JpaRepository<Long, TeacherProfile> {
}
