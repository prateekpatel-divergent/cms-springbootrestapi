package com.divergentsl.cmsspringbootrestapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "prescription")
@Setter
@Getter
@ToString
public class PrescriptionAndNotes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "prescription")
	private String prescription;
	
	public PrescriptionAndNotes() {
		super();
	}

	public PrescriptionAndNotes(String prescription, String note, Doctor doctorId, Patient patientid) {
		super();
		this.prescription = prescription;
		this.note = note;
		this.doctorId = doctorId;
		this.patientid = patientid;
	}

	@Column(name = "note")
	private String note;
	
	@ManyToOne
	@JoinColumn(name = "doctor_Id", nullable = false)
	private Doctor doctorId;

	@ManyToOne
	@JoinColumn(name = "patient_Id")
	private Patient patientid;
}
