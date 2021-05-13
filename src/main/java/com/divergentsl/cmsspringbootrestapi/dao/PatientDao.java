package com.divergentsl.cmsspringbootrestapi.dao;

import java.util.List;

import com.divergentsl.cmsspringbootrestapi.entity.Patient;

public interface PatientDao {
	
	public List<Patient> findAll();

	public void remove(int id);

	public void update(Patient patient);

	public Patient find(int id);

	public Patient insert(Patient patient);
}
