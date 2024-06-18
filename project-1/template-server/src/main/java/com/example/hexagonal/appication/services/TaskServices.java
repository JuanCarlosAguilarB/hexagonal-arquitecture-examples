package com.example.hexagonal.appication.services;

import com.example.hexagonal.appication.usecases.CreateTaskUseCase;
import com.example.hexagonal.appication.usecases.DeleteTaskUseCase;
import com.example.hexagonal.appication.usecases.RetriveTaskUseCase;
import com.example.hexagonal.appication.usecases.UpdateTaskUseCase;
import com.example.hexagonal.domain.models.Task;
import com.example.hexagonal.domain.ports.in.CreateTask;
import com.example.hexagonal.domain.ports.in.DeleteTask;
import com.example.hexagonal.domain.ports.in.RetriveTask;
import com.example.hexagonal.domain.ports.in.UpdateTask;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskServices implements CreateTask, UpdateTask, RetriveTask, DeleteTask {

    private final CreateTaskUseCase createTaskUseCase;
    private final DeleteTaskUseCase deleteTaskUseCase;
    private final RetriveTaskUseCase retriveTaskUseCase;
    private final UpdateTaskUseCase updateTaskUseCase;


    public TaskServices(CreateTaskUseCase createTaskUseCase, DeleteTaskUseCase deleteTaskUseCase, RetriveTaskUseCase retriveTaskUseCase, UpdateTaskUseCase updateTaskUseCase) {
        this.createTaskUseCase = createTaskUseCase;
        this.deleteTaskUseCase = deleteTaskUseCase;
        this.retriveTaskUseCase = retriveTaskUseCase;
        this.updateTaskUseCase = updateTaskUseCase;
    }

    @Override
    public Task createTask(Task task) {
        return createTaskUseCase.createTask(task);
    }

    @Override
    public void deleteTask(Long id) {
        deleteTaskUseCase.deleteTask(id);
    }

    @Override
    public Optional<Task> getTaskById(Long id) {
        return retriveTaskUseCase.getTaskById(id);
    }

    @Override
    public Optional<Task> updateTask(Long id, Task task) {
        return updateTaskUseCase.updateTask(id, task);
    }
}
