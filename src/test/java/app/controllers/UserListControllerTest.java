package app.controllers;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class UserListControllerTest {

	@Test public void fakeTest() {
		assertNotNull("put something real.", new UserListController(null, null, null));
 	}
}
