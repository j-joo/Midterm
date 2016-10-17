package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	static ArrayList<Course> courseList;
	static ArrayList<Semester> semesterList;
	static ArrayList<Section> sectionList;
	static ArrayList<Student> studentList;
	static ArrayList<Enrollment> enrollmentList;
	
	@BeforeClass
	public static void dataBeforeClass() throws Exception {
		
		//Courses
		courseList = new ArrayList<Course>();
		
		courseList.add(new Course(UUID.randomUUID(), "CISC181", 4, eMajor.COMPSI));
		courseList.add(new Course(UUID.randomUUID(), "PHYS101", 4, eMajor.PHYSICS));
		courseList.add(new Course(UUID.randomUUID(), "NURS101", 4, eMajor.NURSING));

		//Semesters
		semesterList = new ArrayList<Semester>();
		
		semesterList.add(new Semester(UUID.randomUUID(), new Date(0), new Date(4)));
		semesterList.add(new Semester(UUID.randomUUID(), new Date(6), new Date(10)));
		
		sectionList = new ArrayList<Section>();
		
		//Fall semester
		sectionList.add(new Section(courseList.get(0).getCourseID(),UUID.randomUUID(), 123));
		sectionList.add(new Section(courseList.get(1).getCourseID(),UUID.randomUUID(), 456));
		sectionList.add(new Section(courseList.get(2).getCourseID(),UUID.randomUUID(), 789));
		
		//Spring semester
		sectionList.add(new Section(courseList.get(0).getCourseID(), UUID.randomUUID(), 123));
		sectionList.add(new Section(courseList.get(1).getCourseID(), UUID.randomUUID(), 456));
		sectionList.add(new Section(courseList.get(2).getCourseID(), UUID.randomUUID(), 789));

		//Students
		studentList = new ArrayList<Student>();
		
		studentList.add(new Student("A", "B", "C", new Date(0), eMajor.COMPSI, "Address0", "000-000-0000", "test0@email.com"));
		studentList.add(new Student("D", "E", "F", new Date(1), eMajor.COMPSI, "Address1", "100-000-0000", "test1@email.com"));
		studentList.add(new Student("G", "H", "I", new Date(2), eMajor.COMPSI, "Address2", "200-000-0000", "test2@email.com"));
		studentList.add(new Student("J", "K", "L", new Date(3), eMajor.COMPSI, "Address3", "300-000-0000", "test3@email.com"));
		studentList.add(new Student("M", "N", "O", new Date(4), eMajor.PHYSICS, "Address4", "400-000-0000", "test4@email.com"));
		studentList.add(new Student("P", "Q", "R", new Date(5), eMajor.PHYSICS, "Address5", "500-000-0000", "test5@email.com"));
		studentList.add(new Student("S", "T", "U", new Date(6), eMajor.PHYSICS, "Address6", "600-000-0000", "test6@email.com"));
		studentList.add(new Student("V", "W", "X", new Date(7), eMajor.PHYSICS, "Address7", "700-000-0000", "test7@email.com"));
		studentList.add(new Student("Y", "Z", "0", new Date(8), eMajor.NURSING, "Address8", "800-000-0000", "test8@email.com"));
		studentList.add(new Student("1", "2", "3", new Date(9), eMajor.NURSING, "Address9", "900-000-0000", "test9@email.com"));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		courseList = null;
		semesterList = null;
		sectionList = null;
		studentList = null;
	}

	@Before
	public void setUp() throws Exception
	{
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	//GPA Calculate
	
	@Test
	public void MajorChange() {
		studentList.get(0).setMajor(eMajor.CHEM);
		assertEquals(studentList.get(0).getMajor(), eMajor.CHEM);
	}

}