package com.ajcarpinello.Robins_Nest_preschool_management_platform.service;

import com.ajcarpinello.Robins_Nest_preschool_management_platform.entity.CustomUserDetails;
import com.ajcarpinello.Robins_Nest_preschool_management_platform.entity.User;
import com.ajcarpinello.Robins_Nest_preschool_management_platform.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
        return new CustomUserDetails(user);
    }
}
