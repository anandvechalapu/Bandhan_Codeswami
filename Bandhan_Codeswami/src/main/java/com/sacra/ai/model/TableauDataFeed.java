package com.sacra.ai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TableauDataFeed {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private boolean compatibleWithTableauRequirements;
	
	private boolean accurateAndTimelyDataForAnalysis;
	
	private boolean accuratelyTransmitDataToTableau;
	
	public TableauDataFeed() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isCompatibleWithTableauRequirements() {
		return compatibleWithTableauRequirements;
	}

	public void setCompatibleWithTableauRequirements(boolean compatibleWithTableauRequirements) {
		this.compatibleWithTableauRequirements = compatibleWithTableauRequirements;
	}

	public boolean isAccurateAndTimelyDataForAnalysis() {
		return accurateAndTimelyDataForAnalysis;
	}

	public void setAccurateAndTimelyDataForAnalysis(boolean accurateAndTimelyDataForAnalysis) {
		this.accurateAndTimelyDataForAnalysis = accurateAndTimelyDataForAnalysis;
	}

	public boolean isAccuratelyTransmitDataToTableau() {
		return accuratelyTransmitDataToTableau;
	}

	public void setAccuratelyTransmitDataToTableau(boolean accuratelyTransmitDataToTableau) {
		this.accuratelyTransmitDataToTableau = accuratelyTransmitDataToTableau;
	}
	
	

}