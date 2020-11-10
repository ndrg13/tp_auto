package com.projet.java.auto.repositories;

import com.projet.java.auto.entities.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface MarqueRepository extends JpaRepository<Marque, Integer> {
}
