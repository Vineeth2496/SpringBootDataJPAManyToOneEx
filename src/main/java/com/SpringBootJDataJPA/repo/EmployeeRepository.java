package com.SpringBootJDataJPA.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SpringBootJDataJPA.model.Dept;
import com.SpringBootJDataJPA.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	//INNER JOIN or JOIN
	//@Query("SELECT e.empName ,d.deptCode FROM Employee e INNER JOIN e.dob AS d")
	
	//LEFT OUTER JOIN or LEFT JOIN
	//@Query("SELECT e.empName ,d.deptCode FROM Employee e LEFT JOIN e.dob AS d")
	//List<Object[]> getEmpDeptInnerJoinData();
	
	//INNER JOIN or JOIN WHERE CONDITION
	//@Query("SELECT e.empName ,d.deptCode FROM Employee e INNER JOIN e.dob AS d WHERE e.empSal>=:esal")
	//List<Object[]> getEmpDeptInnerJoinDataInput(Double esal);
	
	//RIGHT OUTER JOIN or RIGHT JOIN
	//@Query("SELECT e.empName ,d.deptCode FROM Employee e RIGHT JOIN e.dob AS d")
	//List<Object[]> getEmpDeptRightJoinData();
	
	//ONLY LEFT TABLE or ONLY RIGHT TABLE (Not connected data)  
	//@Query("SELECT e.empName ,d.deptCode FROM Employee e LEFT JOIN e.dob AS d WHERE d IS NULL")
	//@Query("SELECT e.empName ,d.deptCode FROM Employee e RIGHT JOIN e.dob AS d WHERE d IS NULL")
	@Query("SELECT e.empName ,d.deptCode FROM Employee e FULL OUTER JOIN e.dob AS d WHERE d IS NULL")
	List<Object[]> getEmpDeptFullJoinData();
		
}
