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
	int rating;
	String feedbackTxt;
	String suggestion;

	public FeedbackRecord() {
	}

	@PersistenceConstructor
	public FeedbackRecord(long id, String feedbackTxt, String suggestion) {

		super();
		this.id = id;
		this.feedbackTxt = feedbackTxt;
		this.suggestion = suggestion;

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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getFeedbackTxt() {
		return feedbackTxt;
	}

	public void setFeedbackTxt(String feedbackTxt) {
		this.feedbackTxt = feedbackTxt;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

}
