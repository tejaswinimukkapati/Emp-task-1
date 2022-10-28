package com.example.employeemanagementsystem.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.employeemanagementsystem.model.SubmissionTypes;

@Repository
public interface SubmissionRepository  extends MongoRepository<SubmissionTypes, Integer> {

	Optional<SubmissionTypes> findById(Long submissionId);
	

}