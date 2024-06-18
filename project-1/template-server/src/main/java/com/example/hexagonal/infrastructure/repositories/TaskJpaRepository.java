package com.example.hexagonal.infrastructure.repositories;

import com.example.hexagonal.infrastructure.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskJpaRepository extends JpaRepository<TaskEntity, Long> {

}
