package com.wrapper;

public class WrapperMethods {
	public static void main (String args[]){
		Integer intObj1 = new Integer (25);
		Integer intObj2 = new Integer ("25");
		Integer intObj3= new Integer (35);
		//compareTo demo
		System.out.println("Comparing using compareTo Obj1 and Obj2: " + intObj1.compareTo(intObj2));
		System.out.println("Comparing using compareTo Obj1 and Obj3: " + intObj1.compareTo(intObj3));
		//Equals demo
		System.out.println("Comparing using equals Obj1 and Obj2: " + intObj1.equals(intObj2));
		System.out.println("Comparing using equals Obj1 and Obj3: " + intObj1.equals(intObj3));
		Float f1 = new Float("2.25f");
		Float f2 = new Float("20.43f");
		Float f3 = new Float(2.25f);
		System.out.println("Comparing using compare f1 and f2: " +Float.compare(f1,f2));
		System.out.println("Comparing using compare f1 and f3: " +Float.compare(f1,f3));
		//Addition of Integer with Float
		Float f = intObj1.floatValue() + f1;
		System.out.println("Addition of intObj1 and f1: "+ intObj1 +"+" +f1+"=" +f );
		
		Integer intWrapper = Integer.valueOf("12345");
		//Converting from binary to decimal
		Integer intWrapper2 = Integer.valueOf("11011", 2);
		//Converting from hexadecimal to decimal
		Integer intWrapper3 = Integer.valueOf("D", 16);
		System.out.println("Value of intWrapper Object: "+ intWrapper);
		System.out.println("Value of intWrapper2 Object: "+ intWrapper2);
		System.out.println("Value of intWrapper3 Object: "+ intWrapper3);
		System.out.println("Hex value of intWrapper: " + Integer.toHexString(intWrapper));	
		System.out.println("Binary Value of intWrapper2: "+ Integer.toBinaryString(intWrapper2));

	}

}  

