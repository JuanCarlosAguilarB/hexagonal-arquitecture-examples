package com.example.hexagonal.domain.ports.out;

import com.example.hexagonal.domain.models.Task;

import java.util.Optional;

public interface TaskRepository {

    public void delete(Long id);
    public Task save(Task task);
    public Optional<Task> getTaskById(Long id);
    public Optional<Task> updateTask(Task task);

}
