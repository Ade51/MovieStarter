package com.example.MovieStarter.repositories;

import com.example.MovieStarter.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAllByEmail(String email);

    User findByEmail(String email);
}
