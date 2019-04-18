package com.feedbackrecorder.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.feedbackrecorder.app.model.FeedbackRecord;

public interface FeedbackRecorderRepo extends MongoRepository<FeedbackRecord,Long>{
}
