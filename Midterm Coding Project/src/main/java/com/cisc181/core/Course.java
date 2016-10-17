package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {

	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public Course()
	{
		
	}
	
	public Course(UUID CourseID, String CourseName, int GradePoints, eMajor Major)
	{
		this.CourseID = CourseID;
		this.CourseName = CourseName;
		this.GradePoints = GradePoints;
		this.Major = Major;
	}
	
	public void setCourseID()
	{
		this.CourseID = CourseID;
	}
	
	public UUID getCourseID()
	{
		return CourseID;
	}
	
	public void setCourseName()
	{
		this.CourseName = CourseName;
	}
	
	public String getCourseName()
	{
		return CourseName;
	}
	
	public void setGradePoints()
	{
		this.GradePoints = GradePoints;
	}
	
	public int getGradePoint()
	{
		return GradePoints;
	}
	
	public void setMajor()
	{
		this.Major = Major;
	}
	
	public eMajor getMajor()
	{
		return Major;
	}
}