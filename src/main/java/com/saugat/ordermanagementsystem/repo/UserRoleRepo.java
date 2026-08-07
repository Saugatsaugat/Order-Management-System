package com.saugat.ordermanagementsystem.repo;

import com.saugat.ordermanagementsystem.model.UserRole;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRoleRepo extends AbstractRepo<UserRole>{

    Optional<List<UserRole>> findByUserId(long id);
}
