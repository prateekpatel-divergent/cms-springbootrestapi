
package com.divergentsl.cmsspringbootrestapi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import com.divergentsl.cmsspringbootrestapi.entity.Appoinment;

@Repository
public class AppoinmentDaoImpl implements AppoinmentDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Appoinment insert(Appoinment appoinment) {
		em.persist(appoinment);
		return appoinment;
	}

	@Override
	public List<Appoinment> findAll() {
		TypedQuery<Appoinment> query = em.createQuery("Select e from Appoinment e", Appoinment.class);
		List<Appoinment> appoinments = query.getResultList();
		return appoinments;
	}

	@Override
	public void remove(int id) {
		Appoinment appoinment =  em.find(Appoinment.class, id);
		if(appoinment != null) {
			em.remove(appoinment);
		}
	}

	@Override
	public void update(Appoinment appoinment) {
		em.merge(appoinment);
	}

	@Override
	public Appoinment find(int id) {
		Appoinment appoinment =  em.find(Appoinment.class, id);
		return appoinment;
	}

}
