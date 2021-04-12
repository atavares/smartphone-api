package com.vivo.smartphoneapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivo.smartphoneapi.dto.SmartPhoneDto;
import com.vivo.smartphoneapi.form.SmartPhoneForm;
import com.vivo.smartphoneapi.model.SmartPhone;
import com.vivo.smartphoneapi.service.SmartPhoneService;

@RestController
@RequestMapping("/smartPhone")
public class SmartPhoneController {
	
	private SmartPhoneService smartPhoneService;
	
	@Autowired
	public SmartPhoneController(SmartPhoneService smartPhoneService) {
		this.smartPhoneService = smartPhoneService;
	}
	
	@PostMapping
	public ResponseEntity<?> cadastrar(@RequestBody SmartPhoneForm form){
		try {
			SmartPhone smartPhone = form.converter(form);
			smartPhoneService.cadastrar(smartPhone);
			
			return ResponseEntity.status(HttpStatus.CREATED).body(new SmartPhoneDto(smartPhone));
			
		}catch (RuntimeException re) {
			
			return ResponseEntity.badRequest().body(re.getMessage());
		}
	}

}
