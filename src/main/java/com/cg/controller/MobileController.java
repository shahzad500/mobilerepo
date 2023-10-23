package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Mobile;
import com.cg.service.MobileService;
	

@RestController
@RequestMapping("/mobileapi")
public class MobileController {
	@Autowired
	private MobileService mservice;

	@PostMapping("/add")
	public String addMobile(@RequestBody Mobile mp) {

		return mservice.addMobile(mp);

	}

	@GetMapping("/get")

	public List<Mobile> getAll() {

		return mservice.getallMobiles();

	}

}


