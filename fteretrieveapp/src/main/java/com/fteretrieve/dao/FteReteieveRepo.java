package com.fteretrieve.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fteretrieve.model.FTERecord;

@Repository
public interface FteReteieveRepo extends MongoRepository<FTERecord,Long> {
	public List<FTERecord> findByWeekStDt(Date weekStDt);
	public List<FTERecord> findByTrack(String track);
	public List<FTERecord> findByTrackAndWeekStDt(String track, Date weekStDt);
	public List<FTERecord> findByTrackOrWeekStDt(String track, Date weekStDt);
}
