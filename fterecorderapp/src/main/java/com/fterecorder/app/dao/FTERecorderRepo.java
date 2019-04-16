package com.fterecorder.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fterecorder.app.model.FTERecord;

public interface FTERecorderRepo extends MongoRepository<FTERecord,Long>{
}
