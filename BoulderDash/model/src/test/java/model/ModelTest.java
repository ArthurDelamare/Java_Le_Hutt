package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ModelTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetHero() {
		IHero hero = new Hero();
		assertNotNull(hero);
		assertEquals(0, hero.getDiamonds());
	}

	@Test
	public void testGetMap() {
		IMap map = new Map();
		assertNotNull(map);
	}

}
