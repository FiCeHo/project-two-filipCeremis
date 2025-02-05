package com.travelport.projecttwo.jpa;

import com.travelport.projecttwo.entities.SalesRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SalesRecordRepository extends JpaRepository<SalesRecord, UUID> {
    List<SalesRecord> findByClientId(UUID clientId);
    List<SalesRecord> findTop5ByOrderByQuantitySoldDesc();
}
