package com.fteretriever.controller;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Logger;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fteretriever.model.FTERecord;
import com.fteretriever.service.FteRetrieverService;

@RestController
@RequestMapping("/fetchftedata")
@CrossOrigin(origins = "*", maxAge = 3600)
public class FteRetrieverController {

	private static final Logger LOG = Logger.getLogger(FteRetrieverController.class.getName());


	
	/*@Autowired
	FteRetrieverService fteRetrieveController;*/

	@Autowired
	private FteRetrieverService fteService;
	

	@RequestMapping("/byDate/")
	public List<FTERecord> getDataByDateRange(@RequestParam
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	LocalDate weekStDt,@RequestParam
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate weekEdDt) throws ParseException{
	
		List<FTERecord> fteRecords = this.fteService.findByDateRange(weekStDt,weekEdDt);
		return fteRecords ;
	}

	@RequestMapping("/byDatenTrack/")

	public List<FTERecord> getDataByDateRange(@RequestParam
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate weekStDt,
			@RequestParam
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate weekEdDt,
			@RequestParam String track) throws ParseException{
		List<FTERecord> fteRecords = this.fteService.findByDateRangenTrack(weekStDt,weekEdDt,track);
		return fteRecords ;
	} 

	@RequestMapping("/byTrack/")
	public List<FTERecord> getDataByDateRange(
			@RequestParam String track) throws ParseException{
		List<FTERecord> fteRecords = this.fteService.findBytrack(track);
		return fteRecords ;
	} 
	
	@GetMapping("/")
	public List<FTERecord> getAllRecs() throws ParseException{
	
		List<FTERecord> fteRecords = this.fteService.getAllData();
		return fteRecords ;
	}
	@RequestMapping(value="/getTotalFTECountByTrack/{track}",method=RequestMethod.GET)
	public int getFTECountByTrack(@PathVariable("track") String track) {
		return fteService.findFteCountByTrack(track).get(0).getFteCount();
	}
}
