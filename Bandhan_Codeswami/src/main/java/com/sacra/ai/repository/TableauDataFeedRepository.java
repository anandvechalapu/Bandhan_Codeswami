package com.sacra.ai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableauDataFeedRepository extends JpaRepository<TableauDataFeed, Long> { 

	public List<TableauDataFeed> findAllByCompatibleWithTableauRequirements(boolean compatibleWithTableauRequirements);
	
	public List<TableauDataFeed> findAllByAccurateAndTimelyDataForAnalysis(boolean accurateAndTimelyDataForAnalysis);
	
	public List<TableauDataFeed> findAllByAccuratelyTransmitDataToTableau(boolean accuratelyTransmitDataToTableau);
	
}