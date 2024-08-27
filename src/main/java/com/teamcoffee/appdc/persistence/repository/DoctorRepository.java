package com.teamcoffee.appdc.persistence.repository;

import com.teamcoffee.appdc.persistence.entity.AdmissionHistory;
import com.teamcoffee.appdc.persistence.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
