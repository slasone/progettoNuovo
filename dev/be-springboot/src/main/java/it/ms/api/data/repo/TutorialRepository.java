package it.ms.api.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.ms.api.data.entity.Users;


public interface TutorialRepository extends JpaRepository<Users, Long> {

  //List<users> findUsers(String )
}