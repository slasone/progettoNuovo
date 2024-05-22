package it.ms.api.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.ms.api.data.entity.Users;


public interface UserRepository extends JpaRepository<Users, Long> {

  public List<Users> findUsersByNome(String nome);
}