package com.deloitte.defectLoader.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.deloitte.defectLoader.model.DefectRecord;


@FeignClient(name="defectretriever" )
public interface DefectRetrieverFeignClient {

	@RequestMapping("/defectRetriever/fetchDefect")
	public List<DefectRecord> fetchDefectDump(@RequestParam String source);
		
}
