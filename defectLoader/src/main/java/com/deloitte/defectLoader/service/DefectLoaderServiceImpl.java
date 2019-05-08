package com.deloitte.defectLoader.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.defectLoader.dao.DefectRecordSequenceDaoImpl;
import com.deloitte.defectLoader.dao.DefectRecorderRepo;
import com.deloitte.defectLoader.model.DefectRecord;

@Service
public class DefectLoaderServiceImpl implements DefectLoaderService {

	private static final String DEFECTREC_SEQ_KEY = "defectrec";

	@Autowired
	DefectRecorderRepo defectRecordRepo;

	@Autowired
	DefectRecordSequenceDaoImpl defectRecoredSeq;

	@Override
	public boolean insertRecords(List<DefectRecord> records) {
		records.forEach(r -> {
			r.setId(defectRecoredSeq.getNextFteRecSequenceId(DEFECTREC_SEQ_KEY));
		});

		try {
			defectRecordRepo.saveAll(records);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean updateRecords(List<DefectRecord> records) {
		try {
			records.get(0).setUpdateDt(LocalDateTime.now());
			defectRecordRepo.saveAll(records);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
