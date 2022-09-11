package com.postgresql.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postgresql.repostitory.DatasRepository;

@RestController
@RequestMapping("/datas")
public class datasController {
	
	private final DatasRepository datasRepository ;
	
	public datasController(DatasRepository datasRepository) {
		this.datasRepository = datasRepository; 
	}
	
	@GetMapping
	public ResponseEntity getAllDatas() {
		return ResponseEntity.ok(this.datasRepository.findAll());
	}

}
