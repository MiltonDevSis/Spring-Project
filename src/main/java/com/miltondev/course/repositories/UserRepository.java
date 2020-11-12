package com.miltondev.course.repositories;

import com.miltondev.course.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
