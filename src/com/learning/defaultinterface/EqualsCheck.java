package com.learning.defaultinterface;

import java.util.HashSet;
import java.util.Set;

public class EqualsCheck {

	public static void main(String[] args) {
		Person p = new Person(1);
		Person p1 = new Person(1);
		Person p2= new Person(1);
		Person p3= new Person(1);
		Person p4= new Person(1);
		Person p5= new Person(1);
		Person p6= new Person(1);
		String s1= new String ("abc");
		String S2 = "abc";
		Set<Person> set = new HashSet();
		set.add(p);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.add(p6);
		System.out.println("Result: " + set.size());

		
		Set<String> stringSet = new HashSet();
		stringSet.add(s1);
		stringSet.add(S2);
		System.out.println("Result: " + stringSet.size());
	}

	
}
