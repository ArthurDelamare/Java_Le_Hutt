package view;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ViewTest {

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
	public void testGetBulderFrame() {
		BulderFrame bulder = new BulderFrame();
		boolean test;
		if (bulder instanceof BulderFrame){
			test = true;
		}
		else {
			test = false;
		}
		assertNotNull(test);
		
	}

	@Test
	public void testSetBulderFrame() {
		BulderFrame bulder = new BulderFrame();
		boolean test;
		if (bulder instanceof BulderFrame){
			test = true;
		}
		else {
			test = false;
		}
		assertNotNull(test);
	}

	@Test
	public void testRun() {
		fail("Not yet implemented");
	}

	@Test
	public void testClose() {
		fail("Not yet implemented");
	}

}
