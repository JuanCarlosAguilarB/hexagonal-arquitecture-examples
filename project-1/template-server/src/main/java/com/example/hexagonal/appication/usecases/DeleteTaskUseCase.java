package com.example.hexagonal.appication.usecases;

import com.example.hexagonal.domain.ports.in.DeleteTask;
import com.example.hexagonal.domain.ports.out.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteTaskUseCase implements DeleteTask {

    private final TaskRepository taskRepository;

    public DeleteTaskUseCase(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.delete(id);
    }
}
