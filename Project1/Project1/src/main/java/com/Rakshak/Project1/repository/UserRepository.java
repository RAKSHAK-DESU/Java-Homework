package com.Rakshak.Project1.repository;

import com.Rakshak.Project1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    //Spring Data JPA will provide implementation for the basic DB queries
}
