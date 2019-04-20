package com.feedbackretriever.app.service;

import java.util.List;

import com.feedbackretriever.app.model.FeedbackRecord;

public interface FeedbackRetrieverService {
	public List<FeedbackRecord> getAllRecs();
}
