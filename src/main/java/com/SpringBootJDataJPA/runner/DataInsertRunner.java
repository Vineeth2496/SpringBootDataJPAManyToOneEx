package com.SpringBootJDataJPA.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringBootJDataJPA.model.Dept;
import com.SpringBootJDataJPA.model.Employee;
import com.SpringBootJDataJPA.repo.DeptRepository;
import com.SpringBootJDataJPA.repo.EmployeeRepository;
//@Component
public class DataInsertRunner implements CommandLineRunner {

	@Autowired
	private DeptRepository drepo;
	@Autowired
	private EmployeeRepository erepo;
	
	@Override
	public void run(String... args) throws Exception {
		Dept d1=new Dept(10, "DEV", "VIKRAM");
		Dept d2=new Dept(11, "QA", "BANTI");
		Dept d3=new Dept(12, "BA", "VINEETH");
		drepo.save(d1);
		drepo.save(d2);
		drepo.save(d3);
		
		Employee e1=new Employee(101, "A", 2.4, null);
		Employee e2=new Employee(102, "B", 3.6, d1);
		Employee e3=new Employee(103, "C", 4.8, d3);
		Employee e4=new Employee(104, "D", 5.1, d1);
		
		erepo.save(e1);
		erepo.save(e2);
		erepo.save(e3);
		erepo.save(e4);
		
		

	}

}
