package com.skilldistillery.run.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.run.entities.Run;
import com.skilldistillery.run.repositories.RunRepository;

@Service
public class RunServiceImpl  implements RunService{
	
	@Autowired
	private RunRepository repo;
	
	public List<Run> getAllRuns() {
		return null;
	}

}
