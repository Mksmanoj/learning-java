package com.ylog.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static String name = "Prasad";
	
	public int id =110;
	
	public void getData() {
		List<String> list = new ArrayList<>();
		list.add(null);
		list.add(null);
		list.add("Deba");
		System.out.println(list);
 	}
	
	public static void getValue() {
		List<String> list = new ArrayList<>();
		list.add(null);
		list.add(null);
		list.add("Deba");
		System.out.println(list);
 	}
}
