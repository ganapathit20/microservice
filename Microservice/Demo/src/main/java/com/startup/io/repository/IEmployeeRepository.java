package com.startup.io.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.startup.io.entity.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer>{

}
