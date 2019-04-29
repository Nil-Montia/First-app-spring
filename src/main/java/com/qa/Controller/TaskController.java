package com.qa.Controller;

import com.qa.Repository.TaskRepository;
import com.qa.model.Task;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task/")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public void create(@RequestBody Task task) {
        taskRepository.saveAndFlush(task);
    }

    @RequestMapping(value = "update/{id}", method = RequestMethod.POST)
    public void update(@PathVariable Long id, @RequestBody Task task) {
        Task existingTask = taskRepository.findOne(id);
        task.setId(id);
        BeanUtils.copyProperties(task, existingTask);
        taskRepository.saveAndFlush(task);
    }

    @RequestMapping(value = "get/{id}", method = RequestMethod.GET)
    public Task retrieve(@PathVariable Long id) {
        return taskRepository.findById(id);
    }

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Task> retrieve() {
        return taskRepository.findAll();
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        taskRepository.delete(id);
    }


}
