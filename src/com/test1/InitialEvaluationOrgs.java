package com.test1;

public class InitialEvaluationOrgs {
	private long initialEvaluationOrgCode;
	private String initialEvaluationOrgName;
	private String initialEvaluationOrgDesc;
	private String remarks;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public InitialEvaluationOrgs() {

	}

	public InitialEvaluationOrgs(long initialEvaluationOrgCode, String initialEvaluationOrgName,
			String initialEvaluationOrgDesc, String remarks, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.initialEvaluationOrgCode = initialEvaluationOrgCode;
		this.initialEvaluationOrgName = initialEvaluationOrgName;
		this.initialEvaluationOrgDesc = initialEvaluationOrgDesc;
		this.remarks = remarks;
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

	public String getInitialEvaluationOrgName() {
		return initialEvaluationOrgName;
	}

	public void setInitialEvaluationOrgName(String initialEvaluationOrgName) {
		this.initialEvaluationOrgName = initialEvaluationOrgName;
	}

	public String getInitialEvaluationOrgDesc() {
		return initialEvaluationOrgDesc;
	}

	public void setInitialEvaluationOrgDesc(String initialEvaluationOrgDesc) {
		this.initialEvaluationOrgDesc = initialEvaluationOrgDesc;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
