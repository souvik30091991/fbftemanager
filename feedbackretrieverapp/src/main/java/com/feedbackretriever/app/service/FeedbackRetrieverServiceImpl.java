package com.feedbackretriever.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feedbackretriever.app.dao.FeedbackRetrieverRepo;
import com.feedbackretriever.app.model.FeedbackRecord;

@Service
public class FeedbackRetrieverServiceImpl implements FeedbackRetrieverService {

	@Autowired
	FeedbackRetrieverRepo repo;

	@Override
	public List<FeedbackRecord> getAllRecs() {
		
		return repo.findAll();
		
	}

}
