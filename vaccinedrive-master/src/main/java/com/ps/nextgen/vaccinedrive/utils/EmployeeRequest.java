package com.ps.nextgen.vaccinedrive.utils;

import com.ps.nextgen.vaccinedrive.repository.impl.EmployeeRecord;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequest {
    List<EmployeeRecord> employeeData;
 }
