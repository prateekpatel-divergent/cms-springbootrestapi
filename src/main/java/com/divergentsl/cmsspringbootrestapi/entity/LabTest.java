package com.divergentsl.cmsspringbootrestapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "labtest")
@Setter
@Getter
@ToString
public class LabTest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "test")
	private String test;
	
	@Column(name = "rate")
	private int rate;
	
	public LabTest() {
		super();
	}

	public LabTest(String test, int rate, int patientid) {
		super();
		this.test = test;
		this.rate = rate;
		this.patientid = patientid;
	}

	@Column(name = "patientid")
	private int patientid;
	
	
}
