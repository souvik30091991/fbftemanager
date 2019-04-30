package com.fteretriever.service;

import java.time.LocalDate;
import java.util.List;

import com.fteretriever.model.FTERecord;
import com.fteretriever.model.FteCount;

public interface FteRetrieverService {

	public List<FTERecord> findByWeekStDt(LocalDate fromDate);
	public List<FTERecord> findByDateaAndtrack(LocalDate fromDate,String track);
	public List<FTERecord> findBytrack(String track);
	public List<FTERecord> getAllData();
	public List<FTERecord> getDataByWeekStDt(LocalDate weekStDt);
	public List<FTERecord> findByDateRange(LocalDate weekStDt, LocalDate weekEdDt);
	public List<FTERecord> findByDateRangenTrack(LocalDate weekStDt, LocalDate weekEdDt, String track);
	public List<FteCount> findFteCountByTrack(String track);
}
