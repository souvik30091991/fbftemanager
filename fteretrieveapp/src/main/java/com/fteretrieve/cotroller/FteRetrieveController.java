package com.fteretrieve.cotroller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fteretrieve.dao.FteReteieveRepo;
import com.fteretrieve.dao.FteRetrieveRepoImpl;
import com.fteretrieve.model.FTERecord;
import com.fteretrieve.service.FteRetrieveService;
import com.fteretrieve.service.FteRetrieveServiceImpl;
import com.mongodb.BasicDBObject;


@RestController
@RequestMapping("/fetchData")
public class FteRetrieveController {
	
	/*@Autowired
	FteRetrieveService fteRetrieveController;*/
	@Autowired
	private FteReteieveRepo fteRepo;
	

	@RequestMapping("/byDate/")
	public List<FTERecord> getDataByDateRange(@RequestParam
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	Date fromDate) throws ParseException{
	
		List<FTERecord> fteRecords = this.fteRepo.findByFromDate(fromDate);
		return fteRecords ;
	}
	
	@RequestMapping("/byDatenTrack/")
	public List<FTERecord> getDataByDateRange(@RequestParam
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)Date fromDate,
			@RequestParam String track) throws ParseException{
		List<FTERecord> fteRecords = this.fteRepo.findByTrackAndFromDate(track, fromDate);
		return fteRecords ;
	} 

	@RequestMapping("/byTrack/")
	public List<FTERecord> getDataByDateRange(
			@RequestParam String track) throws ParseException{
		List<FTERecord> fteRecords = this.fteRepo.findByTrack(track);
		return fteRecords ;
	} 
}
