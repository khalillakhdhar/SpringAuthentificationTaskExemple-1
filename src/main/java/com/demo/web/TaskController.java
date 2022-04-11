package com.demo.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dao.TaskRepository;
import com.demo.entity.Task;

@RestController
@RequestMapping("tasks")
public class TaskController {
@Autowired
TaskRepository taskRepository;
@GetMapping
public List<Task> getTasks()
{
return taskRepository.findAll();	
}
@PostMapping
public Task addTask(@Valid @RequestBody Task task)
{
return taskRepository.save(task);

}


}
