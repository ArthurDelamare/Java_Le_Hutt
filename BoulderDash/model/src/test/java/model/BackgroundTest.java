package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class BackgroundTest {

	@Test
	public void testGetPosX() {
		Background background = new Background(14, 2, null);
		int expected = 14;
		assertEquals(expected, background.getPosX());
	}

	@Test
	public void testSetPosX() {
		Background background = new Background(14, 2, null);
		int expected = 16;
		background.setPosX(16);
		assertEquals(expected, background.getPosX());
	}

	@Test
	public void testGetPosY() {
		Background background = new Background(14, 2, null);
		int expected = 2;
		assertEquals(expected, background.getPosY());
	}

	@Test
	public void testSetPosY() {
		Background background = new Background(14, 2, null);
		int expected = 6;
		background.setPosY(6);
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
		Background background = new Background(14, 2, null);
		boolean expected = false;
		assertEquals(expected, background.isBreakable());
	}

	@Test
	public void testIsBlocker() {
		Background background = new Background(14, 2, null);
		boolean expected = false;
		assertEquals(expected, background.isBlocker());
	}

}
