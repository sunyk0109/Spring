package com.example.demo.user;

import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author Sun_yk
 * @create 2021-03-13 14:22
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
