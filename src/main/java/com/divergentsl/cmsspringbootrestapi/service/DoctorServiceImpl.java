package com.divergentsl.cmsspringbootrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divergentsl.cmsspringbootrestapi.dao.DoctorDao;
import com.divergentsl.cmsspringbootrestapi.entity.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	private DoctorDao doctorDao;

	@Transactional
	@Override
	public Doctor insertDoctor(Doctor doctor) {
		return (Doctor)doctorDao.insert(doctor);
	}

	@Transactional(readOnly = true)
	@Override
	public Doctor findDoctor(int id) {
		return doctorDao.find(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Doctor> findAllDoctors() {
		return doctorDao.findAll();
	}

	@Transactional
	@Override
	public void removeDoctor(int id) {
		doctorDao.remove(id);
	}

	@Transactional
	@Override
	public void updateDoctor(Doctor doctor) {
		doctorDao.update(doctor);
	}

}
