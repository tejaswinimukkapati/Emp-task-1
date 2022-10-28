package com.example.employeemanagementsystem.service;
import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.example.employeemanagementsystem.model.DatabaseSequence;
import com.example.employeemanagementsystem.model.EmpSequence;
import com.example.employeemanagementsystem.model.SubmissionSequence;


@Service
public class SequenceGeneratorService {

    private MongoOperations mongoOperations;

    @Autowired
    public SequenceGeneratorService(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    public long generateSequence(String seqName) {

        DatabaseSequence counter = mongoOperations.findAndModify(query(where("_id").is(seqName)),
                new Update().inc("seq",1), options().returnNew(true).upsert(true),
                DatabaseSequence.class);
        return !Objects.isNull(counter) ? counter.getSeq() : 1;

    }

    
    public long Sequence(String seqName) {

        SubmissionSequence counter = mongoOperations.findAndModify(query(where("_id").is(seqName)),
                new Update().inc("seq",5), options().returnNew(true).upsert(true),
                SubmissionSequence.class);
        return !Objects.isNull(counter) ? counter.getSeq() : 5;

    }
    
    public long Sequences(String seqName) {

        EmpSequence counter = mongoOperations.findAndModify(query(where("_id").is(seqName)),
                new Update().inc("seq",5), options().returnNew(true).upsert(true),
                EmpSequence.class);
        return !Objects.isNull(counter) ? counter.getSeq() : 5;

    }
}
    
 
    

 
