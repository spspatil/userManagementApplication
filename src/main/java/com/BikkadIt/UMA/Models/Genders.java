package com.BikkadIt.UMA.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Genders")
public class Genders {
	
	@Id
	@Column(name = "gender_id")
	private Integer genderId;
	
	@Column(name =  "gender_name")
	private String genderName;

	public Integer getGenderId() {
		return genderId;
	}

	public String getGenderName() {
		return genderName;
	}
	
	

}
