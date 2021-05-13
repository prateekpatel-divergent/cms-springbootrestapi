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

import com.divergentsl.cmsspringbootrestapi.entity.LabTest;
import com.divergentsl.cmsspringbootrestapi.service.LabTestService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path= "cms/labtest", produces = "application/json")
public class LabTestRestController {

	@Autowired
	private LabTestService labTestService;
	
	@GetMapping("/")
	private ResponseEntity<List<LabTest>> getAll(){
		log.debug("get all LabTest");
		List<LabTest> allLabTests = labTestService.findAllLabTests();
		return new ResponseEntity<>(allLabTests, HttpStatus.OK);
	}
	
	@DeleteMapping("/{labTestId}")
	@ResponseStatus(HttpStatus.OK)
	private void delete(@PathVariable int labTestId) {
		labTestService.removeLabTest(labTestId);
	}
	
	@GetMapping("/{labTestId}")
	private ResponseEntity<LabTest> find(@PathVariable int labTestId){
		LabTest labTest = labTestService.findLabTest(labTestId);
		if(labTest != null) {
			return new ResponseEntity<LabTest>(labTest, HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	private void update(@RequestBody LabTest labTest) {
		labTestService.updateLabTest(labTest);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	private void insert(@RequestBody LabTest labTest) {
		labTestService.insertLabTest(labTest);
	}
}
