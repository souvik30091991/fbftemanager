package com.fterecorder.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.fterecorder.app.exceptions.FTERecSequenceException;
import com.fterecorder.app.model.FTERecordSequenceId;

@Repository
public class FTERecordSequenceDaoImpl implements FTERecordSequenceDao {

	@Autowired
	private MongoOperations mongoOperation;

	@Override
	public long getNextFteRecSequenceId(String key) throws FTERecSequenceException {
		
	  //get sequence id
	  Query query = new Query(Criteria.where("_id").is(key));

	  //increase sequence id by 1
	  Update update = new Update();
	  update.inc("seq", 1);

	  //return new increased id
	  FindAndModifyOptions options = new FindAndModifyOptions();
	  options.returnNew(true);

	  //this is the magic happened.
	  FTERecordSequenceId seqId = 
            mongoOperation.findAndModify(query, update, options, FTERecordSequenceId.class);

	  //if no id, throws SequenceException
          //optional, just a way to tell user when the sequence id is failed to generate.
	  if (seqId == null) {
		throw new FTERecSequenceException("Unable to get sequence id for key : " + key);
	  }

	  return seqId.getSeq();

	}

}
