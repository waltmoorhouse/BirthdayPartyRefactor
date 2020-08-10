package scrap.heap.refactor.model;

import java.security.InvalidParameterException;

/**
 * Wraps an Orderable Item and gives it a quantity. We could add quantity to the
 * {@link scrap.heap.refactor.model.Orderable} interface, but you'd need
 * a new object for every order, this way the same redMylar {@link scrap.heap.refactor.model.Balloon}
 * can be used in several orders.
 */
public class OrderItem {
	private final Orderable orderable;
	private int quantity = 1;

	public OrderItem(Orderable orderable) {
		this.orderable = orderable;
	}

	public OrderItem(Orderable orderable, int quantity) {
		this.orderable = orderable;
		setQuantity(quantity);
	}

	public Orderable getOrderable() {
		return orderable;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity < 1) {
			throw new InvalidParameterException("Invalid Number of Items.");
		}
		this.quantity = quantity;
	}
}
