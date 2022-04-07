package com.example.db.entity;

import org.springframework.data.mongodb.core.mapping.Field;

public class Subject {
	@Field(name = "subject_name")
	// map fields to collection in database
	private String subjectName;

	@Field(name = "marks_obtained")
	private int marksObtained;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		this.marksObtained = marksObtained;
	}
}
