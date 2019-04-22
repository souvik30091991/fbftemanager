package com.fterecorder.app.model;


import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "FTERecord")
public class FTERecord {

	@Transient
	public static final String SEQUENCE_NAME = "fterecord_seq";
	@Id
	long id;
	String track;
	int ftesPerRosterCount;
	int defectCount;
	int widgetCount;
	int ftesLoanedCount;
	int ptoCount;
	int ftesBorrowedCount;
	int ftesForPerformanceCount;
	int ftesForExtendedScenarioExecCount;
	int excessFteCount;
	int edtDetailsCount;
	int diQueriesCount;
	Date createDt;
	Date weekStDt;
	String note;
	Employee employee;
	
	public FTERecord() {
	}

	@PersistenceConstructor
	public FTERecord(long id, String track, int ftesPerRosterCount, int defectCount, int widgetCount,
			int ftesLoanedCount, int ptoCount, int ftesBorrowedCount, int ftesForPerformanceCount,
			int ftesForExtendedScenarioExecCount, int excessFteCount, int edtDetailsCount, int diQueriesCount,
			Date createDt, Date weekStDt, String note) {

		super();
		this.id = id;
		this.track = track;
		this.ftesPerRosterCount = ftesPerRosterCount;
		this.defectCount = defectCount;
		this.widgetCount = widgetCount;
		this.ftesLoanedCount = ftesLoanedCount;
		this.ptoCount = ptoCount;
		this.ftesBorrowedCount = ftesBorrowedCount;
		this.ftesForPerformanceCount = ftesForPerformanceCount;
		this.ftesForExtendedScenarioExecCount = ftesForExtendedScenarioExecCount;
		this.excessFteCount = excessFteCount;
		this.edtDetailsCount = edtDetailsCount;
		this.diQueriesCount = diQueriesCount;
		this.createDt = createDt;
		this.weekStDt = weekStDt;
		this.note = note;
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

	public int getFtesPerRosterCount() {
		return ftesPerRosterCount;
	}

	public void setFtesPerRosterCount(int ftesPerRosterCount) {
		this.ftesPerRosterCount = ftesPerRosterCount;
	}

	public int getDefectCount() {
		return defectCount;
	}

	public void setDefectCount(int defectCount) {
		this.defectCount = defectCount;
	}

	public int getWidgetCount() {
		return widgetCount;
	}

	public void setWidgetCount(int widgetCount) {
		this.widgetCount = widgetCount;
	}

	public int getFtesLoanedCount() {
		return ftesLoanedCount;
	}

	public void setFtesLoanedCount(int ftesLoanedCount) {
		this.ftesLoanedCount = ftesLoanedCount;
	}

	public int getPtoCount() {
		return ptoCount;
	}

	public void setPtoCount(int ptoCount) {
		this.ptoCount = ptoCount;
	}

	public int getFtesBorrowedCount() {
		return ftesBorrowedCount;
	}

	public void setFtesBorrowedCount(int ftesBorrowedCount) {
		this.ftesBorrowedCount = ftesBorrowedCount;
	}

	public int getFtesForPerformanceCount() {
		return ftesForPerformanceCount;
	}

	public void setFtesForPerformanceCount(int ftesForPerformanceCount) {
		this.ftesForPerformanceCount = ftesForPerformanceCount;
	}

	public int getFtesForExtendedScenarioExecCount() {
		return ftesForExtendedScenarioExecCount;
	}

	public void setFtesForExtendedScenarioExecCount(int ftesForExtendedScenarioExecCount) {
		this.ftesForExtendedScenarioExecCount = ftesForExtendedScenarioExecCount;
	}

	public int getExcessFteCount() {
		return excessFteCount;
	}

	public void setExcessFteCount(int excessFteCount) {
		this.excessFteCount = excessFteCount;
	}

	public int getEdtDetailsCount() {
		return edtDetailsCount;
	}

	public void setEdtDetailsCount(int edtDetailsCount) {
		this.edtDetailsCount = edtDetailsCount;
	}

	public int getDiQueriesCount() {
		return diQueriesCount;
	}

	public void setDiQueriesCount(int diQueriesCount) {
		this.diQueriesCount = diQueriesCount;
	}

	public Date getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public Date getWeekStDt() {
		return weekStDt;
	}

	public void setWeekStDt(Date weekStDt) {
		this.weekStDt = weekStDt;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
