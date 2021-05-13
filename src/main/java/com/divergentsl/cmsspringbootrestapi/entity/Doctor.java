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
@Table(name ="doctor")
@Setter
@Getter
@ToString
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	public Doctor() {
		super();
	}

	public Doctor(String name, String speciality, String contactno, int fee, String degree) {
		super();
		this.name = name;
		this.speciality = speciality;
		this.contactno = contactno;
		this.fee = fee;
		this.degree = degree;
	}

	@Column(name = "name")
	private String name;
	
	@Column(name = "speciality")
	private String speciality;
	
	@Column(name = "contact_no")
	private String contactno;
	
	@Column(name = "fee")
	private int fee;
	
	@Column(name = "degree")
	private String degree;
}
