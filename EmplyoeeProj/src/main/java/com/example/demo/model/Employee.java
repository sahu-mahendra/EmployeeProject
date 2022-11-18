package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLYOEE")
public class Employee {
	private long id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String phoneNumber;
	private Date hireDate;
	private double Salary;
	private String managerId;
	private int departmentId;

	public Employee() {

	}

	public Employee(long id, String Firstname, String LastName, String emailId, String phoneNumber, Date HireDate,
			double Salary, String ManagerId, int DepartmentId, String FirstName, int PhoneNumber, String EmailId) {

		this.id = id;
		this.firstName = FirstName;
		this.lastName = LastName;
		this.emailId = EmailId;
		this.phoneNumber = phoneNumber;
		this.hireDate = HireDate;
		this.Salary = Salary;
		this.managerId = ManagerId;
		this.departmentId = DepartmentId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "first_name", nullable = false)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", nullable = false)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "email", nullable = false)
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "phone_number", nullable = false)
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "hire_date", nullable = false)
	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	@Column(name = "salary", nullable = false)
	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	@Column(name = "manager_id", nullable = false)
	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	@Column(name = "department_id", nullable = false)
	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

}
