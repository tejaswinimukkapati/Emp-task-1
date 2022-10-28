package com.example.employeemanagementsystem.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.employeemanagementsystem.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long>{

}
