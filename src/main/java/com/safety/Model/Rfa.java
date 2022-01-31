package com.safety.Model;

import java.util.List;
import java.util.stream.Collector;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="rfa")
public class Rfa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rfaId;
	
	private int incidentId;
	
	@NotEmpty(message="reason field should not be empty..")
	@Column(name="reason",nullable = false)
	private String reason;
	
	@NotEmpty(message="action field should not be empty..")
	@Column(name="action",nullable = false)
	private String action;

	public int getRfaId() {
		return rfaId;
	}

	public void setRfaId(int rfaId) {
		this.rfaId = rfaId;
	}

	public int getIncidentId() {
		return incidentId;
	}

	public void setIncidentId(int incidentId) {
		this.incidentId = incidentId;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	

	public Rfa(int rfaId, int incidentId, @NotEmpty(message = "reason field should not be empty..") String reason,
			@NotEmpty(message = "action field should not be empty..") String action) {
		super();
		this.rfaId = rfaId;
		this.incidentId = incidentId;
		this.reason = reason;
		this.action = action;
	}
	

	public Rfa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Rfa [rfaId=" + rfaId + ", incidentId=" + incidentId + ", reason=" + reason + ", action=" + action + "]";
	}

	
 	

	
	
 }