package com.ylog.test;

import java.util.ArrayList;
import java.util.List;
import com.ylog.bean.Employee;

public class Test {

	// Get data from DB
	public List<Employee> getEmployees() {

		List<Employee> empList = new ArrayList<>();

		Employee emp1 = new Employee();
		emp1.setId(10);
		emp1.setFirstName("manoj");
		emp1.setLastName("sahoo");
		emp1.setAddress("BBSR");
		emp1.setMobileNumber(1234567890);
		emp1.setGender("F");
		empList.add(emp1);

		Employee emp2 = new Employee();
		emp2.setId(20);
		emp2.setFirstName("Arpita");
		emp2.setLastName("Bhanja");
		emp2.setAddress("BDK");
		emp2.setMobileNumber(1234567890);
		emp2.setGender("F");
		empList.add(emp2);

		Employee emp3 = new Employee();
		emp3.setId(30);
		emp3.setFirstName("jonam");
		emp3.setLastName("Sahoo");
		emp3.setAddress("CTC");
		emp3.setMobileNumber(1234567890);
		emp3.setGender("M");
		empList.add(emp3);

		return empList;
	}
}
