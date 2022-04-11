package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
