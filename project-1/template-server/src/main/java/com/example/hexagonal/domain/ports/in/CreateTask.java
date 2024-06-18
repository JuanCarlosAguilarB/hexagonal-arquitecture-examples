package com.example.hexagonal.domain.ports.in;

import com.example.hexagonal.domain.models.Task;

public interface CreateTask {

    public Task createTask(Task task);
}
