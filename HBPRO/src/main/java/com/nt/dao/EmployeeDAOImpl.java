package com.nt.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.domain.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public int save(Employee emp) {
		Configuration cfg=null;
		  SessionFactory factory=null;
		  Session ses=null;
		  Transaction tx=null;
		  int id=0;
		   //Activate HIbernate Framework
		   cfg=new Configuration();
		   //read both HB cfg,mapping file info
		   cfg=cfg.configure("/com/nt/cfgs/hibernate.cfg.xml");
		   //create SessionFactory object
		   factory=cfg.buildSessionFactory();
		   //create Session
		   ses=factory.openSession();
		  //Save obj using ses.save(-) method
		      try{
		    	//begin Transaction
		    	tx=ses.beginTransaction();
		    	id=(Integer)ses.save(emp);
		    	tx.commit();
		    	System.out.println("object is saved");
		    }
		    catch(Exception e){
		    	tx.rollback();
		    } 
		    
			return id;
		    }//main
	 }//class


