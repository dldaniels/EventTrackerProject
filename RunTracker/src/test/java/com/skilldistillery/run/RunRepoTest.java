package com.skilldistillery.run;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.skilldistillery.run.entities.Run;
import com.skilldistillery.run.repositories.RunRepository;

@SpringBootTest
class RunRepoTest {
	
	@Autowired
	private RunRepository repo;

	@Test
	void test_RunRepository() {
		Optional<Run> opt = repo.findById(1);
		assertTrue(opt.isPresent());
		Run run = opt.get();
		assertEquals("Phil", run.getName());
	}

}
