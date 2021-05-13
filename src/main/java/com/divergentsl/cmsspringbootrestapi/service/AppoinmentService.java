package com.divergentsl.cmsspringbootrestapi.service;

import java.util.List;

import com.divergentsl.cmsspringbootrestapi.entity.Appoinment;

public interface AppoinmentService {

	public Appoinment insertAppoinment(Appoinment appoinment);

	public Appoinment findAppoinment(int id);

	public List<Appoinment> findAllAppoinments();

	public void removeAppoinment(int id);
	
	public void updateAppoinment(Appoinment appoinment);
}
