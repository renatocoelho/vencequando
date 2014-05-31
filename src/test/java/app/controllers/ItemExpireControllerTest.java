package app.controllers;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ItemExpireControllerTest {

	@Test public void fakeTest() {
		assertNotNull("put something real.", new ItemExpireController(null, null, null));
 	}
}
