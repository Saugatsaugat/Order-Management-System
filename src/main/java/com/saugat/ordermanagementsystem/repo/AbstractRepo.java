package com.saugat.ordermanagementsystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AbstractRepo<T> extends JpaRepository<T, Long> {
}
