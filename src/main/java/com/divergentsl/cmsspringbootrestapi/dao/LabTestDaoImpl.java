package com.divergentsl.cmsspringbootrestapi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import com.divergentsl.cmsspringbootrestapi.entity.LabTest;

@Repository
public class LabTestDaoImpl implements LabTestDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public LabTest insert(LabTest labTest) {
		em.persist(labTest);
		return labTest;
	}

	@Override
	public List<LabTest> findAll() {
		TypedQuery<LabTest> query = em.createQuery("Select e from LabTest e", LabTest.class);
		List<LabTest> labTests = query.getResultList();
		return labTests;
	}

	@Override
	public void remove(int id) {
		LabTest LabTest =  em.find(LabTest.class, id);
		if(LabTest != null) {
			em.remove(LabTest);
		}
	}

	@Override
	public void update(LabTest labTest) {
		em.merge(labTest);
	}

	@Override
	public LabTest find(int id) {
		LabTest labTest =  em.find(LabTest.class, id);
		return labTest;
	}
}
