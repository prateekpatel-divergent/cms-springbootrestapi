package com.divergentsl.cmsspringbootrestapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "appoinment")
@Setter
@Getter
@ToString
public class Appoinment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appointId;

	@Column(name = "patient_name")
	private String pname;

	@Column(name = "problem")
	private String problem;
	
	@Column(name = "appoinment_date")
	private String appoinmentDate;
	
	@Column(name = "current_date")
	private String currentDate;
	
	@ManyToOne(targetEntity = Doctor.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "doctor_id")
	private Doctor doctor;
	
}
