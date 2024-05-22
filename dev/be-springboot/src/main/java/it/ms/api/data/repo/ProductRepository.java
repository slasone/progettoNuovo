package it.ms.api.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.ms.api.data.entity.Products;


public interface ProductRepository extends JpaRepository<Products, Long> {

  public List<Products> findProductsByName(String nome);
}