package com.jpa.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.demo.entity.Employee;

@Repository
public interface EmployeeRepo extends  JpaRepository<Employee, Integer> {
	
	
	public  Employee findByEmpId(Integer empId);
	
	

}
