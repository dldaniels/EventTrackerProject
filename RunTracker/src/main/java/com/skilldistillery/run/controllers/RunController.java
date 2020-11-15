package com.skilldistillery.run.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.run.services.RunService;

@RequestMapping("api")
@RestController
public class RunController {
	
	@Autowired
	private RunService svc;
	
	@RequestMapping(path ="ping" , method = RequestMethod.GET)
	public String ping() {
		return "pong!";
	}
	
	

}
