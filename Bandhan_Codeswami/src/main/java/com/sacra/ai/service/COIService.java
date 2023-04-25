package com.sacra.ai.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacra.ai.entity.COI;
import com.sacra.ai.repository.COIRepository;

@Service
public class COIService {

    @Autowired
    private COIRepository coiRepository;

    public COI findByCustomerId(Long customerId) {
        return coiRepository.findByCustomerId(customerId);
    }

    public List<COI> findByProductName(String productName) {
        return coiRepository.findByProductName(productName);
    }

    public List<COI> findByEnrolmentDate(LocalDate enrolmentDate) {
        return coiRepository.findByEnrolmentDate(enrolmentDate);
    }

    public List<COI> findByTransmissionStatus(String transmissionStatus) {
        return coiRepository.findByTransmissionStatus(transmissionStatus);
    }

    public List<COI> findByDownloadAPI(String downloadAPI) {
        return coiRepository.findByDownloadAPI(downloadAPI);
    }

    public List<COI> findByAccuracy(String accuracy) {
        return coiRepository.findByAccuracy(accuracy);
    }

    public List<COI> findByTransmissionTime(LocalTime transmissionTime) {
        return coiRepository.findByTransmissionTime(transmissionTime);
    }

    public List<COI> findByReadability(String readability) {
        return coiRepository.findByReadability(readability);
    }

    public List<COI> findByConfirmationStatus(String confirmationStatus) {
        return coiRepository.findByConfirmationStatus(confirmationStatus);
    }

    public List<COI> findBySMSNotification(String smsNotification) {
        return coiRepository.findBySMSNotification(smsNotification);
    }

    public List<COI> findByEmailNotification(String emailNotification) {
        return coiRepository.findByEmailNotification(emailNotification);
    }

}