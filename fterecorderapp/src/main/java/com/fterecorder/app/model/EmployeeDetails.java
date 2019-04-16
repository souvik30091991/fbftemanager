package com.fterecorder.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="EmployeeDetails")
public class EmployeeDetails {
	
	@Id
	long empId;
	String name;
	String email;

	public EmployeeDetails() {}
	
	@PersistenceConstructor
	public EmployeeDetails(long empId,String name,String email) {
		super();
		this.empId=empId;
		this.name=name;
		this.email=email;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
