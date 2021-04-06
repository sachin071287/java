package com.learning.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Excercise1WithJava7 {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(
				new Person("Sachin", "Kumar", 30), 
				new Person("Mano", "Sirswa", 30),
				new Person("Misti", "Prajapat", 30),
				new Person("Misthi", "Kumar", 30));
	
		// Step1 : sort List by LastName
		System.out.println("STEP1:  ");
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		// Step2 : Create method to print all Person
		System.out.println("STEP2:  ");
		printAll(persons);

		// Step3 : Create method to print all Person with last name starting with K
		System.out.println("STEP3:  ");
		printWithCondition(persons, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("K");
			}
		});

		// Step4 : Create method to print all Person with First name starting with M
		System.out.println("STEP4:  ");
		printWithCondition(persons, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("M");
			}
		});
	
	}
	
	private static void printWithCondition(List<Person> persons, Condition c) {
		for (Person person : persons) {
			if(c.test(person)) {
				System.out.println(person.toString());
			}
		}
	}

	private static void printAll(List<Person> persons) {
		for (Person person : persons) {
			System.out.println(person.toString());
		}
	}
	
}

interface Condition {
	boolean test(Person p);
}
