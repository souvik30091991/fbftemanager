package com.fteretriever.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Document(value="FTECount")
public class FteCount {
	
	@Id
	@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="_id")
	long id;
	String track;
	int fteCount;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public int getFteCount() {
		return fteCount;
	}
	public void setFteCount(int fteCount) {
		this.fteCount = fteCount;
	}
	
	

}
