/*
 * Copyright (c) 2018 Author(s). All rights reserved.
 * 
 * @Author	- Anand Sivadas
 * @Date	- 3 Oct, 2018
 * 
 * 
 */
package com.sivadas.anand.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sivadas.anand.domain.Address;
import com.sivadas.anand.domain.Student;
import com.sivadas.anand.service.StudentService;

/**
 * The Class StudentController.
 */
@RestController
@CrossOrigin
public class StudentController {

	/** The student service. */
	@Autowired
	private StudentService studentService;

	/**
	 * Gets the adds the students.
	 *
	 * @return the adds the students
	 */
	@ResponseStatus(value=HttpStatus.OK)
	@RequestMapping(method=RequestMethod.GET, value="/students", produces="application/json; charset=utf-8")
	public List<Student> getAddStudents() {
		
		List<Student> allStudents = studentService.getAllStudents();
		return allStudents;
	}
	
	/**
	 * Gets the student by id.
	 *
	 * @param id the id
	 * @return the student by id
	 */
	@ResponseStatus(value=HttpStatus.OK)
	@RequestMapping(method=RequestMethod.GET, value="/student/{id}", produces="application/json; charset=utf-8")
	public Optional<Student> getStudentById(@PathVariable(name="id") Integer id) {
		
		Optional<Student> studentById = studentService.getStudentById(id);
		return studentById;
	}
	
	/**
	 * Gets the all address.
	 *
	 * @return the all address
	 */
	@ResponseStatus(value=HttpStatus.OK)
	@RequestMapping(method=RequestMethod.GET, value="/addresses", produces="application/json; charset=utf-8")
	public List<Address> getAllAddress() {
		
		List<Address> allAddress = studentService.getAllAddress();
		return allAddress;
	}
	
}
