package com.divergentsl.cmsspringbootrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divergentsl.cmsspringbootrestapi.dao.DrugDao;
import com.divergentsl.cmsspringbootrestapi.entity.Drug;
import com.divergentsl.cmsspringbootrestapi.entity.Drug;


@Service
public class DrugServiceImpl implements DrugService{
	
	@Autowired
	private DrugDao drugDao;

	@Transactional
	@Override
	public Drug insertDrug(Drug drug) {
		return (Drug)drugDao.insert(drug);
	}

	@Transactional(readOnly = true)
	@Override
	public Drug findDrug(int id) {
		return drugDao.find(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Drug> findAllDrugs() {
		return drugDao.findAll();
	}

	@Transactional
	@Override
	public void removeDrug(int id) {
		drugDao.remove(id);
	}

	@Transactional
	@Override
	public void updateDrug(Drug drug) {
		drugDao.update(drug);
	}
}
