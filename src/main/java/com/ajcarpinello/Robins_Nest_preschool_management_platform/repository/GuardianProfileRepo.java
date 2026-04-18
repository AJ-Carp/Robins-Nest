package com.ajcarpinello.Robins_Nest_preschool_management_platform.repository;

import com.ajcarpinello.Robins_Nest_preschool_management_platform.entity.GuardianProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuardianProfileRepo extends JpaRepository<Long, GuardianProfile> {
}
