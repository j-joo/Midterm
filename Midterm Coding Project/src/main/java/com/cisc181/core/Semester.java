package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {

	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	public Semester() {
	}
	
	public Semester(UUID SemesterID, Date StartDate, Date EndDate) {
		this.SemesterID = SemesterID;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}
	
	public void setSemesterID(UUID SemesterID) {
		this.SemesterID = SemesterID;
	}
	
	public UUID getSemesterID(UUID SemesterID) {
		return this.SemesterID;
	}
	
	public void setStartDate(Date StartDate) {
		this.StartDate = StartDate;
	}
	
	public Date getStartDate(Date StartDate) {
		return this.StartDate;
	}
	
	public void setEndDate(Date EndDate) {
		this.EndDate = EndDate;
	}
	
	public Date getEndDate(Date EndDate) {
		return this.EndDate;
	}
}