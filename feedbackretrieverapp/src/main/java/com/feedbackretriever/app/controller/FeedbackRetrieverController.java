package com.feedbackretriever.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.feedbackretriever.app.model.FeedbackRecord;
import com.feedbackretriever.app.service.FeedbackRetrieverService;

@RestController
@RequestMapping(path="/feedbackretriever")
@CrossOrigin
public class FeedbackRetrieverController {

	@Autowired
	FeedbackRetrieverService service;

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public List<FeedbackRecord> getAllFeedbackRecs() {
		return service.getAllRecs();

	}
}
