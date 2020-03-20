package com.springadminclient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springadminclient.model.Doctordetails;

@Repository
public interface DoctorRepository extends JpaRepository<Doctordetails, String> {

}
