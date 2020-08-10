package scrap.heap.refactor;

import scrap.heap.refactor.model.Balloon;
import scrap.heap.refactor.model.Cake;
import scrap.heap.refactor.model.Order;
import scrap.heap.refactor.model.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class App {
	private static final String GREETING = "Hello world.";

	public String getGreeting() {
		return GREETING;
	}

	public static void main(String[] args) {

		//Place birthday party orders
		Balloon redMylar = new Balloon(Balloon.Color.RED, Balloon.Material.MYLAR);
		Balloon blueLatex = new Balloon(Balloon.Color.BLUE, Balloon.Material.LATEX);
		Balloon yellowMylar = new Balloon(Balloon.Color.YELLOW, Balloon.Material.MYLAR);

		List<Order> orders = new ArrayList<>();

		Order order1 = new Order();
		order1.addItem(new OrderItem(redMylar, 4));
		order1.addItem(new OrderItem(new Cake(Cake.Flavor.CHOCOLATE, Cake.Flavor.CHOCOLATE, Cake.Shape.CIRCLE, Cake.Size.LARGE, Cake.Color.BROWN)));
		orders.add(order1);

		Order order2 = new Order();
		order2.addItem(new OrderItem(blueLatex, 7));
		order2.addItem(new OrderItem(new Cake(Cake.Flavor.VANILLA, Cake.Flavor.CHOCOLATE, Cake.Shape.SQUARE, Cake.Size.MEDIUM, Cake.Color.BROWN)));
		orders.add(order2);

		Order order3 = new Order();
		order3.addItem(new OrderItem(yellowMylar, 4));
		order3.addItem(new OrderItem(new Cake(Cake.Flavor.VANILLA, Cake.Flavor.VANILLA, Cake.Shape.SQUARE, Cake.Size.SMALL, Cake.Color.YELLOW)));
		orders.add(order3);

		order(orders);
	}

	private static void order(List<Order> orders) {
		orders.forEach(Order::order);
	}


}
