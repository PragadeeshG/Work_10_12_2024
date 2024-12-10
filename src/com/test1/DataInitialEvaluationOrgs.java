package com.test1;

public class DataInitialEvaluationOrgs {
	private long initialEvaluationOrgCode;
	private String modularData;
	private String dataReqion;
	private String initialEvaluationOrgTeam;
	private String contact;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DataInitialEvaluationOrgs() {

	}

	public DataInitialEvaluationOrgs(long initialEvaluationOrgCode, String modularData, String dataReqion,
			String initialEvaluationOrgTeam, String contact, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.initialEvaluationOrgCode = initialEvaluationOrgCode;
		this.modularData = modularData;
		this.dataReqion = dataReqion;
		this.initialEvaluationOrgTeam = initialEvaluationOrgTeam;
		this.contact = contact;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getInitialEvaluationOrgCode() {
		return initialEvaluationOrgCode;
	}

	public void setInitialEvaluationOrgCode(long initialEvaluationOrgCode) {
		this.initialEvaluationOrgCode = initialEvaluationOrgCode;
	}

	public String getModularData() {
		return modularData;
	}

	public void setModularData(String modularData) {
		this.modularData = modularData;
	}

	public String getDataReqion() {
		return dataReqion;
	}

	public void setDataReqion(String dataReqion) {
		this.dataReqion = dataReqion;
	}

	public String getInitialEvaluationOrgTeam() {
		return initialEvaluationOrgTeam;
	}

	public void setInitialEvaluationOrgTeam(String initialEvaluationOrgTeam) {
		this.initialEvaluationOrgTeam = initialEvaluationOrgTeam;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
