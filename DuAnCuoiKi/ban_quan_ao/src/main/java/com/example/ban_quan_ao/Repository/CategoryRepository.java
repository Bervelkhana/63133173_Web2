package com.example.ban_quan_ao.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ban_quan_ao.Models.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    List<Category> findByName(String name);
    List<Category> findByDescription(String description);
}
