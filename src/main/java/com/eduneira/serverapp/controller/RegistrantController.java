package com.eduneira.serverapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eduneira.serverapp.model.Registrant;
import com.eduneira.serverapp.service.RegistrantService;

@RestController("registrants")
public class RegistrantController {
	
	@Autowired
	private RegistrantService registrantService;
	
	@PostMapping
	public void createNewRegistrant(@RequestBody Registrant registrant) {
		registrantService.addRegistrant(registrant);
	}
	
}
