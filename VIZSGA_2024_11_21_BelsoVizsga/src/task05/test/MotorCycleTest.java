package task05.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import task05.app.entity.MotorCycle;
import task05.app.entity.MotorCycleCategory;

public class MotorCycleTest {

	@Test
	public void getIsActiveText() {
		MotorCycleCategory motorCycleCategory = new MotorCycleCategory(1,"Bagger");
		MotorCycle motorCycle = new MotorCycle(1,"Honda","TEF-234",motorCycleCategory,true);
		String actual = motorCycle.getStatusText();
		String expected ="aktív";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
    public void getIsInactiveText() {
		MotorCycleCategory motorCycleCategory = new MotorCycleCategory(1,"Bagger");
		MotorCycle motorCycle = new MotorCycle(1,"Honda","TEF-234",motorCycleCategory,false);
		String actual = motorCycle.getStatusText();
		String expected ="inaktív";
		Assert.assertEquals(expected, actual);
	}
}
