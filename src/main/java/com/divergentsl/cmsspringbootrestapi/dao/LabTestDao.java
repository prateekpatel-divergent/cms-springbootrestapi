package com.divergentsl.cmsspringbootrestapi.dao;

import java.util.List;

import com.divergentsl.cmsspringbootrestapi.entity.LabTest;

public interface LabTestDao {
	
	public List<LabTest> findAll();

	public void remove(int id);

	public void update(LabTest labTest);

	public LabTest find(int id);

	public LabTest insert(LabTest labTest);
}
