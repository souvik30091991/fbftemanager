package com.fteretrieve.service;

import java.util.Date;
import java.util.List;

import com.fteretrieve.model.FTERecord;

public interface FteRetrieveService {

	public abstract List<FTERecord> findByFromDate(Date fromDate);
	public abstract List<FTERecord> findByDateaAndtrack(Date fromDate,String track);
	public abstract List<FTERecord> findBytrack(String track);

}
