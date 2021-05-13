package com.divergentsl.cmsspringbootrestapi.service;

import java.util.List;

import com.divergentsl.cmsspringbootrestapi.entity.LabTest;

public interface LabTestService {

	public LabTest insertLabTest(LabTest labTest);

	public LabTest findLabTest(int id);

	public List<LabTest> findAllLabTests();

	public void removeLabTest(int id);
	
	public void updateLabTest(LabTest labTest);
}
