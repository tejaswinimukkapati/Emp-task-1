package com.example.employeemanagementsystem.model;

import java.sql.Blob;
import java.time.LocalDate;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="employeejourney")

public class EmployeeJourney {
	
	private Long id;
	
//	@CreatedDate
	private LocalDate SubmissionDate;
	private String Summary;
    private String Description;
    
    @CreatedDate
    private LocalDate ApprovalDate;
	private String Status;
    private Blob AttachmentBlob;
    
    @CreatedDate
    private LocalDate ExpiryDate;
    
    public EmployeeJourney() {
   
    }

	public EmployeeJourney(Long id, LocalDate submissionDate, String summary, String description,
			LocalDate approvalDate, String status, Blob attachmentBlob, LocalDate expiryDate) {
		super();
		this.id = id;
		SubmissionDate = submissionDate;
		Summary = summary;
		Description = description;
		ApprovalDate = approvalDate;
		Status = status;
		AttachmentBlob = attachmentBlob;
		ExpiryDate = expiryDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getSubmissionDate() {
		return SubmissionDate;
	}

	public void setSubmissionDate(LocalDate submissionDate) {
		SubmissionDate = submissionDate;
	}

	public String getSummary() {
		return Summary;
	}

	public void setSummary(String summary) {
		Summary = summary;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public LocalDate getApprovalDate() {
		return ApprovalDate;
	}

	public void setApprovalDate(LocalDate approvalDate) {
		ApprovalDate = approvalDate;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Blob getAttachmentBlob() {
		return AttachmentBlob;
	}

	public void setAttachmentBlob(Blob attachmentBlob) {
		AttachmentBlob = attachmentBlob;
	}

	public LocalDate getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		ExpiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "EmployeeJourney [id=" + id + ", SubmissionDate=" + SubmissionDate + ", Summary=" + Summary
				+ ", Description=" + Description + ", ApprovalDate=" + ApprovalDate + ", Status=" + Status
				+ ", AttachmentBlob=" + AttachmentBlob + ", ExpiryDate=" + ExpiryDate + "]";
	}
    
    
}