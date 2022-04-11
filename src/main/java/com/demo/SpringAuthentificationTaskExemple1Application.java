package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.dao.TaskRepository;
import com.demo.entity.AppRole;
import com.demo.entity.AppUser;
import com.demo.entity.Task;
import com.demo.service.AccountService;

@SpringBootApplication
public class SpringAuthentificationTaskExemple1Application implements CommandLineRunner {

	@Autowired
	TaskRepository taskRepository;
	@Autowired
	AccountService apiService;
	public static void main(String[] args) {
		SpringApplication.run(SpringAuthentificationTaskExemple1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		taskRepository.save(new Task("tache1"));
		taskRepository.save(new Task("tache2"));
		taskRepository.save(new Task("tache3"));
		apiService.saveUser(new AppUser("admin", "adminpass", 1, null));
		apiService.saveUser(new AppUser("user", "userpass", 1, null));
		apiService.saveRole(new AppRole("ADMIN"));
		apiService.saveRole(new AppRole("USER"));
		apiService.addRoleToUser("admin", "ADMIN");
		apiService.addRoleToUser("user", "USER");
	}

}
