package com.fteretriever.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fteretriever.model.FteCount;

public interface FteCountRetriever extends MongoRepository<FteCount, Integer>  {

}
