package com.divergentsl.cmsspringbootrestapi.dao;

import java.util.List;

import com.divergentsl.cmsspringbootrestapi.entity.Appoinment;

public interface AppoinmentDao {

	public List<Appoinment> findAll();

	public void remove(int id);

	public void update(Appoinment appoinment);

	public Appoinment find(int id);

	public Appoinment insert(Appoinment appoinment);
}
