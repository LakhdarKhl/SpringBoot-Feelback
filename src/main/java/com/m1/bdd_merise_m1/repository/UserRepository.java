package com.m1.bdd_merise_m1.repository;

import com.m1.bdd_merise_m1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}