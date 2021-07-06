package com.ps.nextgen.vaccinedrive.service;

import com.ps.nextgen.vaccinedrive.repository.impl.EmployeeRecord;
import com.ps.nextgen.vaccinedrive.repository.impl.VaccinatedEmployeeDetails;

import java.util.List;

public interface EmployeeDetails {
    public String insertRecord(List<EmployeeRecord> records);
    public String deleteRecord(List<EmployeeRecord> records);
    public String getRecord();
    public String getAllNonVaccinatedUsers(List<VaccinatedEmployeeDetails> getAllUser);
    public String EditRecord(List<EmployeeRecord> records);
}
