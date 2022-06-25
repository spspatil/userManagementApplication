package com.BikkadIt.UMA.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STATES_MASTER")
public class State {
	@Id
	@Column(name = "state_id")
	private Integer stateId;
	
	@Column(name = "state_name")
	private String stateName;
	
	private Integer countryId;

	public Integer getCountryId() {
		return countryId;
	}

	public Integer getStateId() {
		return stateId;
	}

	public String getStateName() {
		return stateName;
	}

	
}
