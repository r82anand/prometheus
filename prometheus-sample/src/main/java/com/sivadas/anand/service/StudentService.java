/*
 * Copyright (c) 2018 Author(s). All rights reserved.
 * 
 * @Author	- Anand Sivadas
 * @Date	- 3 Oct, 2018
 * 
 * 
 */
package com.sivadas.anand.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.sivadas.anand.domain.Address;
import com.sivadas.anand.domain.Student;
import com.sivadas.anand.repo.AddressRepository;
import com.sivadas.anand.repo.StudentReposiroty;

/**
 * The Class StudentService.
 */
public class StudentService {
	
	/** The logger. */
	private static Logger LOGGER = LoggerFactory.getLogger(StudentService.class);
	
	/** The student reposiroty. */
	@Autowired
	private StudentReposiroty studentReposiroty;
	
	/** The address repository. */
	@Autowired
	private AddressRepository addressRepository;
	
	/**
	 * Gets the student by id.
	 *
	 * @param id the id
	 * @return the student by id
	 */
	public Optional<Student> getStudentById(int id) {

		Optional<Student> student = studentReposiroty.findById(id);
		return student;
	}
	
	/**
	 * Gets the all students.
	 *
	 * @return the all students
	 */
	public List<Student> getAllStudents() {
		
		List<Student> allStudents = studentReposiroty.findAll();
		return allStudents;
	}
	
	/**
	 * Gets the all address.
	 *
	 * @return the all address
	 */
	public List<Address> getAllAddress() {
		
		List<Address> allAddresses = addressRepository.findAll();
		return allAddresses;
	}

}
