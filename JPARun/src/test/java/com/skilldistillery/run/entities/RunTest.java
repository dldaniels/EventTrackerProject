package com.skilldistillery.run.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RunTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Run run;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("RunPU");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		run = em.find(Run.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		run = null;
	}

	@Test
	void test_Run_entity_mapping() {
		assertNotNull(run);
		assertEquals("Phil", run.getName());
		assertEquals(3.14, run.getDistance());
		assertEquals(27.49, run.getTime());
		assertEquals(590, run.getCalories());
		assertEquals(64, run.getElevationGain());
		assertEquals(2020, run.getDate().getYear());
		assertEquals(11, run.getDate().getDayOfMonth());
		assertEquals(11, run.getDate().getMonthValue());
		
		
	}

}
