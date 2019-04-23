package com.feedbackretriever.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.feedbackretriever.app.model.FeedbackRecord;

public interface FeedbackRetrieverRepo extends MongoRepository<FeedbackRecord,Long>{
}
