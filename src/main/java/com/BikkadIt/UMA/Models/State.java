package com.BikkadIt.UMA.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class State {
	@Id
	@Column(name = "state_id")
	private Integer stateId;
	
	@Column(name = "state_name")
	private String stateName;

	public Integer getStateId() {
		return stateId;
	}

	public String getStateName() {
		return stateName;
	}

	
}
