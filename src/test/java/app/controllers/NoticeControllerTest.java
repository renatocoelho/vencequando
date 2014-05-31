package app.controllers;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class NoticeControllerTest {

	@Test public void fakeTest() {
		assertNotNull("put something real.", new NoticeController(null, null, null));
 	}
}
