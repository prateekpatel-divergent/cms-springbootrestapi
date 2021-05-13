package com.divergentsl.cmsspringbootrestapi.service;

import java.util.List;

import com.divergentsl.cmsspringbootrestapi.entity.Drug;

public interface DrugService {
	
	public Drug insertDrug(Drug drug);

	public Drug findDrug(int id);

	public List<Drug> findAllDrugs();

	public void removeDrug(int id);
	
	public void updateDrug(Drug drug);
}
