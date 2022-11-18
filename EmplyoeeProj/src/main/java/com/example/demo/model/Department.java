package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class Department {
	private int departmentId;
	private String name;
	private int managerId;

	public Department() {

	}

	public Department(int departmentId, String name, int managerId) {
		this.departmentId = departmentId;
		this.name = name;
		this.managerId = managerId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	
	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Column(name = "manager_id", nullable = false)
	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

}
