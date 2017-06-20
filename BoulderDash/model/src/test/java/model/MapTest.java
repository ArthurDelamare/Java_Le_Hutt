package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class MapTest {

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
	public void testGetCellTable() {
		Map map = new Map();
		map.setCellTable(6, 5, 12);
		int expected = 6;
		assertEquals(expected, map.getCellTable(5, 12));
	}

	@Test
	public void testSetCellTable() {
		Map map = new Map();
		int expected = 4;
		map.setCellTable(4, 12, 8);
		assertEquals(expected, map.getCellTable(12, 8));
	}

	@Test
	public void testGetMapObjects() {
		Map map = new Map();
		assertNotNull(map);
	}

}
