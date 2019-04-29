package com.qa.Repository;

import com.qa.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    Task findById(Long id);

    @Override
    List<Task> findAll();
}
