package com.fterecorder.app.dao;

import org.springframework.stereotype.Repository;

@Repository(value="fterecorderimpl")
public abstract class FTERecorderRepoImpl implements FTERecorderRepo {

	// Custom methods that are not listed in FTERecorderRepo(CRUD+MongoDB Repo) to be writen here
}
