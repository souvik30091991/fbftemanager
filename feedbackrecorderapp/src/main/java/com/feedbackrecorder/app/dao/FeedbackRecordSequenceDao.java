package com.feedbackrecorder.app.dao;

import com.feedbackrecorder.app.exceptions.FeedbackRecSequenceException;

public interface FeedbackRecordSequenceDao {

	long getNextFeedbackRecSequenceId(String key) throws FeedbackRecSequenceException;
}
