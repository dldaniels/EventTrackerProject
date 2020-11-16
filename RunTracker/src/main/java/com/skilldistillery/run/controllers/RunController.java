package com.skilldistillery.run.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@GetMapping("runs")
	public List<Run> allRuns() {
		return svc.index();
	}

	@GetMapping("runs/{runId}")
	public Run showRun(@PathVariable Integer runId, HttpServletResponse response) {
		Run run = svc.showRun(runId);
		if (run == null) {
			response.setStatus(404);
		}
		return run;
	}

	@PostMapping("runs")
	public Run addRun(@RequestBody Run run, HttpServletResponse response, HttpServletRequest request) {
		try {
			run = svc.createRun(run);
			response.setStatus(201);
			StringBuffer url = request.getRequestURL();
			// url.append("/").append(run.getId());
//			System.out.println(url.toString());
			response.setHeader("Location", url.toString());

		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(400);
			run = null;
		}
		return run;
	}

	@PutMapping("runs/{runId}")
	public Run updateRun(@PathVariable Integer runId, @RequestBody Run run, HttpServletResponse response) {
		try {
			run = svc.updateRun(run, runId);
			if (run == null) {
				response.setStatus(404);
				run = null;
			}
		} catch (Exception e) {
			response.setStatus(400);
			run = null;
		}
		return run;
	}

	@DeleteMapping("runs/{runId}")
	public void deleteRun(@PathVariable Integer runId, HttpServletResponse response) {
		if (svc.deleteRun(runId)) {
			response.setStatus(204);

		} else {
			response.setStatus(404);
		}

	}

}
