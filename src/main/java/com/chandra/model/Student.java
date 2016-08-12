package com.chandra.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	String name;
	String department;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	String programtype;
	int yearjoined;
	int yearcomplete;
	public Student(Long id, String name, String department, String programtype, int yearjoined,
			int yearcomplete) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.programtype = programtype;
		this.yearjoined = yearjoined;
		this.yearcomplete = yearcomplete;
	}
	public Student() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getProgramtype() {
		return programtype;
	}
	public void setProgramtype(String programtype) {
		this.programtype = programtype;
	}
	public int getYearjoined() {
		return yearjoined;
	}
	public void setYearjoined(int yearjoined) {
		this.yearjoined = yearjoined;
	}
	public int getYearcomplete() {
		return yearcomplete;
	}
	public void setYearcomplete(int yearcomplete) {
		this.yearcomplete = yearcomplete;
	}
	

}
