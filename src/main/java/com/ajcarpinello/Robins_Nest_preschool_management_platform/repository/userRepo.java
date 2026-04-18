package com.ajcarpinello.Robins_Nest_preschool_management_platform.repository;

import com.ajcarpinello.Robins_Nest_preschool_management_platform.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<Long, User> {
}
