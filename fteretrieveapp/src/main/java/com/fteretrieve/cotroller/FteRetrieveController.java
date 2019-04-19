package com.fteretrieve.cotroller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fteretrieve.dao.FteReteieveRepo;
import com.fteretrieve.model.FTERecord;


@RestController
@RequestMapping("/fetchftedata")
public class FteRetrieveController {
	
	/*@Autowired
	FteRetrieveService fteRetrieveController;*/
	@Autowired
	private FteReteieveRepo fteRepo;
	

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
