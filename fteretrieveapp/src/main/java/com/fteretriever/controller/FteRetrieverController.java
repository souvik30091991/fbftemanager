package com.fteretriever.controller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fteretriever.dao.FteRetrieverRepo;
import com.fteretriever.model.FTERecord;


@RestController
@RequestMapping("/fetchftedata")
public class FteRetrieverController {
	
	/*@Autowired
	FteRetrieverService fteRetrieveController;*/
	@Autowired
	private FteRetrieverRepo fteRepo;
	

	@RequestMapping("/byDate/")
	public List<FTERecord> getDataByDateRange(@RequestParam
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	Date weekStDt) throws ParseException{
	
		List<FTERecord> fteRecords = this.fteRepo.findByWeekStDt(weekStDt);
		return fteRecords ;
	}
	
	@RequestMapping("/byDatenTrack/")
	public List<FTERecord> getDataByDateRange(@RequestParam
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)Date weekStDt,
			@RequestParam String track) throws ParseException{
		List<FTERecord> fteRecords = this.fteRepo.findByTrackAndWeekStDt(track, weekStDt);
		return fteRecords ;
	} 

	@RequestMapping("/byTrack/")
	public List<FTERecord> getDataByDateRange(
			@RequestParam String track) throws ParseException{
		List<FTERecord> fteRecords = this.fteRepo.findByTrack(track);
		return fteRecords ;
	} 
	
	@GetMapping("/")
	public List<FTERecord> getAllRecs(@RequestParam
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	Date weekStDt) throws ParseException{
	
		List<FTERecord> fteRecords = this.fteRepo.findByWeekStDt(weekStDt);
		return fteRecords ;
	}
}
