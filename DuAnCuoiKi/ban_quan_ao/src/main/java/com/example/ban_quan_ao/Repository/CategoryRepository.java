package com.example.ban_quan_ao.Repository;

import com.example.ban_quan_ao.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    Optional<Category> findById(int id);

    List<Category> findByName(String name);

    List<Category> findByDescription(String description);

    Category save(Category category);

    void deleteById(int id);

    List<Category> findAll();

    boolean existsById(int id);
}
