package com.abrhernandez.demo.repository;

import com.abrhernandez.demo.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends JpaRepository<Dog,Integer> {
}
