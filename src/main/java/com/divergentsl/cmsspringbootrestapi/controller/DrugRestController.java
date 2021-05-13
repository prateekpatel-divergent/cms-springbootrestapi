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

import com.divergentsl.cmsspringbootrestapi.entity.Drug;
import com.divergentsl.cmsspringbootrestapi.service.DrugService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path= "cms/drug", produces = "application/json")
public class DrugRestController {

	@Autowired
	private DrugService drugService;
	
	@GetMapping("/")
	private ResponseEntity<List<Drug>> getAll(){
		log.debug("get all Drug");
		List<Drug> allDrugs = drugService.findAllDrugs();
		return new ResponseEntity<>(allDrugs, HttpStatus.OK);
	}
	
	@DeleteMapping("/{drugId}")
	@ResponseStatus(HttpStatus.OK)
	private void delete(@PathVariable int drugId) {
		drugService.removeDrug(drugId);
	}
	
	@GetMapping("/{drugId}")
	private ResponseEntity<Drug> find(@PathVariable int drugId){
		Drug drug = drugService.findDrug(drugId);
		if(drug != null) {
			return new ResponseEntity<Drug>(drug, HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	private void update(@RequestBody Drug drug) {
		drugService.updateDrug(drug);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	private void insert(@RequestBody Drug drug) {
		drugService.insertDrug(drug);
	}
}
