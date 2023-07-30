package com.Study.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Study.Course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
