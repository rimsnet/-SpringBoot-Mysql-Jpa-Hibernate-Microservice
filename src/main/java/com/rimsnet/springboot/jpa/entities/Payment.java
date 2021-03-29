package com.rimsnet.springboot.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {
	
	@Id
	@Column(name = "id", nullable = false, unique = true)
	private int id;
	private float salary;
	
	@Column(name="emp_id")
	private int empId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", salary=" + salary + ", empId=" + empId + "]";
	}
	
	
	
	

}
