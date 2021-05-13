package com.divergentsl.cmsspringbootrestapi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.divergentsl.cmsspringbootrestapi.entity.PrescriptionAndNotes;

@Repository
public class PrescriptionDaoImpl implements PrescriptionDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public PrescriptionAndNotes insert(PrescriptionAndNotes prescriptionAndNotes) {
		em.persist(prescriptionAndNotes);
		return prescriptionAndNotes;
	}

	@Override
	public List<PrescriptionAndNotes> findAll() {
		TypedQuery<PrescriptionAndNotes> query = em.createQuery("Select e from PrescriptionAndNotes e", PrescriptionAndNotes.class);
		List<PrescriptionAndNotes> PrescriptionAndNotess = query.getResultList();
		return PrescriptionAndNotess;
	}

	@Override
	public void remove(int id) {
		PrescriptionAndNotes PrescriptionAndNotes =  em.find(PrescriptionAndNotes.class, id);
		if(PrescriptionAndNotes != null) {
			em.remove(PrescriptionAndNotes);
		}
	}

	@Override
	public void update(PrescriptionAndNotes PrescriptionAndNotes) {
		em.merge(PrescriptionAndNotes);
	}

	@Override
	public PrescriptionAndNotes find(int id) {
		PrescriptionAndNotes PrescriptionAndNotes =  em.find(PrescriptionAndNotes.class, id);
		return PrescriptionAndNotes;
	}
}
