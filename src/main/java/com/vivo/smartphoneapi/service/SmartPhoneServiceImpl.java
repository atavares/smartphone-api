package com.vivo.smartphoneapi.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivo.smartphoneapi.model.SmartPhone;
import com.vivo.smartphoneapi.repository.SmartPhoneRepository;

@Service
public class SmartPhoneServiceImpl implements SmartPhoneService{

	private SmartPhoneRepository smartPhoneRepository;

	@Autowired
	public SmartPhoneServiceImpl(SmartPhoneRepository smartPhoneRepository) {
		this.smartPhoneRepository = smartPhoneRepository;
	}
	
	@Transactional
	@Override
	public void cadastrar(SmartPhone smartPhone) {
		smartPhoneRepository.save(smartPhone);
		
	}

}
