package com.ylog.test.list;

import java.util.List;
import com.ylog.bean.Employee;
import com.ylog.test.Test;

public class TestList {
	public static void main(String[] args) {
		Test test = new Test();
		List<Employee> list = test.getEmployees();
		for (Employee employee : list) {
			if ("ctc".equals(employee.getAddress())) {
//				if("ctc".equalsIgnoreCase(employee.getAddress())) {
				System.out.println(employee.getFirstName() + " " + employee.getLastName());
				System.out.println(employee);
			}
		}
		for (Employee employee : list) {
			if (10 == employee.getId()) {
				System.out.println(employee.getFirstName() + " " + employee.getLastName());
			}
		}

	}
}
