package com.example.employeemanagementsystem.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemanagementsystem.Repository.SubmissionRepository;
import com.example.employeemanagementsystem.exception.ResourceNotFoundException;

import com.example.employeemanagementsystem.model.SubmissionTypes;
import com.example.employeemanagementsystem.service.SequenceGeneratorService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v2")
public class SubmissionController {

	@Autowired
	private SubmissionRepository submissionRepository;
	
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;
	
	@GetMapping("/submissions")
	public List<SubmissionTypes> getAllSubmissions() {
		return submissionRepository.findAll();
	}
	
	@GetMapping("/submissions/{id}")
	public ResponseEntity<SubmissionTypes> getSubmissionById(@PathVariable(value = "id") int submissionId)
			throws ResourceNotFoundException {
		SubmissionTypes submissionTypes = submissionRepository.findById(submissionId)
				.orElseThrow(() -> new ResourceNotFoundException("Submission not found for this id :: " + submissionId));
		return ResponseEntity.ok().body(submissionTypes);
	}

	@PostMapping("/Addsubmissions")
	public SubmissionTypes createSubmission( @RequestBody SubmissionTypes submissionTypes) {
		submissionTypes.setSubmissionId(sequenceGeneratorService.Sequence(SubmissionTypes.SEQUENCE_NAME));
		return submissionRepository.save(submissionTypes);
	}
	
	
	

	@DeleteMapping("/submissions/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Integer submissionId)
			throws ResourceNotFoundException {
		SubmissionTypes submissionTypes = submissionRepository.findById(submissionId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + submissionId));

		submissionRepository.delete(submissionTypes);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
	
	
}