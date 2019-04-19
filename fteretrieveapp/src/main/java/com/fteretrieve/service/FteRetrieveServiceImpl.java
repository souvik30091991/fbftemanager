package com.fteretrieve.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fteretrieve.dao.FteReteieveRepo;
import com.fteretrieve.model.FTERecord;

@Service
public class FteRetrieveServiceImpl implements FteRetrieveService{

	@Autowired
	 FteReteieveRepo fteRetieveRepo;

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
