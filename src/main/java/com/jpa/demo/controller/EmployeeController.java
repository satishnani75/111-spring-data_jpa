package com.jpa.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.demo.entity.Employee;
import com.jpa.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeService service;

	@GetMapping("/getemp/{empId}")
	public Employee getEmpbyid(@PathVariable Integer empId) {

		Employee empobj = service.findEmpByid(empId);

		ResponseEntity<Employee> resp = new ResponseEntity<Employee>(empobj, HttpStatus.OK);

		return empobj;

	}

	@GetMapping("/save")
	public Employee saveEmp() {

		return service.saveEmployee();
	}

	@GetMapping("/delete/{empid}")
	public boolean deleteEmp(@PathVariable @NonNull Integer empid) {

		if (empid != null) {
			return service.deleteEmployee(empid);

		} else {

			return false;
		}
	}
	
	@Getmapping("/hello")
	public String hello() {
		
		return "hai from hello";
	}
}
