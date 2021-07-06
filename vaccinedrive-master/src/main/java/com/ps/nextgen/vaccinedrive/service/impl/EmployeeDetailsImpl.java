package com.ps.nextgen.vaccinedrive.service.impl;

import com.google.gson.Gson;
import com.ps.nextgen.vaccinedrive.repository.dao.EmpRepository;
import com.ps.nextgen.vaccinedrive.repository.impl.EmployeeRecord;
import com.ps.nextgen.vaccinedrive.repository.impl.VaccinatedEmployeeDetails;
import com.ps.nextgen.vaccinedrive.service.EmployeeDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;


@Service
@Slf4j
public class EmployeeDetailsImpl implements EmployeeDetails {

    @Autowired
    EmpRepository empRepository;

    public String insertRecord(List<EmployeeRecord> records){
        if(records.size() != 0) {
            records.stream().forEach(emp -> {
                empRepository.save(emp);
                log.info("RECODE ENTERED IN DB: "+ emp);
            });
        }
        return "Recoded";
    }

    public String deleteRecord(List<EmployeeRecord> records){
        records.stream().forEach(emp -> {
            empRepository.deleteById(emp.getEmpId());
            log.info("RECODE DELETED from DB with ID: "+emp.getEmpId());
        });
        return "Record deleted";
    }

    public String getRecord(){
        List<EmployeeRecord> employeeRecords = empRepository.findAll();
        Gson gson = new Gson();
        String jsonEmployeeList = gson.toJson(employeeRecords);
        return jsonEmployeeList;
    }

    public String getAllNonVaccinatedUsers(List<VaccinatedEmployeeDetails> getAllUser){
        List<EmployeeRecord> employeeRecords = empRepository.findAll();
        List<EmployeeRecord> vaccinatedEmp = employeeRecords.stream()
                .filter(emp -> getAllUser.stream()
                        .anyMatch(vemp -> vemp.getId().equals(emp.getEmpId())
                               ))
                .collect(Collectors.toList());
        vaccinatedEmp.stream().forEach(l -> employeeRecords.remove(l));
        Gson gson = new Gson();
        String jsonEmployeeList = gson.toJson(employeeRecords);
        return jsonEmployeeList;
    }

    public String EditRecord(List<EmployeeRecord> records){
        return "";
    }

}
