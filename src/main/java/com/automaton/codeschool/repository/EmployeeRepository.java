package com.automaton.codeschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.automaton.codeschool.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}