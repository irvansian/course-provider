package com.eduneira.serverapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eduneira.serverapp.model.Registrant;

public interface IRegistrantRepository extends CrudRepository<Registrant, String> {

}
