package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MobTest {

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
	public void testMove() {
		
	}

	@Test
	public void testDeath() {
		
	}

	@Test
	public void testKill() {
		
	}

	@Test
	public void testMob() {
		
	}

	@Test
	public void testGetPosX() {
		int expected = 10;
		Mob mob = new Mob(10, 10, null);
		assertEquals(expected, mob.getPosX());
		
		
	}

	@Test
	public void testSetPosX() {
		int expected = 9;
		Mob mob = new Mob(9, 10, null);
		mob.setPosX(9);
		assertEquals(expected, mob.getPosX());
	}

	@Test
	public void testGetPosY() {
		int expected = 5;
		Mob mob = new Mob(10, 5, null);
		assertEquals(expected, mob.getPosY());
	}

	@Test
	public void testSetPosY() {
		int expected = 6;
		Mob mob = new Mob(10, 6, null);
		mob.setPosY(6);
		assertEquals(expected, mob.getPosY());
	}

	@Test
	public void testGetImage() {
		
	}

	@Test
	public void testSetImage() {
		
	}

	@Test
	public void testIsBreakable() {
		boolean expected = true;
		Mob mob= new Mob(25, 15, null);
		assertEquals(expected, mob.isBreakable());
		
	}

	@Test
	public void testIsBlocker() {
		boolean expected = true;
		Mob mob= new Mob(25, 15, null);
		assertEquals(expected, mob.isBlocker());
		
	}

}
