package com.cisc181.core;

public class PersonException extends Exception{

	private static final long serialVersionUID = 1L;
	private Person Person;
	
	public PersonException(Person person) {
		this.Person = person;
	}

	public Person getPerson() {
		return Person;
	}
}