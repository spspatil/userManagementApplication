package com.BikkadIt.UMA.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City {
	
	@Id
	@Column(name = "city_id")
	private Integer cityId;

	@Column(name = "city_name")
	private String cityName;

	public Integer getCityId() {
		return cityId;
	}

	public String getCityName() {
		return cityName;
	}
	
	
	
	
}
