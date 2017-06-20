package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HeroTest {

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
	public void testWalkOn() {
		fail("Not yet implemented");
	}

	@Test
	public void testMove() {
		fail("Not yet implemented");
	}

	@Test
	public void testPushStone() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDirection() {
		Hero hero = new Hero();
		int expected = 3;
		assertEquals(expected, hero.getDirection());
	}

	@Test
	public void testSetDirection() {
		Hero hero = new Hero();
		int expected = 5;
		hero.setDirection(5);
		assertEquals(expected, hero.getDirection());
	}

	@Test
	public void testGetPosX() {
		Hero hero = new Hero();
		
		int expected = 1;
		assertEquals(expected, hero.getPosX());
	}

	@Test
	public void testSetPosX() {
		Hero hero = new Hero();
		int expected = 5;
		hero.setPosX(5);
		assertEquals(expected, hero.getPosX());
	
	}

	@Test
	public void testGetPosY() {
		Hero hero = new Hero();
		
		int expected = 1;
		assertEquals(expected, hero.getPosY());
	}

	@Test
	public void testSetPosY() {
		Hero hero = new Hero();
		int expected = 14;
		hero.setPosY(14);
		assertEquals(expected, hero.getPosY());
	
	}

	@Test
	public void testGetDiamonds() {
		Hero hero = new Hero();
		int expected = 0;
		assertEquals(expected, hero.getDiamonds());
	}

	@Test
	public void testSetDiamonds() {
		Hero hero = new Hero ();
		int expected = 5;
		hero.setDiamonds(5);
		assertEquals(expected, hero.getDiamonds());
	}

	@Test
	public void testIsaLive() {
		Hero hero = new Hero();
		
		boolean expected = true;
		assertEquals(expected, hero.isaLive());
	}

	@Test
	public void testSetaLive() {
		Hero hero = new Hero();
		
		boolean expected= false;
		hero.setaLive(false);
		assertEquals(expected, hero.isaLive());
	}

	@Test
	public void testGetImage() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetImage() {
		fail("Not yet implemented");
	}

}
