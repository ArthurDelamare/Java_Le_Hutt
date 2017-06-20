package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DiamondTest {

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
	public void testAddPoint() {
		fail("Not yet implemented");
	}

	@Test
	public void testDiamond() {
		fail("Not yet implemented");
	}

	@Test
	public void testExplode() {
		fail("Not yet implemented");
	}

	@Test
	public void testMovementFall() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPosX() {

		int expected = 15;
		
		Diamond diamond = new Diamond(15, 15, null);
		
		assertEquals(expected, diamond.getPosX());
	
	}

	@Test
	public void testSetPosX() {
		Diamond diamond = new Diamond (15, 15, null);
		int expected = 11;
		diamond.setPosX(11);
		assertEquals(expected, diamond.getPosX());
	}

	@Test
	public void testGetPosY() {
		int expected = 12;
		
		Diamond diamond = new Diamond(15, 12, null);
		
		assertEquals(expected, diamond.getPosY());
	}

	@Test
	public void testSetPosY() {
		Diamond diamond = new Diamond (15, 12, null);
		int expected = 13;
		diamond.setPosY(13);
		assertEquals(expected, diamond.getPosY());
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

		Diamond diamond = new Diamond(15, 15, null);
		boolean expected = true;
		assertEquals(expected, diamond.isBreakable());
	
	}

	@Test
	public void testIsBlocker() {

		Diamond diamond = new Diamond(10, 5, null);
		boolean expected = false;
		assertEquals(expected, diamond.isBlocker());
	
	}

}
