package com.deloitte.defectLoader.service;

import java.util.List;

import com.deloitte.defectLoader.model.DefectRecord;

public interface DefectLoaderService {

	public boolean insertRecords(List<DefectRecord> records);
	
	public boolean updateRecords(List<DefectRecord> records);

}
