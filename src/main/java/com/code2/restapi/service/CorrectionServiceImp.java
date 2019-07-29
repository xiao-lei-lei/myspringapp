package com.code2.restapi.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code2.restapi.entity.Correction;
import com.code2.restapi.repository.CorrectionRepository;

@Service
public class CorrectionServiceImp implements CorrectionService {

	@Autowired
	private CorrectionRepository correctionRepo;
	
	
	@Override
	@Transactional
	public Correction create(Correction correct) {
		// TODO Auto-generated method stub
		return correctionRepo.save(correct);
	}

}
