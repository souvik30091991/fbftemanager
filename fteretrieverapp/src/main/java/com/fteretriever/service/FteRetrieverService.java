package com.fteretriever.service;

import java.util.Date;
import java.util.List;

import com.fteretriever.model.FTERecord;

public interface FteRetrieverService {

	public abstract List<FTERecord> findByFromDate(Date fromDate);
	public abstract List<FTERecord> findByDateaAndtrack(Date fromDate,String track);
	public abstract List<FTERecord> findBytrack(String track);

}
