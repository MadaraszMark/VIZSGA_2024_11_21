package task01.test;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


import task01.app.User;

public class UserTest {

	@Test
	public void testUserStatusTextTrue() {
		User user = new User("Elek", "Teszt", "tesztelek", LocalDate.of(1999, 01,01), true);
		String actual = user.getStatusText();
		String expected = "Aktív";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testUserStatusTextFalse() {
		User user = new User("Elek", "Teszt", "tesztelek", LocalDate.of(1999, 01,01), false);
		String actual = user.getStatusText();
		String expected = "Inaktív";
		Assert.assertEquals(expected, actual);
	}
}
