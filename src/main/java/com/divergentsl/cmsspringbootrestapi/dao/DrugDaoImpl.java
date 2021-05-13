package com.divergentsl.cmsspringbootrestapi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import com.divergentsl.cmsspringbootrestapi.entity.Drug;

@Repository
public class DrugDaoImpl implements DrugDao{

	@PersistenceContext
	private EntityManager em;

	@Override
	public Drug insert(Drug drug) {
		em.persist(drug);
		return drug;
	}

	@Override
	public List<Drug> findAll() {
		TypedQuery<Drug> query = em.createQuery("Select e from Drug e", Drug.class);
		List<Drug> drugs = query.getResultList();
		return drugs;
	}

	@Override
	public void remove(int id) {
		Drug drug =  em.find(Drug.class, id);
		if(drug != null) {
			em.remove(drug);
		}
	}

	@Override
	public void update(Drug drug) {
		em.merge(drug);
	}

	@Override
	public Drug find(int id) {
		Drug drug =  em.find(Drug.class, id);
		return drug;
	}
}
