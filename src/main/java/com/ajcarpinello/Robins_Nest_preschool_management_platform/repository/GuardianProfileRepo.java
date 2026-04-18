package com.ajcarpinello.Robins_Nest_preschool_management_platform.repository;

import com.ajcarpinello.Robins_Nest_preschool_management_platform.entities.GuardianProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuardianProfileRepo extends JpaRepository<Long, GuardianProfile> {
}
