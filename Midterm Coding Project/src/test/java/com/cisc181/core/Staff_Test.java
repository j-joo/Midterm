package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;
import com.cisc181.core.PersonException;

public class Staff_Test
{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
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
	public void staffTest() throws PersonException {
		ArrayList<Staff> staffList = new ArrayList<Staff>();
		staffList.add(new Staff("John", "A", "Smith", new Date(0), "1 Street", "123-123-1234", 
				"test1@email.com", "1-5", 1, 10000, new Date(100), eTitle.MR));
		staffList.add(new Staff("John", "B", "Smith", new Date(0), "2 Street", "123-123-1234", 
				"test2@email.com", "2-5", 1, 20000, new Date(100), eTitle.MR));
		staffList.add(new Staff("John", "C", "Smith", new Date(0), "3 Street", "123-123-1234", 
				"test3@email.com", "3-5", 1, 30000, new Date(100), eTitle.MR));
		staffList.add(new Staff("John", "D", "Smith", new Date(0), "4 Street", "123-123-1234", 
				"test4@email.com", "4-5", 1, 40000, new Date(100), eTitle.MR));
		staffList.add(new Staff("Jane", "E", "Smith", new Date(0), "5 Street", "123-123-1234", 
				"test5@email.com", "5-6", 1, 50000, new Date(100), eTitle.MRS));
		
		double averageSalary = 
				(staffList.get(0).getSalary() + 
				staffList.get(1).getSalary() + 
				staffList.get(2).getSalary()+ 
				staffList.get(3).getSalary() + 
				staffList.get(4).getSalary()
				)/ 5;
		//assertEquals(40000, averageSalary, 0);
		assertEquals(30000, averageSalary, 0);
	}
	
	@Test (expected = PersonException.class)
	public void testPhoneNumber() throws PersonException {
		Staff s = new Staff("John", "M", "Smith", new Date(0), "123 Street", "123-123-1234", "test@email.com",
				"3-5", 1, 200000, new Date(100), eTitle.MR);
	}
	
	@Test (expected = PersonException.class)
	public void testDOB() throws PersonException {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 1990);
		Date DOB = c.getTime();
		Staff s = new Staff("John", "M", "Smith", new Date(0), "123 Street", "123-123-1234", "test@email.com",
				"3-5", 1, 200000, new Date(100), eTitle.MR);
	}
}
