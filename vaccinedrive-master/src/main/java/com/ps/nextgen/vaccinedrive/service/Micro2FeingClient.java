package com.ps.nextgen.vaccinedrive.service;

import com.ps.nextgen.vaccinedrive.repository.impl.VaccinatedEmployeeDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@FeignClient(name = "USER-CLIENT", url = "http://vaccination-record:8092/vaccine-api")
public interface Micro2FeingClient {

    @RequestMapping(method = RequestMethod.GET, value = "/allEmployee")
    List<VaccinatedEmployeeDetails> getUsers();
}