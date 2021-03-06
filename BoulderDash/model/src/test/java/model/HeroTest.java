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
		
	}

	@Test
	public void testMove() {
		Hero hero = new Hero (null);
		
	}

	@Test
	public void testPushStone() {
		
	}

	@Test
	public void testGetDirection() {
		IHero hero = new Hero(null);
		int expected = 4;
		assertEquals(expected, hero.getDirection());
	}

	@Test
	public void testSetDirection() {
		IHero hero = new Hero(null);
		int expected = 5;
		hero.setDirection(5);
		assertEquals(expected, hero.getDirection());
	}

	@Test
	public void testGetPosX() {
		IHero hero = new Hero(null);
		
		int expected = 11;
		assertEquals(expected, hero.getPosX());
	}

	@Test
	public void testSetPosX() {
		IHero hero = new Hero(null);
		int expected = 5;
		hero.setPosX(5);
		assertEquals(expected, hero.getPosX());
	
	}

	@Test
	public void testGetPosY() {
		IHero hero = new Hero(null);
		
		int expected = 11;
		assertEquals(expected, hero.getPosY());
	}

	@Test
	public void testSetPosY() {
		IHero hero = new Hero(null);
		int expected = 14;
		hero.setPosY(14);
		assertEquals(expected, hero.getPosY());
	
	}

	@Test
	public void testGetDiamonds() {
		IHero hero = new Hero(null);
		int expected = 0;
		assertEquals(expected, hero.getDiamonds());
	}

	@Test
	public void testSetDiamonds() {
		IHero hero = new Hero (null);
		int expected = 5;
		hero.setDiamonds(5);
		assertEquals(expected, hero.getDiamonds());
	}

	@Test
	public void testIsaLive() {
		IHero hero = new Hero(null);
		
		boolean expected = true;
		assertEquals(expected, hero.isaLive());
	}

	@Test
	public void testSetaLive() {
		IHero hero = new Hero(null);
		
		boolean expected= false;
		hero.setaLive(false);
		assertEquals(expected, hero.isaLive());
	}

	@Test
	public void testGetImage() {
		
	}

	@Test
	public void testSetImage() {
		
	}

}
