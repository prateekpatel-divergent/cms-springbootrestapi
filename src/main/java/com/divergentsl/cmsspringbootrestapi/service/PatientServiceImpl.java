package com.divergentsl.cmsspringbootrestapi.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divergentsl.cmsspringbootrestapi.dao.PatientDao;
import com.divergentsl.cmsspringbootrestapi.entity.Patient;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDao patientDao;

	@Transactional
	@Override
	public Patient insertPatient(Patient patient) {
		return (Patient)patientDao.insert(patient);
	}

	@Transactional(readOnly = true)
	@Override
	public Patient findPatient(int id) {
		return patientDao.find(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Patient> findAllPatients() {
		return patientDao.findAll();
	}

	@Transactional
	@Override
	public void removePatient(int id) {
		patientDao.remove(id);
	}

	@Transactional
	@Override
	public void updatePatient(Patient patient) {
		patientDao.update(patient);
	}
}
