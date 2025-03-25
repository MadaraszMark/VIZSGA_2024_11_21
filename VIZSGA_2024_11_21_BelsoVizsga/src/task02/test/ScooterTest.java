package task02.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import task02.app.ElectricScooter;
import task02.app.Scooter;

public class ScooterTest {

	@Test
	public void isNotOldTest() {
		Scooter scooter = new Scooter("BestScooterFor4U", 2020, "fehér", "TRE-4456");
		Boolean actual = scooter.isOld();
		Boolean expected = false;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void isOldTest() {
		Scooter scooter = new Scooter("BestScooterFor4U", 2010, "fehér", "TRE-4456");
        Boolean actual = scooter.isOld();
        Boolean expected = true;
        Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testMaxSpeedTrue() {
		ElectricScooter scooter = new ElectricScooter("BestScooterFor4U", 2010, "fehér", "TRE-4456", 100000, 25);
		boolean actual = scooter.canUseInTraffic();
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testMaxSpeedFalse() {
		ElectricScooter scooter = new ElectricScooter("BestScooterFor4U", 2010, "fehér", "TRE-4456", 100000, 30);
		boolean actual = scooter.canUseInTraffic();
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}
}
