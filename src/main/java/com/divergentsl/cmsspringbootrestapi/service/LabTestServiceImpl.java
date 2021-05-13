package com.divergentsl.cmsspringbootrestapi.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divergentsl.cmsspringbootrestapi.dao.LabTestDao;
import com.divergentsl.cmsspringbootrestapi.entity.LabTest;

@Service
public class LabTestServiceImpl implements LabTestService {

	@Autowired
	private LabTestDao labTestDao;
	
	@Transactional
	@Override
	public LabTest insertLabTest(LabTest labTest) {
		return (LabTest)labTestDao.insert(labTest);
	}

	@Transactional(readOnly = true)
	@Override
	public LabTest findLabTest(int id) {
		return labTestDao.find(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<LabTest> findAllLabTests() {
		return labTestDao.findAll();
	}

	@Transactional
	@Override
	public void removeLabTest(int id) {
		labTestDao.remove(id);
	}

	@Transactional
	@Override
	public void updateLabTest(LabTest labTest) {
		labTestDao.update(labTest);
	}
}
