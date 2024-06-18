package com.example.hexagonal.domain.ports.in;

import com.example.hexagonal.domain.models.Task;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface RetriveTask {

    public Optional<Task> getTaskById(Long id);
}
