package com.learning.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Excercise1WithJava8 {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(
				new Person("Sachin", "Kumar", 30), 
				new Person("Mano", "Sirswa", 30),
				new Person("Misti", "Prajapat", 30),
				new Person("Misthi", "Kumar", 30));
	
		// Step1 : sort List by LastName
		System.out.println("STEP1:  ");
		Collections.sort(persons, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Step2 : Create method to print all Person
		System.out.println("STEP2:  ");
		printWithCondition(persons, p -> true);

		// Step3 : Create method to print all Person with last name starting with K
		System.out.println("STEP3:  ");
		printWithCondition(persons, p -> p.getLastName().startsWith("K"));

		// Step4 : Create method to print all Person with First name starting with M
		System.out.println("STEP4:  ");
		printWithCondition(persons, (p) -> p.getFirstName().startsWith("M"));
	
	}
	
	private static void printWithCondition(List<Person> persons, Condition c) {
		for (Person person : persons) {
			if(c.test(person)) {
				System.out.println(person.toString());
			}
		}
	}
	
	/**
	 * With inbuilt function Predicate instead of creating an interface Condition
	 * @param persons
	 * @param c
	 */
	private static void printWithPredicate(List<Person> persons, Predicate<Person> p) {
		for (Person person : persons) {
			if(p.test(person)) {
				System.out.println(person.toString());
			}
		}
	}

}
