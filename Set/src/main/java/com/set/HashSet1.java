package com.set;

import java.util.*;

public class HashSet1 {
	public static void main(String args[]) {
		
	
		Set<String> set = new HashSet<>();
		
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("One");
		set.add(null);
		set.add(null);
		
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
			
		}
	}

	
}
