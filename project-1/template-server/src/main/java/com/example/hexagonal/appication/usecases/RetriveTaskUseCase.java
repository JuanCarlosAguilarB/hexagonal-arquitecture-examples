package com.example.hexagonal.appication.usecases;

import com.example.hexagonal.domain.models.Task;
import com.example.hexagonal.domain.ports.in.RetriveTask;
import com.example.hexagonal.domain.ports.out.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RetriveTaskUseCase implements RetriveTask {

    private TaskRepository taskRepository;

    public RetriveTaskUseCase(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Optional<Task> getTaskById(Long id) {
        return taskRepository.getTaskById(id);
    }
}
