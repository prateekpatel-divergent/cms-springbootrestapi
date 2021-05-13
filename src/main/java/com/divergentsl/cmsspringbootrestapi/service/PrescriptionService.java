package com.divergentsl.cmsspringbootrestapi.service;

import java.util.List;

import com.divergentsl.cmsspringbootrestapi.entity.PrescriptionAndNotes;

public interface PrescriptionService {
	
	public PrescriptionAndNotes insertPrescriptionAndNotes(PrescriptionAndNotes prescriptionAndNotes);

	public PrescriptionAndNotes findPrescriptionAndNotes(int id);

	public List<PrescriptionAndNotes> findAllPrescriptionAndNotess();

	public void removePrescriptionAndNotes(int id);
	
	public void updatePrescriptionAndNotes(PrescriptionAndNotes prescriptionAndNotes);
}
