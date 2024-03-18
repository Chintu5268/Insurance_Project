package com.insurance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstname;
	private String lastName;
	private String city;

	public Employee() {

		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String firstname, String lastName, String city) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
