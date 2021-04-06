package com.amdeus.inheritence;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		List<Parent> list = new ArrayList<Parent>();
		Child child = new Child();
		Parent parent = new Parent();
		list.add(parent);
		list.add(child);

		checkForInstance(list);
	}

	private static void checkForInstance(List<Parent> list) {

		for (Parent parent : list) {
			if (parent instanceof Parent) {

				System.out.println("insatcne of parent");
			}
		}
	}

}
