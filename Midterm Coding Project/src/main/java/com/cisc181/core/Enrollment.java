package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment() {
		
	}
	
	public Enrollment(UUID StudentID, UUID SectionID) {
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		UUID EnrollmentID;
	}
	
	public void setEnrollmentID(UUID EnrollmentID) {
		this.EnrollmentID = EnrollmentID;
	}
	
	public UUID getEnrollmentID(UUID EnrollmentID) {
		return this.EnrollmentID;
	}
	
	public void setGrade(double grade) {
		this.Grade = grade;
	}
	
	public double getGrade(double Grade) {
		return this.Grade;	
	}
	
	public void setStudentID(UUID StudentID) {
		this.StudentID = StudentID;
	}
	
	public UUID getStudentID(UUID StudentID) {
		return this.StudentID;
	}
	
	public void setSectionID(UUID SectionID) {
		this.SectionID = SectionID;
	}
	
	public UUID getSectionID(UUID SectionID) {
		return this.SectionID;
	}
}