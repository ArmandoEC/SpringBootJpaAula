package com.aulaSpring.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aulaSpring.aula.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
