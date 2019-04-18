package com.feedbackrecorder.app.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "FeedbackRecord")
public class FeedbackRecord {

	@Transient
	public static final String SEQUENCE_NAME = "feedbackrecord_seq";
	@Id
	long id;
	Date createDt;
	Employee employee;

	public FeedbackRecord() {
	}

	@PersistenceConstructor
	public FeedbackRecord(long id) {

		super();
		this.id = id;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
