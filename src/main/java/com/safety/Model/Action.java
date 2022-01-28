package com.safety.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="action")
public class Action {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int actionId;
	
	private int rfaId;
	
	@NotEmpty(message="actionInfo should not be empty..")
	@Column(name="actionInfo",nullable = false)
	private String actionInfo;
	
	@NotEmpty(message="status field should not be empty..")
	@Column(name="status",nullable = false)
	private String status;

	public int getActionId() {
		return actionId;
	}

	public void setActionId(int actionId) {
		this.actionId = actionId;
	}

	public int getRfaId() {
		return rfaId;
	}

	public void setRfaId(int rfaId) {
		this.rfaId = rfaId;
	}

	public String getActionInfo() {
		return actionInfo;
	}

	public void setActionInfo(String actionInfo) {
		this.actionInfo = actionInfo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Action [actionId=" + actionId + ", rfaId=" + rfaId + ", actionInfo=" + actionInfo + ", status=" + status
				+ "]";
	}

	
	
}
