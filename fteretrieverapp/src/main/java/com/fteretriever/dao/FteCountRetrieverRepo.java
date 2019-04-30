package com.fteretriever.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fteretriever.model.FteCount;

@Repository
public interface FteCountRetrieverRepo extends MongoRepository<FteCount, Long>  {

	public List<FteCount> findFteCountByTrac(String track);
}
