/**
 * 
 */
package com.jpa.demo.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.demo.entity.Addres;
import com.jpa.demo.entity.Employee;
import com.jpa.demo.repo.EmployeeRepo;

/**
 * @author admin
 *
 */
@Service
public class EmpserviceImpl implements EmployeeService {

	@Autowired
	public EmployeeRepo repo;

	@Override
	public Employee findEmpByid(Integer empId) {
		return repo.getById(empId);
	}

	@Override
	public Employee saveEmployee() {

		Employee e = new Employee();

		Addres ad = new Addres();

		ad.setCity("hyd");

		ad.setCounty("india");

		e.setEmpName("satish");
		e.setEmpSal(85000);
		e.setAddres(Arrays.asList(ad));
		
		e.setDepartments(Arrays.asList("qa","developer"));

		Employee empobj = repo.save(e);

		return empobj;
	}
	


	@Override
	public boolean deleteEmployee(int empid) {

		
		
		repo.deleteById(empid);
		
		return true;
	}

}
