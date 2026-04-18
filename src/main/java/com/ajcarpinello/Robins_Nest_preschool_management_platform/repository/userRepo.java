package com.ajcarpinello.Robins_Nest_preschool_management_platform.repository;

import com.ajcarpinello.Robins_Nest_preschool_management_platform.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<Long, User> {
}
