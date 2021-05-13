package com.divergentsl.cmsspringbootrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divergentsl.cmsspringbootrestapi.dao.PrescriptionDao;
import com.divergentsl.cmsspringbootrestapi.entity.PrescriptionAndNotes;

@Service
public class PresciptionServiceImpl implements PrescriptionService{

	@Autowired
	private PrescriptionDao prescriptionDao;

	@Transactional
	@Override
	public PrescriptionAndNotes insertPrescriptionAndNotes(PrescriptionAndNotes prescriptionAndNotes) {
		return (PrescriptionAndNotes)prescriptionDao.insert(prescriptionAndNotes);
	}

	@Transactional(readOnly = true)
	@Override
	public PrescriptionAndNotes findPrescriptionAndNotes(int id) {
		return prescriptionDao.find(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<PrescriptionAndNotes> findAllPrescriptionAndNotess() {
		return prescriptionDao.findAll();
	}

	@Transactional
	@Override
	public void removePrescriptionAndNotes(int id) {
		prescriptionDao.remove(id);
	}

	@Transactional
	@Override
	public void updatePrescriptionAndNotes(PrescriptionAndNotes prescriptionAndNotes) {
		prescriptionDao.update(prescriptionAndNotes);
	}
}
