package com.BikkadIt.UMA.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
	
	@Id
	@Column(name = "country_id")
	private Integer countryId;
	
	@Column(name = "country_name")
	private String countryName;

	public Integer getCountryId() {
		return countryId;
	}

	public String getCountryName() {
		return countryName;
	}
	
	
	

}
