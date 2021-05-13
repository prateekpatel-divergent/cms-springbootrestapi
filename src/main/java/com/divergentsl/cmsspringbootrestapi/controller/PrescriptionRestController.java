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

import com.divergentsl.cmsspringbootrestapi.entity.PrescriptionAndNotes;
import com.divergentsl.cmsspringbootrestapi.service.PrescriptionService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path= "cms/prescription", produces = "application/json")
public class PrescriptionRestController {

	@Autowired
	private PrescriptionService prescriptionService;
	
	@GetMapping("/")
	private ResponseEntity<List<PrescriptionAndNotes>> getAll(){
		log.debug("get all Prescription");
		List<PrescriptionAndNotes> allPrescriptions = prescriptionService.findAllPrescriptionAndNotess();
		return new ResponseEntity<>(allPrescriptions, HttpStatus.OK);
	}
	
	@DeleteMapping("/{prescriptionId}")
	@ResponseStatus(HttpStatus.OK)
	private void delete(@PathVariable int prescriptionId) {
		prescriptionService.removePrescriptionAndNotes(prescriptionId);
	}
	
	@GetMapping("/{prescriptionId}")
	private ResponseEntity<PrescriptionAndNotes> find(@PathVariable int prescriptionId){
		PrescriptionAndNotes prescription = prescriptionService.findPrescriptionAndNotes(prescriptionId);
		if(prescription != null) {
			return new ResponseEntity<PrescriptionAndNotes>(prescription, HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	private void update(@RequestBody PrescriptionAndNotes prescriptionAndNotes) {
		prescriptionService.updatePrescriptionAndNotes(prescriptionAndNotes);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	private void insert(@RequestBody PrescriptionAndNotes prescriptionAndNotes) {
		prescriptionService.insertPrescriptionAndNotes(prescriptionAndNotes);
	}
}
