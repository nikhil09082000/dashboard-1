package com.trainee.project.dashboard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADVISOR")
public class Advisor {
	@Id
	@Column(name="ADVISOR_ID")
	private Integer advid;
	@Column(name="ADVISOR_NAME")
	private String advname;
	public Integer getAdvid() {
		return advid;
	}
	public void setAdvid(Integer advid) {
		this.advid = advid;
	}
	public String getAdvname() {
		return advname;
	}
	public void setAdvname(String advname) {
		this.advname = advname;
	}
	@Override
	public String toString() {
		return "Advisor [advid=" + advid + ", advname=" + advname + "]";
	}
	

}
