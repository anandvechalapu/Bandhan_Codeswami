package com.sacra.ai.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacra.ai.entity.COI;
import com.sacra.ai.entity.TableauDataFeed;
import com.sacra.ai.service.COIService;
import com.sacra.ai.service.TableauDataFeedService;

@RestController
@RequestMapping("/api/v1")
public class DataServiceController {
	
	@Autowired
	private TableauDataFeedService tableauDataFeedService;
	
	@Autowired
	private COIService coiService;
	
	@GetMapping("/tableauDataFeed/compatibleWithTableauRequirements/{compatibleWithTableauRequirements}")
	public ResponseEntity<List<TableauDataFeed>> getTableauDataFeedByCompatibleWithTableauRequirements(@PathVariable boolean compatibleWithTableauRequirements) {
		List<TableauDataFeed> tableauDataFeedList = tableauDataFeedService.findAllByCompatibleWithTableauRequirements(compatibleWithTableauRequirements);
		return new ResponseEntity<>(tableauDataFeedList, HttpStatus.OK);
	}
	
	@GetMapping("/tableauDataFeed/accurateAndTimelyDataForAnalysis/{accurateAndTimelyDataForAnalysis}")
	public ResponseEntity<List<TableauDataFeed>> getTableauDataFeedByAccurateAndTimelyDataForAnalysis(@PathVariable boolean accurateAndTimelyDataForAnalysis) {
		List<TableauDataFeed> tableauDataFeedList = tableauDataFeedService.findAllByAccurateAndTimelyDataForAnalysis(accurateAndTimelyDataForAnalysis);
		return new ResponseEntity<>(tableauDataFeedList, HttpStatus.OK);
	}
	
	@GetMapping("/tableauDataFeed/accuratelyTransmitDataToTableau/{accuratelyTransmitDataToTableau}")
	public ResponseEntity<List<TableauDataFeed>> getTableauDataFeedByAccuratelyTransmitDataToTableau(@PathVariable boolean accuratelyTransmitDataToTableau) {
		List<TableauDataFeed> tableauDataFeedList = tableauDataFeedService.findAllByAccuratelyTransmitDataToTableau(accuratelyTransmitDataToTableau);
		return new ResponseEntity<>(tableauDataFeedList, HttpStatus.OK);
	}
	
	@GetMapping("/coi/customerId/{customerId}")
	public ResponseEntity<COI> getCOIByCustomerId(@PathVariable Long customerId) {
		COI coi = coiService.findByCustomerId(customerId);
		return new ResponseEntity<>(coi, HttpStatus.OK);
	}
	
	@GetMapping("/coi/productName/{productName}")
	public ResponseEntity<List<COI>> getCOIByProductName(@PathVariable String productName) {
		List<COI> coiList = coiService.findByProductName(productName);
		return new ResponseEntity<>(coiList, HttpStatus.OK);
	}
	
	@GetMapping("/coi/enrolmentDate/{enrolmentDate}")
	public ResponseEntity<List<COI>> getCOIByEnrolmentDate(@PathVariable LocalDate enrolmentDate) {
		List<COI> coiList = coiService.findByEnrolmentDate(enrolmentDate);
		return new ResponseEntity<>(coiList, HttpStatus.OK);
	}
	
	@GetMapping("/coi/transmissionStatus/{transmissionStatus}")
	public ResponseEntity<List<COI>> getCO