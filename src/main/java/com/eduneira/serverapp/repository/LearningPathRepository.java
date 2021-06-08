package com.eduneira.serverapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduneira.serverapp.model.exercises.LearningPath;

@Repository
public interface LearningPathRepository extends JpaRepository<LearningPath, String> {

}
