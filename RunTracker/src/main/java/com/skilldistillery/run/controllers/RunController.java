package com.skilldistillery.run.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.run.entities.Run;
import com.skilldistillery.run.services.RunService;

@RequestMapping("api")
@RestController
public class RunController {

	@Autowired
	private RunService svc;

	@RequestMapping(path = "ping", method = RequestMethod.GET)
	public String ping() {
		return "pong!";
	}

	@GetMapping("allruns")
	public List<Run> allRuns() {
		return svc.index();
	}

	@GetMapping("run/{runId}")
	public Run showRun(@PathVariable Integer runId, HttpServletResponse response) {
		Run run = svc.showRun(runId);
		if (run == null) {
			response.setStatus(404);
		}
		return run;
	}

}
