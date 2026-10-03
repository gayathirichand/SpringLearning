package com.basics.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
	
	private String departmentName;
	private String departmentHead;
	public String getDepartmentName() {
		return departmentName;
	}
	
	@Value("CSE")
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentHead() {
		return departmentHead;
	}
	@Value("Priya Mathan")
	public void setDepartmentHead(String departmentHead) {
		this.departmentHead = departmentHead;
	}

	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", departmentHead=" + departmentHead + "]";
	}
	
	
	
}
