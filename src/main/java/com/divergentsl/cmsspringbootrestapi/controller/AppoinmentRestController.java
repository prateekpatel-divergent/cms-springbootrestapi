package com.divergentsl.cmsspringbootrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.divergentsl.cmsspringbootrestapi.entity.Appoinment;
import com.divergentsl.cmsspringbootrestapi.service.AppoinmentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path= "cms/appoinment", produces = "application/json")
public class AppoinmentRestController {

	@Autowired
	private AppoinmentService appoinmentService;
	
	@GetMapping("/")
	private ResponseEntity<List<Appoinment>> getAll(){
		log.debug("get all Appoinment");
		List<Appoinment> allAppoinments = appoinmentService.findAllAppoinments();
		return new ResponseEntity<>(allAppoinments, HttpStatus.OK);
	}
	
	@DeleteMapping("/{appoinmentId}")
	@ResponseStatus(HttpStatus.OK)
	private void delete(@PathVariable int appoinmentId) {
		appoinmentService.removeAppoinment(appoinmentId);
	}
	
	@GetMapping("/{appoinmentId}")
	private ResponseEntity<Appoinment> find(@PathVariable int appoinmentId){
		Appoinment appoinment = appoinmentService.findAppoinment(appoinmentId);
		if(appoinment != null) {
			return new ResponseEntity<Appoinment>(appoinment, HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	private void update(@RequestBody Appoinment appoinment) {
		appoinmentService.updateAppoinment(appoinment);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	private void insert(@RequestBody Appoinment appoinment) {
		appoinmentService.insertAppoinment(appoinment);
	}
}
