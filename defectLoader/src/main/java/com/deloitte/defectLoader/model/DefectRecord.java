package com.deloitte.defectLoader.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "DefectRecord")
public class DefectRecord {

	@Transient
	public static final String SEQUENCE_NAME = "defectrecord_seq";
	@Id
	long id;
	String track;
	String newJiraId;
	String comments;
	String secondLevelAnalysis;
	String devUpdates;
	String confirmationRequired;
	String widgetName;
	String key;
	String summary;
	String description;
	String components;
	String status;
	String priority;
	String resolution;
	String assignee;
	String reporter;
	String widgetId;
	String defectSeverity;
	String rootCauseCategory;
	String team;
	String cycle;
	String week;
	String phase;
	String loadDefect;
	String source;

	public String getLoadDefect() {
		return loadDefect;
	}

	public void setLoadDefect(String loadDefect) {
		this.loadDefect = loadDefect;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

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

	public String getNewJiraId() {
		return newJiraId;
	}

	public void setNewJiraId(String newJiraId) {
		this.newJiraId = newJiraId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getSecondLevelAnalysis() {
		return secondLevelAnalysis;
	}

	public void setSecondLevelAnalysis(String secondLevelAnalysis) {
		this.secondLevelAnalysis = secondLevelAnalysis;
	}

	public String getDevUpdates() {
		return devUpdates;
	}

	public void setDevUpdates(String devUpdates) {
		this.devUpdates = devUpdates;
	}

	public String getConfirmationRequired() {
		return confirmationRequired;
	}

	public void setConfirmationRequired(String confirmationRequired) {
		this.confirmationRequired = confirmationRequired;
	}

	public String getWidgetName() {
		return widgetName;
	}

	public void setWidgetName(String widgetName) {
		this.widgetName = widgetName;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getComponents() {
		return components;
	}

	public void setComponents(String components) {
		this.components = components;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getReporter() {
		return reporter;
	}

	public void setReporter(String reporter) {
		this.reporter = reporter;
	}

	public String getWidgetId() {
		return widgetId;
	}

	public void setWidgetId(String widgetId) {
		this.widgetId = widgetId;
	}

	public String getDefectSeverity() {
		return defectSeverity;
	}

	public void setDefectSeverity(String defectSeverity) {
		this.defectSeverity = defectSeverity;
	}

	public String getRootCauseCategory() {
		return rootCauseCategory;
	}

	public void setRootCauseCategory(String rootCauseCategory) {
		this.rootCauseCategory = rootCauseCategory;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getCycle() {
		return cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getPhase() {
		return phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}

	public String getPrioritySet() {
		return prioritySet;
	}

	public void setPrioritySet(String prioritySet) {
		this.prioritySet = prioritySet;
	}

	public String getSet() {
		return set;
	}

	public void setSet(String set) {
		this.set = set;
	}

	String prioritySet;
	String set;

	public DefectRecord() {
	}

	@PersistenceConstructor
	public DefectRecord(long id, String track, String newJiraId, String comments, String secondLevelAnalysis,
			String devUpdates, String confirmationRequired, String widgetName, String key, String summary,
			String description, String components, String status, String priority, String resolution, String assignee,
			String reporter, String widgetId, String defectSeverity, String rootCauseCategory, String team,
			String cycle, String week, String phase, String prioritySet, String loadDefect, String set) {
		super();
		this.id = id;
		this.track = track;
		this.newJiraId = newJiraId;
		this.comments = comments;
		this.secondLevelAnalysis = secondLevelAnalysis;
		this.devUpdates = devUpdates;
		this.confirmationRequired = confirmationRequired;
		this.widgetName = widgetName;
		this.key = key;
		this.summary = summary;
		this.description = description;
		this.components = components;
		this.status = status;
		this.priority = priority;
		this.resolution = resolution;
		this.assignee = assignee;
		this.reporter = reporter;
		this.widgetId = widgetId;
		this.defectSeverity = defectSeverity;
		this.rootCauseCategory = rootCauseCategory;
		this.team = team;
		this.cycle = cycle;
		this.week = week;
		this.phase = phase;
		this.prioritySet = prioritySet;
		this.loadDefect = loadDefect;
		this.set = set;
	}

}
