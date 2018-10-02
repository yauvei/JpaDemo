package com.jpa.test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.test.demo.model.Users;

public interface  UsersRepository extends JpaRepository<Users, Integer> {

}
