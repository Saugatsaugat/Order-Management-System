package com.saugat.ordermanagementsystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractRepo<T> implements JpaRepository<T, Long> {
}
