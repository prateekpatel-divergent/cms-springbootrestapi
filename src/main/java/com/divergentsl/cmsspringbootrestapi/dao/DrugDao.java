package com.divergentsl.cmsspringbootrestapi.dao;

import java.util.List;

import com.divergentsl.cmsspringbootrestapi.entity.Drug;


public interface DrugDao {

	public List<Drug> findAll();

	public void remove(int id);

	public void update(Drug drug);

	public Drug find(int id);

	public Drug insert(Drug drug);
}
