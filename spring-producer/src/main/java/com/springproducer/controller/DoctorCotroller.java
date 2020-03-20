package com.springproducer.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springproducer.model.Doctordetails;
import com.springproducer.repository.DoctorRepository;

@RestController
public class DoctorCotroller {
	@Autowired
	private DoctorRepository doctorRepository;
	
	@PostMapping(value="/saveDoctorDetails" , produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE)
	public Map<String,Object> saveDoctorDetails(@RequestBody Doctordetails doctorDetails){
		Map<String,Object> resultMapObj = new HashMap<String,Object>();
		try {			
			doctorRepository.save(doctorDetails);
			resultMapObj.put("doctorDetailsListObj", doctorRepository.findAll());
		} catch(Exception e) {
			e.printStackTrace();
			resultMapObj.put("error", e.getMessage());
		}		
		return resultMapObj;
	}
	    
	@GetMapping(value="/loadDoctorDetails" , produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String,Object> loadDoctorDetails(){
		Map<String,Object> resultMapObj = new HashMap<String,Object>();
		try {
			resultMapObj.put("doctorDetailsListObj", doctorRepository.findAll());
		} catch(Exception e) {
			e.printStackTrace();
			resultMapObj.put("status", e.getMessage());
		}
		return resultMapObj;
	}
	   
	@GetMapping(value="/loadDoctorDetailsBasedOnDoctorid/{doctorid}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String,Object> loadDoctorDetailsBasedOnDoctorid(@PathVariable("doctorid") String doctorid){
		Map<String,Object> resultMapObj = new HashMap<String,Object>();
		try {
			resultMapObj.put("doctorDetailsListObj", doctorRepository.findById(doctorid));
		} catch(Exception e) {
			e.printStackTrace();
			resultMapObj.put("status", e.getMessage());
		}
		return resultMapObj;
	}
}
