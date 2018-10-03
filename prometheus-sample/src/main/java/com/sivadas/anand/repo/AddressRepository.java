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

/**
 * The Interface AddressRepository.
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

	/**
	 * Find address by id.
	 *
	 * @param addId the add id
	 * @return the address
	 */
	public Address findAddressById(Integer addId);
}
