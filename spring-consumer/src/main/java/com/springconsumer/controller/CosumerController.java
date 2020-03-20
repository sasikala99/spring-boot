package com.springconsumer.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springconsumer.model.Doctordetails;

@RestController
public class CosumerController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value="/consumerLoadDoctorDetails" , produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String,Object> loadDoctorDetails(){
		Map<String,Object> resultMapObj = new HashMap<String,Object>();
		try {
			String response = restTemplate.getForObject("http://localhost:8761/api/spring-producer/loadDoctorDetails", String.class);			
			resultMapObj.put("doctorDetailsListObj", response);
		} catch(Exception e) {
			e.printStackTrace();
			resultMapObj.put("status", e.getMessage());
		}
		return resultMapObj;
	}
	
	@PostMapping(value="/consumerSaveDoctorDetails" , produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE)
	public Map<String,Object> saveDoctorDetails(@RequestBody Doctordetails doctordetails){
		Map<String,Object> resultMapObj = new HashMap<String,Object>();
		try {
			ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:8761/api/spring-producer/saveDoctorDetails",doctordetails, String.class);			
			resultMapObj.put("statuscode", response.getStatusCode());
		} catch(Exception e) {
			e.printStackTrace();
			resultMapObj.put("status", e.getMessage());
		}
		return resultMapObj;
	}
}
