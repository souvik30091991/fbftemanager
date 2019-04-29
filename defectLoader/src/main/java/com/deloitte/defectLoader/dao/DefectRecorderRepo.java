package com.deloitte.defectLoader.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.deloitte.defectLoader.model.DefectRecord;

public interface DefectRecorderRepo extends MongoRepository<DefectRecord, Long> {
}
