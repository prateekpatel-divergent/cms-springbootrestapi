package com.divergentsl.cmsspringbootrestapi.dao;

import java.util.List;

import com.divergentsl.cmsspringbootrestapi.entity.Doctor;

public interface DoctorDao {

	public List<Doctor> findAll();

	public void remove(int id);

	public void update(Doctor doctor);

	public Doctor find(int id);

	public Doctor insert(Doctor doctor);

}
