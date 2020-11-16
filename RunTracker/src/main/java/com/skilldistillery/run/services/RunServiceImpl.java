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
		repo.saveAndFlush(run);
		return null;
	}

	@Override
	public Run updateRun(Run run, Integer id) {
		Optional<Run> runOpt = repo.findById(id);
		Run managedRun = null;
		if(runOpt.isPresent()) {
			managedRun = runOpt.get();
		if(run.getName() != null) {managedRun.setName(run.getName()); }
		if(run.getDistance() != null) {managedRun.setDistance(run.getDistance()); }
		if(run.getTime() != null) {managedRun.setTime(run.getTime()); }
		if(run.getCalories() != null) {managedRun.setCalories(run.getCalories()); }
		if(run.getElevationGain() != null) {managedRun.setElevationGain(run.getElevationGain()); }
		if(run.getDate() != null) {managedRun.setDate(run.getDate()); }
		if(run.getAvgHeartRate() != null) {managedRun.setAvgHeartRate(run.getAvgHeartRate()); }
		if(run.getLocation() != null) {managedRun.setLocation(run.getLocation()); }
		repo.flush();
		}
		return managedRun;
	}

	@Override
	public boolean deleteRun(Integer id) {
		boolean deleted = false;
		Optional<Run> runOpt = repo.findById(id);
		if(runOpt.isPresent()) {
			repo.deleteById(id);
			deleted = true;
		}
		return deleted;
	}

}
