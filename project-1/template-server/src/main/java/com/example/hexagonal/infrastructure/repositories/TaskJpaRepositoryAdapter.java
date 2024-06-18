package com.example.hexagonal.infrastructure.repositories;

import com.example.hexagonal.domain.models.Task;
import com.example.hexagonal.domain.ports.out.TaskRepository;
import com.example.hexagonal.infrastructure.entities.TaskEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class TaskJpaRepositoryAdapter implements TaskRepository {

    private final TaskJpaRepository taskJpaRepository;

    public TaskJpaRepositoryAdapter(TaskJpaRepository taskJpaRepository) {
        this.taskJpaRepository = taskJpaRepository;
    }


    @Override
    public void delete(Long id) {
        taskJpaRepository.deleteById(id);
    }

    @Override
    public Task save(Task task) {
        TaskEntity taskEntity = TaskEntity
                .builder()
//                .id(task.getId())
                .title(task.getTitle())
                // ...
                .build();

        TaskEntity savedTaskEntity = taskJpaRepository.save(taskEntity);
        return Task.builder()
                .id(savedTaskEntity.getId())
                .title(savedTaskEntity.getTitle())
                // ...
                .build();
    }

    @Override
    public Optional<Task> getTaskById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Task> updateTask(Task task) {
        return Optional.empty();
    }
}
