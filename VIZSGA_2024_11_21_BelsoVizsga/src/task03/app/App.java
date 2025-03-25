package task03.app;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		Food PizzaBolognese = new Food("Pizza bolognese", 3900.0, false);
		Food HawaiiPizza = new Food("Hawaii pizza", 4500.0, true);
		
		OrderItem orderItemOne = new OrderItem(PizzaBolognese, 2);
		OrderItem orderItemTwo = new OrderItem(HawaiiPizza, 1);
		
		Map<Integer, OrderItem> orderItems = new HashMap<>();
		orderItems.put(1, orderItemOne);
		orderItems.put(2, orderItemTwo);
		
        Order order = new Order(1L, orderItems);
        
        System.out.println("A rendelés azonosítója: " + order.getId() + ", teljes összeg: " + order.getTotalCost() + " Ft");
        
        // Kész
	}
}
