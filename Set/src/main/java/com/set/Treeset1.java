package com.set;

import java.util.*;

public class Treeset1 {
	public static void main(String args[]) {
		// Creating and adding elements
		TreeSet<String> al = new TreeSet<String>();
		al.add("m");
		al.add("a");
		al.add("n");
		al.add("o");
		al.add("j");
		// Traversing elements
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
