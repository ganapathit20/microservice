package com.startup.io.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startup.io.controller.RestController;
import com.startup.io.entity.Employee;
import com.startup.io.repository.IEmployeeRepository;

@Service
public class EmployeeService {

	private final static Logger log = LoggerFactory.getLogger(RestController.class);
	
	@Autowired
	private IEmployeeRepository empRepo;
	
	public void addNewEmployee(Employee newEmployee) {
		log.debug("enterying addNewEmployee service");
		empRepo.save(newEmployee);
	}

	public List<Employee> getAllEmployeeInformation() {
		log.debug("enterying addNewEmployee service");
		return empRepo.findAll();
		
	}

}
