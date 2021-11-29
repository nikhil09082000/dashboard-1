package com.trainee.project.dashboard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOM_MODEL")
public class Test {
	@Id
	@Column(name="MODEL_CODE")
	private Integer modelcode;
	
	@Column(name="MODEL_DESCRIPTION")
	private String modeldesc;
	
	@Column(name="MODEL_TYPE")
	private String modeltype;
	
	@Column(name="STATUS")
	private String status;

	public Integer getModelcode() {
		return modelcode;
	}

	public void setModelcode(Integer modelcode) {
		this.modelcode = modelcode;
	}

	public String getModeldesc() {
		return modeldesc;
	}

	public void setModeldesc(String modeldesc) {
		this.modeldesc = modeldesc;
	}

	public String getModeltype() {
		return modeltype;
	}

	public void setModeltype(String modeltype) {
		this.modeltype = modeltype;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Test [modelcode=" + modelcode + ", modeldesc=" + modeldesc + ", modeltype=" + modeltype + ", status="
				+ status + "]";
	}

	
	
	

}
