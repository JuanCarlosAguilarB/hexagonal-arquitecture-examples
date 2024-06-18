package com.example.hexagonal.domain.ports.in;

import com.example.hexagonal.domain.models.Task;

import java.util.Optional;

public interface UpdateTask {
    public Optional<Task> updateTask(Long id, Task task);
}
