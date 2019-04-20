package com.fteretriever.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fteretriever.dao.FteRetrieverRepo;
import com.fteretriever.model.FTERecord;

@Service
public class FteRetrieverServiceImpl implements FteRetrieverService{

	@Autowired
	 FteRetrieverRepo fteRetieveRepo;

	@Override
	public List<FTERecord> findByFromDate(Date fromDate) {
		List<FTERecord> fteRecords = this.fteRetieveRepo.findAll();
		return fteRecords;
	}

	@Override
	public List<FTERecord> findByDateaAndtrack(Date fromDate, String track) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FTERecord> findBytrack(String track) {
		// TODO Auto-generated method stub
		return null;
	}

}
