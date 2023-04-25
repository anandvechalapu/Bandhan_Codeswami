package com.sacra.ai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacra.ai.repository.TableauDataFeedRepository;

@Service
public class TableauDataFeedService {

	@Autowired
	private TableauDataFeedRepository tableauDataFeedRepository;
	
	public List<TableauDataFeed> findAllByCompatibleWithTableauRequirements(boolean compatibleWithTableauRequirements) {
		return this.tableauDataFeedRepository.findAllByCompatibleWithTableauRequirements(compatibleWithTableauRequirements);
	}
	
	public List<TableauDataFeed> findAllByAccurateAndTimelyDataForAnalysis(boolean accurateAndTimelyDataForAnalysis) {
		return this.tableauDataFeedRepository.findAllByAccurateAndTimelyDataForAnalysis(accurateAndTimelyDataForAnalysis);
	}
	
	public List<TableauDataFeed> findAllByAccuratelyTransmitDataToTableau(boolean accuratelyTransmitDataToTableau) {
		return this.tableauDataFeedRepository.findAllByAccuratelyTransmitDataToTableau(accuratelyTransmitDataToTableau);
	}
	
}