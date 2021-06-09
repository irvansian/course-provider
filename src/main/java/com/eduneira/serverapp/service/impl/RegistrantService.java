package com.eduneira.serverapp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduneira.serverapp.model.Registrant;
import com.eduneira.serverapp.repository.RegistrantRepository;

@Service
public class RegistrantService {
	
	@Autowired
	private RegistrantRepository registrantRepo;

	public List<Registrant> getAllRegistrants() {
		List<Registrant> registrants = new ArrayList<Registrant>();
		registrantRepo.findAll().forEach(registrants::add);
		return registrants;
	}
	
	public void addRegistrant(Registrant registrant) {
		registrantRepo.save(registrant);
	}
	
	public void getRegistrant(String id) {
		registrantRepo.findById(id);
	}
	
	public void deleteRegistrant(String id) {
		registrantRepo.deleteById(id);
	}
	

}
