package com.feedbackrecorder.app.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feedbackrecorder.app.dao.FeedbackRecordSequenceDao;
import com.feedbackrecorder.app.dao.FeedbackRecorderRepo;
import com.feedbackrecorder.app.model.FeedbackRecord;

@Service
public class FeedbackRecorderServiceImpl implements FeedbackRecorderService {

	private static final String FEEDBACKREC_SEQ_KEY = "feedbackrec";

	@Autowired
	FeedbackRecorderRepo repo;

	@Autowired
	FeedbackRecordSequenceDao seq;

	@Override
	public boolean insertRecords(List<FeedbackRecord> records) {

		records.forEach(r -> {
			r.setId(seq.getNextFeedbackRecSequenceId(FEEDBACKREC_SEQ_KEY));
			r.setCreateDt(new Date());
		});

		try {
			repo.saveAll(records);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
