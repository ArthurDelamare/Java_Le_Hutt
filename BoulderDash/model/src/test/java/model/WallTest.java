package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class WallTest {

	@Test
	public void testGetPosX() {
		Wall wall = new Wall(0, 10, null);
		int expected = 0;
		assertEquals(expected, wall.getPosX());
	}

	@Test
	public void testSetPosX() {
		Wall wall = new Wall(0, 10, null);
		int expected = 24;
		wall.setPosX(24);
		assertEquals(expected, wall.getPosX());
	}

	@Test
	public void testGetPosY() {
		Wall wall = new Wall(0, 10, null);
		int expected = 10;
		assertEquals(expected, wall.getPosY());
	}

	@Test
	public void testSetPosY() {
		Wall wall = new Wall(0, 10, null);
		int expected = 15;
		wall.setPosY(15);
		assertEquals(expected, wall.getPosY());
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
		Wall wall = new Wall(0, 10, null);
		boolean expected = false;
		assertEquals(expected, wall.isBreakable());
	}

	@Test
	public void testIsBlocker() {
		Wall wall = new Wall(0, 10, null);
		boolean expected = true;
		assertEquals(expected, wall.isBlocker());
	}

}
