package com.hrapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hrapi.model.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}