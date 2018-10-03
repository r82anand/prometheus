/*
 * Copyright (c) 2018 Author(s). All rights reserved.
 * 
 * @Author	- Anand Sivadas
 * @Date	- 3 Oct, 2018
 * 
 * 
 */
package com.sivadas.anand.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Address.
 */
@Entity
@Table(name="ADDRESS")
public class Address implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4166621025008156159L;
	
	/** The id. */
	@Id
	@GeneratedValue
	private int id;
	
	/** The house num. */
	@Column(name="HOUSE_NUM")
	private String houseNum;
	
	/** The street. */
	@Column(name="STREET")
	private String street;
	
	/** The address type. */
	@Column(name="ADD_TYPE")
	private String addressType;
	
	/** The state. */
	@Column(name="STATE")
	private String state;
	
	/** The country. */
	@Column(name="COUNTRY")
	private String country;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Gets the house num.
	 *
	 * @return the house num
	 */
	public String getHouseNum() {
		return houseNum;
	}
	
	/**
	 * Sets the house num.
	 *
	 * @param houseNum the new house num
	 */
	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}
	
	/**
	 * Gets the street.
	 *
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	
	/**
	 * Sets the street.
	 *
	 * @param street the new street
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	
	/**
	 * Gets the address type.
	 *
	 * @return the address type
	 */
	public String getAddressType() {
		return addressType;
	}
	
	/**
	 * Sets the address type.
	 *
	 * @param addressType the new address type
	 */
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	
	/**
	 * Sets the country.
	 *
	 * @param country the new country
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	

}
