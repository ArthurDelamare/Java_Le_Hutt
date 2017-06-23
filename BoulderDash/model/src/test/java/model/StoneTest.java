package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StoneTest {

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
	public void testMovementFall() {
		
	}

	@Test
	public void testStone() {
	
	}

	@Test
	public void testGetPosX() {
		
		int expected = 25;
		
		Stone stone = new Stone(25, 15, null);
		
		assertEquals(expected, stone.getPosX());
	}

	@Test
	public void testSetPosX() {
		Stone stone = new Stone (25, 15, null);
		int expected = 12;
		stone.setPosX(12);
		assertEquals(expected, stone.getPosX());
	}

	@Test
	public void testGetPosY() {

		int expected = 5;
		
		Stone stone = new Stone(15, 5, null);
		
		assertEquals(expected, stone.getPosY());
	}

	@Test
	public void testSetPosY() {
		Stone stone = new Stone (5, 15, null);
		int expected = 10;
		stone.setPosY(10);
		assertEquals(expected, stone.getPosY());
	}

	@Test
	public void testGetImage() {
		
	}

	@Test
	public void testSetImage() {
	
	}

	@Test
	public void testIsBreakable() {
		Stone stone = new Stone(25, 15, null);
		boolean expected = true;
		assertEquals(expected, stone.isBreakable());
	}

	@Test
	public void testIsBlocker() {
		Stone stone = new Stone(25, 15, null);
		boolean expected = true;
		assertEquals(expected, stone.isBlocker());
	}

}
