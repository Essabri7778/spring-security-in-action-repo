package com.essabri.ssiach6.dao;

import com.essabri.ssiach6.bo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


/**
 * @author FZ.ESSABRI
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findUserByUsername(String username);
}
