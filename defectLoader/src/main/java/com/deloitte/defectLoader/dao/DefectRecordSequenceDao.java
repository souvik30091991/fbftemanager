package com.deloitte.defectLoader.dao;

import com.deloitte.defectLoader.exception.DefectRecSeqException;

public interface DefectRecordSequenceDao {

	long getNextFteRecSequenceId(String key) throws DefectRecSeqException;
}
