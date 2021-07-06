package com.ps.nextgen.vaccinedrive.repository.dao;

import com.ps.nextgen.vaccinedrive.repository.impl.EmployeeRecord;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpRepository extends MongoRepository<EmployeeRecord,Integer> {

    @Override
    Optional<EmployeeRecord> findById(Integer integer);
}
