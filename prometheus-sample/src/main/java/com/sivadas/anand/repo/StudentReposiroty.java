/*
 * Copyright (c) 2018 Author(s). All rights reserved.
 * 
 * @Author	- Anand Sivadas
 * @Date	- 3 Oct, 2018
 * 
 * 
 */
package com.sivadas.anand.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sivadas.anand.domain.Address;
import com.sivadas.anand.domain.Student;

/**
 * The Interface StudentReposiroty.
 */
@Repository
public interface StudentReposiroty extends JpaRepository<Student, Integer> {
	
	/**
	 * Find student by address.
	 *
	 * @param address the address
	 * @return the student
	 */
	public Student findStudentByAddress(Address address);

}
