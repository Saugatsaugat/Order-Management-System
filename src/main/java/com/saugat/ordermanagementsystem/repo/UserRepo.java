package com.saugat.ordermanagementsystem.repo;

import com.saugat.ordermanagementsystem.model.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends AbstractRepo<User> {

   Optional<User> findByEmail(String email);
}
