package com.jpa.demo.service;

import org.springframework.stereotype.Service;

import com.jpa.demo.entity.Employee;

@Service
public interface EmployeeService {
	
	
	public Employee findEmpByid(Integer empId);
	
	
	public Employee saveEmployee();
	
	
	public boolean deleteEmployee(int empid);

}
