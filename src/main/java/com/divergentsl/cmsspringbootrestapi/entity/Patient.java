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
@Table(name = "patient")
@Setter
@Getter
@ToString
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	public Patient() {
		super();
	}

	public Patient(String name, int age, int weight, String gender, int contactNumber, String address) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.address = address;
	}

	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "weight")
	private int weight;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "contactno")
	private int contactNumber;
	
	@Column(name = "address")
	private String address;
}
