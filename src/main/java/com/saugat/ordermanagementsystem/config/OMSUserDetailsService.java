package com.saugat.ordermanagementsystem.config;

import com.saugat.ordermanagementsystem.model.User;
import com.saugat.ordermanagementsystem.model.UserRole;
import com.saugat.ordermanagementsystem.repo.UserRepo;
import com.saugat.ordermanagementsystem.repo.UserRoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OMSUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private UserRoleRepo userRoleRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("User detail is not found"));
        List<UserRole> userRoles = userRoleRepo.findByUserId(user.getId()).orElseThrow(() -> new UsernameNotFoundException("User role is not configured"));
        List<GrantedAuthority> authorityList = userRoles.stream().map( x-> new SimpleGrantedAuthority(x.getUserRole().getValue().toUpperCase())).collect(Collectors.toList());
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), authorityList );
    }
}

