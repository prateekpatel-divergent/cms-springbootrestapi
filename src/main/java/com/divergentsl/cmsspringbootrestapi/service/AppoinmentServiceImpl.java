package com.divergentsl.cmsspringbootrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divergentsl.cmsspringbootrestapi.dao.AppoinmentDao;
import com.divergentsl.cmsspringbootrestapi.entity.Appoinment;

@Service
public class AppoinmentServiceImpl implements AppoinmentService{

	@Autowired
	private AppoinmentDao appoinmentDao;

	@Transactional
	@Override
	public Appoinment insertAppoinment(Appoinment appoinment) {
		return (Appoinment)appoinmentDao.insert(appoinment);
	}

	@Transactional(readOnly = true)
	@Override
	public Appoinment findAppoinment(int id) {
		return appoinmentDao.find(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Appoinment> findAllAppoinments() {
		return appoinmentDao.findAll();
	}

	@Transactional
	@Override
	public void removeAppoinment(int id) {
		appoinmentDao.remove(id);
	}

	@Transactional
	@Override
	public void updateAppoinment(Appoinment appoinment) {
		appoinmentDao.update(appoinment);
	}
}
