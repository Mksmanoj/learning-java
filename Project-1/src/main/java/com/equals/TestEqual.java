package com.equals;

public class TestEqual {
	public static void main(String[] args) {
		String s1 = new String("yusata");
		String s2 = new String("yusata");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	    Integer i = 10;
	    Integer j = 10;
	    System.out.println(i == j);
	    System.out.println(i.equals(j));
	    Integer k = 128;
	    Integer l = 128;
	    System.out.println(k == l);
	    System.out.println(k.equals(l));
	}

}
