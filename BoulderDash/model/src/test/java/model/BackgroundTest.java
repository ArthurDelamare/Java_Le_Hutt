package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BackgroundTest {

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
	public void testGetPosX() {
		Background background = new Background(15, 10, null);
		int expected = 15;
		assertEquals(expected, background.getPosX());
	}

	@Test
	public void testSetPosX() {
		Background background = new Background(15, 10, null);
		int expected = 23;
		background.setPosX(23);
		assertEquals(expected, background.getPosX());
	}

	@Test
	public void testGetPosY() {
		Background background = new Background(15, 10, null);
		int expected = 10;
		assertEquals(expected, background.getPosY());
	}

	@Test
	public void testSetPosY() {
		Background background = new Background(15, 10, null);
		int expected = 19;
		background.setPosY(19);
		assertEquals(expected, background.getPosY());
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
		Background background = new Background(15, 10, null);
		boolean expected = false;
		assertEquals(expected, background.isBreakable());
	}

	@Test
	public void testIsBlocker() {
		Background background = new Background(15, 10, null);
		boolean expected = false;
		assertEquals(expected, background.isBlocker());
	}

}
