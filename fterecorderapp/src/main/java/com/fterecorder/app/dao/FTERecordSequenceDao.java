package com.fterecorder.app.dao;

import com.fterecorder.app.exceptions.FTERecSequenceException;

public interface FTERecordSequenceDao {

	long getNextFteRecSequenceId(String key) throws FTERecSequenceException;
}
