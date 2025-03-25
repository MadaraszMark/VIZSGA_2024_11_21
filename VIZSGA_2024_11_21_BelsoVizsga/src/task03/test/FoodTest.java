package task03.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import task03.app.Food;
import task03.app.Order;
import task03.app.OrderItem;

public class FoodTest {

	@Test
	public void getDiscountedPriceTest() {
		Food food = new Food("Tonhalas Pizza", 5000.0,true);
		double actual = food.getDiscountedPrice();
		double expected = 4500.0;
		Assert.assertEquals(expected, actual, 0.0);
	}
	
	@Test
    public void testNotDiscountedPrice() {
		Food food = new Food("Pizza bolognese", 3900.0, false);
		double actual = food.getDiscountedPrice();
		double expected =3900.0;
		Assert.assertEquals(expected, actual, 0.0);
	}
	
	@Test
	public void testOrderTotalCostWithDiscounts() {
	    Food food1 = new Food("Hawaii pizza", 4500.0, true);
	    Food food2 = new Food("Bolognese pizza", 3900.0, false);

	    OrderItem item1 = new OrderItem(food1, 2);
	    OrderItem item2 = new OrderItem(food2, 1);

	    Map<Integer, OrderItem> items = new HashMap<>();
	    items.put(1, item1);
	    items.put(2, item2);

	    Order order = new Order(100L, items);

	    double expectedTotal = 8100 + 3900; // 12000
	    double actualTotal = order.getTotalCost();

	    Assert.assertEquals(expectedTotal, actualTotal, 0.0);
	}
	
	@Test
	public void testOrderItemCalculatesCorrectQuantity() {
	    Food food = new Food("Sajtos pizza", 3000.0, true); // 2700 kedvezménnyel
	    OrderItem item = new OrderItem(food, 3); // 3 * 2700 = 8100

	    double expected = 2700.0 * 3;
	    double actual = item.getFood().getDiscountedPrice() * item.getQuantity();

	    Assert.assertEquals(expected, actual, 0.0);
	}


}
