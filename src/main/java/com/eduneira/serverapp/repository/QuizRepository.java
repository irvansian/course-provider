package com.eduneira.serverapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduneira.serverapp.model.exercises.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, String>{
	
}
