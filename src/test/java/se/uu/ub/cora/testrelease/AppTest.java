package se.uu.ub.cora.testrelease;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest {
	private App app;

	@BeforeMethod
	public void beforeMethod() {
		app = new App("");
	}

	@Test
	public void testInput() throws Exception {
		assertEquals(app.getInput(), "");
	}
}
