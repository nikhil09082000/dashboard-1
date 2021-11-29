package com.trainee.project.dashboard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADVISOR_MODEL")
public class AdvisorModel {
	@Column(name="MODEL_CODE")
	private String advmodelcode;
	@Id
	@Column(name="ADVISOR_ID")
	private Integer advmodelid;
	@Column(name="EFFECTIVE_DATE")
	private String advmodeldate;
	public String getAdvmodelcode() {
		return advmodelcode;
	}
	public void setAdvmodelcode(String advmodelcode) {
		this.advmodelcode = advmodelcode;
	}
	public Integer getAdvmodelid() {
		return advmodelid;
	}
	public void setAdvmodelid(Integer advmodelid) {
		this.advmodelid = advmodelid;
	}
	public String getAdvmodeldate() {
		return advmodeldate;
	}
	public void setAdvmodeldate(String advmodeldate) {
		this.advmodeldate = advmodeldate;
	}
	@Override
	public String toString() {
		return "AdvisorModel [advmodelcode=" + advmodelcode + ", advmodelid=" + advmodelid + ", advmodeldate="
				+ advmodeldate + "]";
	}
	

}
