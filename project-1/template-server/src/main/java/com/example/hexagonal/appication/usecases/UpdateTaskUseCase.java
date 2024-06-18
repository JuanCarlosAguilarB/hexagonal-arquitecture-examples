package com.example.hexagonal.appication.usecases;

import com.example.hexagonal.domain.models.Task;
import com.example.hexagonal.domain.ports.in.UpdateTask;
import com.example.hexagonal.domain.ports.out.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UpdateTaskUseCase implements UpdateTask {

    private final TaskRepository taskRepository;

    public UpdateTaskUseCase(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Optional<Task> updateTask(Long id, Task task) {

        Optional<Task> existingTask = taskRepository.getTaskById(id);

        if (existingTask.isPresent()) {
//            Task updatedTask = existingTask.get();
//            updatedTask.setTitle(task.getTitle());
//            updatedTask.setDescription(task.getDescription());
            task.setId(id);
            return taskRepository.updateTask(task);
        }

        return Optional.empty();

    }
}
