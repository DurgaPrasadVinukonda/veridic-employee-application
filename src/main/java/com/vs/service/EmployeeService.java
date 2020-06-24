package com.vs.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vs.model.Employee;
import com.vs.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	public List<Employee> listAll(){
		 return repo.findAll();
	}
	
	
	public void save(Employee employee) {
		repo.save(employee);
		
	}
	
	
	public Employee get(int eid) {
		return repo.findById(eid).get();
	}
	
	public void delete(int eid) {
		repo.deleteById(eid);
	}

}
