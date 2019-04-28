package com.deloitte.defectLoader.dao;

import org.springframework.stereotype.Repository;

@Repository(value="defectrecorderimpl")
public abstract class DefectRecorderRepoImpl implements DefectRecorderRepo {

	// Custom methods that are not listed in FTERecorderRepo(CRUD+MongoDB Repo) to be writen here
}
