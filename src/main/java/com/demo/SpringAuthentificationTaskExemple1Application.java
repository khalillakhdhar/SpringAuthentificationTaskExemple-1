package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.dao.TaskRepository;
import com.demo.entity.Task;

@SpringBootApplication
public class SpringAuthentificationTaskExemple1Application implements CommandLineRunner {

	@Autowired
	TaskRepository taskRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringAuthentificationTaskExemple1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		taskRepository.save(new Task("tache1"));
		taskRepository.save(new Task("tache2"));
		taskRepository.save(new Task("tache3"));
		
	}

}
