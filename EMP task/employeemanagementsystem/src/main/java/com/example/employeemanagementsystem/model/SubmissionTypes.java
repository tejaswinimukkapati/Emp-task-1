package com.example.employeemanagementsystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="submissiontypes")

public class SubmissionTypes {
	
	@Transient
    public static final String SEQUENCE_NAME = "Submission_sequence";
	
	@Id
	private int submissionID;
	private String SubmissionTypes;
	
	public SubmissionTypes() {

	}	

	public SubmissionTypes(int submissionID, String submissionTypes) {
		super();
		this.submissionID = submissionID;
		this.SubmissionTypes = submissionTypes;
	}

	public int getSubmissionID() {
		return submissionID;
	}

	public void setSubmissionID(int submissionID) {
		this.submissionID = submissionID;
	}

	public String getSubmissionTypes() {
		return SubmissionTypes;
	}

	public void setSubmissionTypes(String submissionTypes) {
		this.SubmissionTypes = submissionTypes;
	}

	@Override
	public String toString() {
		return "SubmissionTypes [submissionID=" + submissionID + ", SubmissionTypes=" + SubmissionTypes + "]";
	}

	public void setSubmissionId(long sequence) {
		// TODO Auto-generated method stub
		
	}

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}	
	
}