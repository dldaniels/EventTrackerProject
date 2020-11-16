package com.skilldistillery.run.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.run.entities.Run;
import com.skilldistillery.run.repositories.RunRepository;

@Service
public class RunServiceImpl  implements RunService{
	
	@Autowired
	private RunRepository repo;
	
	public List<Run> index() {
		List<Run> allRuns = repo.findAll();
		return allRuns;
	}

	@Override
	public Run showRun(Integer runId) {
		Optional<Run> runOpt = repo.findById(runId);
		Run run = null;
		if(runOpt.isPresent()) {
			run = runOpt.get();
		}
		return run;
	}

	@Override
	public Run createRun(Run run) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Run updateRun(Run run, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteRun(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
