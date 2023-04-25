@Repository
package com.sacra.ai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sacra.ai.entity.COI;

@Repository
public interface COIRepository extends JpaRepository<COI, Long> {

    COI findByCustomerId(Long customerId);
    List<COI> findByProductName(String productName);
    List<COI> findByEnrolmentDate(LocalDate enrolmentDate);
    List<COI> findByTransmissionStatus(String transmissionStatus);
    List<COI> findByDownloadAPI(String downloadAPI);
    List<COI> findByAccuracy(String accuracy);
    List<COI> findByTransmissionTime(LocalTime transmissionTime);
    List<COI> findByReadability(String readability);
    List<COI> findByConfirmationStatus(String confirmationStatus);
    List<COI> findBySMSNotification(String smsNotification);
    List<COI> findByEmailNotification(String emailNotification);

}