package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GroundTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Ground ground = new Ground(10, 5, null);
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
	public void testBreaking() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPosX() {
		int expected = 10;
		
		Ground ground = new Ground(10, 5, null);
		
		assertEquals(expected, ground.getPosX());
	}

	@Test
	public void testSetPosX() {
		Ground ground = new Ground(10, 5, null);
		int expected = 11;
		ground.setPosX(11);
		assertEquals(expected, ground.getPosX());
		
		
	}

	@Test
	public void testGetPosY() {
		int expected = 5;
		
		Ground ground = new Ground(10, 5, null);
		
		assertEquals(expected, ground.getPosY());
	}

	@Test
	public void testSetPosY() {
		Ground ground = new Ground(10, 5, null);
		int expected = 7;
		ground.setPosY(7);
		assertEquals(expected, ground.getPosY());
	}

	@Test
	public void testGetImage() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetImage() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsBreakable() {
		Ground ground = new Ground(10, 5, null);
		boolean expected = true;
		assertEquals(expected, ground.isBreakable());
	}

	@Test
	public void testIsBlocker() {
		Ground ground = new Ground(10, 5, null);
		boolean expected = false;
		assertEquals(expected, ground.isBlocker());
	}

}
