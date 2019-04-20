package com.feedbackrecorder.app.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Employee")
public class Employee {

	@Id
	long id;
	long personnelNumber;
	
	public Employee() {}
	
	@PersistenceConstructor
	public Employee(long id,long personnelNumber) {
		super();
		this.id=id;
		this.personnelNumber=personnelNumber;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPersonnelNumber() {
		return personnelNumber;
	}

	public void setPersonnelNumber(long personnelNumber) {
		this.personnelNumber = personnelNumber;
	}

}
