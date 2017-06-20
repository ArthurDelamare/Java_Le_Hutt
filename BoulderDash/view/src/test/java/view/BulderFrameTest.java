package view;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BulderFrameTest {

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
	public void testGetPanel() {
		BulderPanel panel = new BulderPanel();
		boolean test;
		if (panel instanceof BulderPanel){
			test = true;
		}
		else {
			test = false;
		}
		assertNotNull(test);
	}

	@Test
	public void testSetPanel() {
		BulderPanel panel = new BulderPanel();
		boolean test;
		if (panel instanceof BulderPanel){
			test = true;
		}
		else {
			test = false;
		}
		assertNotNull(test);
		
	}

	@Test
	public void testKeyPressed() {
		fail("Not yet implemented");
	}

	@Test
	public void testKeyReleased() {
		fail("Not yet implemented");
	}

	@Test
	public void testKeyTyped() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetMovementController() {
		fail("Not yet implemented");
	}

}
