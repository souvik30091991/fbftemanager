package com.feedbackrecorder.app.service;

import java.util.List;

import com.feedbackrecorder.app.model.FeedbackRecord;

public interface FeedbackRecorderService {
	public boolean insertRecords(List<FeedbackRecord> records);
}
