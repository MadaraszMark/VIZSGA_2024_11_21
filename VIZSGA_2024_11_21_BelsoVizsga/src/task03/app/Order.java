package task03.app;

import java.util.Map;

public class Order {

	private Long id;
	private Map<Integer, OrderItem> orderItems;
	
	public Order(Long id, Map<Integer, OrderItem> map) {
		this.id = id;
		this.orderItems = map;
	}
	
	public Map<Integer, OrderItem> getOrderItems() {
		return orderItems;
	}
	
	public Long getId() {
		return id;
	}
	
	public double getTotalCost() {
		double totalCost = 0;
		for (OrderItem item : orderItems.values()) {
            totalCost += item.getFood().getDiscountedPrice() * item.getQuantity();
        }
		return totalCost;
	}
}
