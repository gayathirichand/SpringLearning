package com.basics.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String employeeName;
	private double salary;
	private int employeeId;
	
	private Address address;


	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		super();
	}

	public Employee(String employeeName, double salary, int employeeId) {
		super();
		this.employeeName = employeeName;
		this.salary = salary;
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	@Value("${employee.name}")
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	@Value("${employee.salary}")
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	@Value("${employee.empId}")

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", salary=" + salary + ", employeeId=" + employeeId
				+ ", address=" + address + "]";
	}

}
