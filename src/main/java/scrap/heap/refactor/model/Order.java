package scrap.heap.refactor.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an Order. Real world would have customer and payment info, etc. not just items.
 */
public class Order {
	private List<OrderItem> items = new ArrayList<>();

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void order() {
		items.forEach(i -> i.getOrderable().addToOrder(i.getQuantity()));
		completeOrder();
	}

	private static void completeOrder() {
		//for the purposes of this exercise, pretend this method works and does any final processing the order
		System.out.println("Order complete.");
	}
}
