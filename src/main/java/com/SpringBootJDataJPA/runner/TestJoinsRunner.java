package com.SpringBootJDataJPA.runner;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringBootJDataJPA.repo.EmployeeRepository;
@Component
public class TestJoinsRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository erepo;
	@Override
	public void run(String... args) throws Exception {
		//List<Object[]> list=erepo.getEmpDeptInnerJoinData();
		//List<Object[]> list=erepo.getEmpDeptInnerJoinDataInput(5.00);
		//List<Object[]> list=erepo.getEmpDeptRightJoinData();
		List<Object[]> list=erepo.getEmpDeptFullJoinData();
		for(Object[] ob: list) {
			System.out.println(ob[0] +"--"+ob[1]);
		}
	}

}
