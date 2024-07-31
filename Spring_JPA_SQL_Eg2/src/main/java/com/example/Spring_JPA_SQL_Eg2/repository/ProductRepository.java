package com.example.Spring_JPA_SQL_Eg2.repository;
import com.example.Spring_JPA_SQL_Eg2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
