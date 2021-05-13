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

import com.divergentsl.cmsspringbootrestapi.entity.Doctor;
import com.divergentsl.cmsspringbootrestapi.service.DoctorService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path= "cms/doctor", produces = "application/json")
public class DoctorRestController {

	@Autowired
	private DoctorService doctorService;
	
	@GetMapping("/")
	private ResponseEntity<List<Doctor>> getAll(){
		log.debug("get all Doctor");
		List<Doctor> allDoctors = doctorService.findAllDoctors();
		return new ResponseEntity<>(allDoctors, HttpStatus.OK);
	}
	
	@DeleteMapping("/{doctorId}")
	@ResponseStatus(HttpStatus.OK)
	private void delete(@PathVariable int doctorId) {
		doctorService.removeDoctor(doctorId);
	}
	
	@GetMapping("/{doctorId}")
	private ResponseEntity<Doctor> find(@PathVariable int doctorId){
		Doctor doctor = doctorService.findDoctor(doctorId);
		if(doctor != null) {
			return new ResponseEntity<Doctor>(doctor, HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	private void update(@RequestBody Doctor doctor) {
		doctorService.updateDoctor(doctor);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	private void insert(@RequestBody Doctor doctor) {
		doctorService.insertDoctor(doctor);
	}
}
