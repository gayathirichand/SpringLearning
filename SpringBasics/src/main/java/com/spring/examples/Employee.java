package com.spring.examples;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String employeeName;
	private double salary;
	private int employeeId;
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
	@Value("priya")
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	@Value("12000")
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	@Value("1")
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", salary=" + salary + ", employeeId=" + employeeId + "]";
	}
	
	

}
