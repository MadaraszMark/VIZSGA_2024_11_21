package task04.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import task04.app.FootWear;

public class FootWearTest {

	@Test
	public void getIsNotSaleText() {
		FootWear footwear = new FootWear(1,"Nike", "Airmax 123",28900.0, Byte.parseByte("1"),false);
		String actual = footwear.getIsSaleText();
		String expected ="nem akciós";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getIsSaleText() {
		FootWear footwear = new FootWear(1,"Nike", "Airmax 123",28900.0, Byte.parseByte("1"),true);
		String actual = footwear.getIsSaleText();
		String expected ="akciós";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
    public void getCategoryText() {
		FootWear footwear = new FootWear(1,"Nike", "Airmax 123",28900.0, Byte.parseByte("1"),false);
		String actual = footwear.getCategoryText();
		String expected ="férfi";
		Assert.assertEquals(expected, actual);
	}
}
