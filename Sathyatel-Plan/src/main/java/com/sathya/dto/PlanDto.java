package com.sathya.dto;

public class PlanDto {
private Long planId;
private String planName;
private String tenure;
public PlanDto() {
	super();
}
public Long getPlanId() {
	return planId;
}
public void setPlanId(Long planId) {
	this.planId = planId;
}
public String getPlanName() {
	return planName;
}
public void setPlanName(String planName) {
	this.planName = planName;
}
public String getTenure() {
	return tenure;
}
public void setTenure(String tenure) {
	this.tenure = tenure;
}
@Override
public String toString() {
	return "PlanDto [planId=" + planId + ", planName=" + planName + ", tenure=" + tenure + "]";
}

}
