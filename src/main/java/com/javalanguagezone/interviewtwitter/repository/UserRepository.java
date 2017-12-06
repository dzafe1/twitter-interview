package com.javalanguagezone.interviewtwitter.repository;

import com.javalanguagezone.interviewtwitter.domain.User;
import com.javalanguagezone.interviewtwitter.service.dto.UserInfoDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
  User findOneByUsername(String user);

  @Query("SELECT new com.javalanguagezone.interviewtwitter.service.dto.UserInfoDTO(5) " +
    "FROM Tweet t " +
    "WHERE t.author.username=:username")
  List<UserInfoDTO> getUserInfo(@Param("username") String username);
}
