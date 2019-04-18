package com.feedbackrecorder.app.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.feedbackrecorder.app.model.FeedbackRecord;
import com.feedbackrecorder.app.service.FeedbackRecorderServiceImpl;

@RestController
@RequestMapping(path="/feedbackrecorder")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class FeedbackRecorderController {

	@Autowired
	FeedbackRecorderServiceImpl service;

	@RequestMapping(path = "/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean insertFeedbackRecord(@RequestBody FeedbackRecord[] records) {

		return service.insertRecords(Arrays.asList(records));

	}
	
	@GetMapping("/")
	public String test() {
		return "FeedbackRecorderApp service running on port 8080";

	}
}
