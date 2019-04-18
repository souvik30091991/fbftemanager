package com.feedbackrecorder.app.dao;

import org.springframework.stereotype.Repository;

@Repository(value="feedbackrecorderimpl")
public abstract class FeedbackRecorderRepoImpl implements FeedbackRecorderRepo {

	// Custom methods that are not listed in FeedbackRecorderRepo(CRUD+MongoDB Repo) to be writen here
}
