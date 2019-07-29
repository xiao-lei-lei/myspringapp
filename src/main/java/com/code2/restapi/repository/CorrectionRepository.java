package com.code2.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.code2.restapi.entity.Correction;

@Repository
public interface CorrectionRepository extends JpaRepository<Correction, Long>{

}
