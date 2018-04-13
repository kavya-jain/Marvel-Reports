package com.marvel.reports.model;

import javax.persistence.Table;

@Table(name = "user")
public class User {

	private int empId;
	@Override
	public String toString() {
		return "User [empId=" + empId + ", name=" + name + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	
}
