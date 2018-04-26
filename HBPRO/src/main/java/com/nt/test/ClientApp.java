package com.nt.test;

import com.nt.dao.EmployeeDAO;
import com.nt.dao.EmployeeDAOFactory;
import com.nt.domain.Employee;


public class ClientApp {
	public static void main(String[] args) {
		EmployeeDAO dao=null;
		Employee emp=null;
		int eno=0;
		//get DAO
		dao=EmployeeDAOFactory.getInstance();
		//save object
		emp=new Employee();
		emp.setEid(10001);
		emp.setFirstname("Raja");
		emp.setLastname("Panda");
		emp.setEmail("milan@123");
		eno=dao.save(emp);
		System.out.println("Employee saved with no::"+eno);
		
	}//main
}//class
