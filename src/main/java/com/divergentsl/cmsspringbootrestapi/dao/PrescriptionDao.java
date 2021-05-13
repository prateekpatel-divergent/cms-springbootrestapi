package com.divergentsl.cmsspringbootrestapi.dao;

import java.util.List;

import com.divergentsl.cmsspringbootrestapi.entity.PrescriptionAndNotes;

public interface PrescriptionDao {

	public List<PrescriptionAndNotes> findAll();

	public void remove(int id);

	public void update(PrescriptionAndNotes prescriptionAndNotes);

	public PrescriptionAndNotes find(int id);

	public PrescriptionAndNotes insert(PrescriptionAndNotes prescriptionAndNotes);
}
