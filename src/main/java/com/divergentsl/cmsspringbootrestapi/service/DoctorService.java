package com.divergentsl.cmsspringbootrestapi.service;

import java.util.List;

import com.divergentsl.cmsspringbootrestapi.entity.Doctor;

public interface DoctorService {

	public Doctor insertDoctor(Doctor doctor);

	public Doctor findDoctor(int id);

	public List<Doctor> findAllDoctors();

	public void removeDoctor(int id);
	
	public void updateDoctor(Doctor doctor);
}
