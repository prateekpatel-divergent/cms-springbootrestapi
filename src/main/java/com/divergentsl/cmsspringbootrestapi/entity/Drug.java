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
@Table(name = "drug")
@Setter
@Getter
@ToString
public class Drug {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "rate")
	private int rate;

	public Drug() {
		super();
	}

	public Drug(String name, int rate) {
		super();
		this.name = name;
		this.rate = rate;
	}

}
