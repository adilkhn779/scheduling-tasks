package com.example.schedulingtasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.schedulingtasks.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
