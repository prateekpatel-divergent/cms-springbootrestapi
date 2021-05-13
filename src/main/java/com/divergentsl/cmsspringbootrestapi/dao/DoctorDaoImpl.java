package com.divergentsl.cmsspringbootrestapi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import com.divergentsl.cmsspringbootrestapi.entity.Doctor;


@Repository
public class DoctorDaoImpl implements DoctorDao{

	@PersistenceContext
	private EntityManager em;

	@Override
	public Doctor insert(Doctor doctor) {
		em.persist(doctor);
		return doctor;
	}

	@Override
	public List<Doctor> findAll() {
		TypedQuery<Doctor> query = em.createQuery("Select e from Doctor e", Doctor.class);
		List<Doctor> doctors = query.getResultList();
		return doctors;
	}

	@Override
	public void remove(int id) {
		Doctor doctor =  em.find(Doctor.class, id);
		if(doctor != null) {
			em.remove(doctor);
		}
	}

	@Override
	public void update(Doctor doctor) {
		em.merge(doctor);
	}

	@Override
	public Doctor find(int id) {
		Doctor doctor =  em.find(Doctor.class, id);
		return doctor;
	}



}
