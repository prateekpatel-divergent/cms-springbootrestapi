package com.divergentsl.cmsspringbootrestapi.service;

import java.util.List;

import com.divergentsl.cmsspringbootrestapi.entity.Patient;

public interface PatientService {

	public Patient insertPatient(Patient patient);

	public Patient findPatient(int id);

	public List<Patient> findAllPatients();

	public void removePatient(int id);
	
	public void updatePatient(Patient patient);
}
