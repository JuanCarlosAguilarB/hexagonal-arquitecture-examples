package com.example.hexagonal.appication.usecases;

import com.example.hexagonal.domain.models.Task;
import com.example.hexagonal.domain.ports.in.CreateTask;
import com.example.hexagonal.domain.ports.out.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateTaskUseCase implements CreateTask {

    private final TaskRepository taskRepository;


    public CreateTaskUseCase(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

}
