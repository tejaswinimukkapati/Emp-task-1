package com.example.employeemanagementsystem.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.employeemanagementsystem.model.EmployeeJourney;

public interface EmployeeJourneyRepository  extends MongoRepository<EmployeeJourney, Long>{

}