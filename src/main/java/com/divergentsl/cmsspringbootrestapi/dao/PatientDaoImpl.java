package com.divergentsl.cmsspringbootrestapi.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import com.divergentsl.cmsspringbootrestapi.entity.Patient;

@Repository
public class PatientDaoImpl implements PatientDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Patient insert(Patient patient) {
		em.persist(patient);
		return patient;
	}

	@Override
	public List<Patient> findAll() {
		TypedQuery<Patient> query = em.createQuery("Select e from Patient e", Patient.class);
		List<Patient> patients = query.getResultList();
		return patients;
	}

	@Override
	public void remove(int id) {
		Patient patient =  em.find(Patient.class, id);
		if(patient != null) {
			em.remove(patient);
		}
	}

	@Override
	public void update(Patient patient) {
		em.merge(patient);
	}

	@Override
	public Patient find(int id) {
		Patient patient =  em.find(Patient.class, id);
		return patient;
	}
}
