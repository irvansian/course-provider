package com.eduneira.serverapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduneira.serverapp.model.Registrant;

@Repository
public interface RegistrantRepository extends JpaRepository<Registrant, String> {

}
