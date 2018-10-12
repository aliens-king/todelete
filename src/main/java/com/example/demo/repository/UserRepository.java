package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

	@Query(value = "SELECT * FROM Users  WHERE userName = :userName and password = :password", nativeQuery = true)
	public Users loadUserByUserName(@Param("userName") String userName, @Param("password") String password);

}
