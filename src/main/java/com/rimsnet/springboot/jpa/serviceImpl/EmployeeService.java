package com.rimsnet.springboot.jpa.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rimsnet.springboot.jpa.entities.Employee;
import com.rimsnet.springboot.jpa.repo.EmployeeRepository;
import com.rimsnet.springboot.jpa.service.IEmployeeService;


@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(Employee employee) {

		employeeRepository.save(employee);

	}

}
