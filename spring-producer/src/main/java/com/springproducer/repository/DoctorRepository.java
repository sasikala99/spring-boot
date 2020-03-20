package com.springproducer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproducer.model.Doctordetails;

@Repository
public interface DoctorRepository extends JpaRepository<Doctordetails, String> {

}
