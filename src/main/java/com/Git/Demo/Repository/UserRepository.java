package com.Git.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Git.Demo.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
