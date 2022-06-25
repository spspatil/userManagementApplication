package com.BikkadIt.UMA.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CITIES_MASTER")
public class City {
	
	@Id
	@Column(name = "city_id")
	private Integer cityId;

	@Column(name = "city_name")
	private String cityName;
	
	private Integer countryId;
	
	private Integer stateId;

	public Integer getStateId() {
		return stateId;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public Integer getCityId() {
		return cityId;
	}

	public String getCityName() {
		return cityName;
	}
	
	
	
	
}
