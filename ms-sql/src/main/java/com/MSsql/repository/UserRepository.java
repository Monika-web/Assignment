package com.MSsql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MSsql.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
