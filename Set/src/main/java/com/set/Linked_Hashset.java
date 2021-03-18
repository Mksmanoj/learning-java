package com.set;

import java.util.*;

class Linked_Hashset {

	public static void main(String args[]) {

		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add(null);
		set.add(null);
		set.add("Two"); //duplication will not take place.
		
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
