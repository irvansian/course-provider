package com.eduneira.serverapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduneira.serverapp.model.exercises.SubPath;

@Repository
public interface SubPathRepository extends JpaRepository<SubPath, String>{
	
}
