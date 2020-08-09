package scrap.heap.refactor;

import scrap.heap.refactor.model.Balloon;
import scrap.heap.refactor.model.Cake;

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

		order(redMylar, 4,
				new Cake(Cake.Flavor.CHOCOLATE, Cake.Flavor.CHOCOLATE, Cake.Shape.CIRCLE, Cake.Size.LARGE, Cake.Color.BROWN));
		order(blueLatex, 7,
				new Cake(Cake.Flavor.VANILLA, Cake.Flavor.CHOCOLATE, Cake.Shape.SQUARE, Cake.Size.MEDIUM, Cake.Color.BROWN));
		order(yellowMylar, 4,
				new Cake(Cake.Flavor.VANILLA, Cake.Flavor.VANILLA, Cake.Shape.SQUARE, Cake.Size.SMALL, Cake.Color.YELLOW));

	}

	private static void order(Balloon balloonType, int numberOfBalloons, Cake cake) {

		orderBalloons(balloonType, numberOfBalloons);
		orderCake(cake);
	}

	private static void orderBalloons(Balloon balloon, int number) {

		//for the purposes of this exercise, pretend this method works and adds balloons to the order
		System.out.println("Balloons ordered; " + balloon.getColor().label + ", " + balloon.getMaterial().label + ", " + number);

	}

	private static void orderCake(Cake cake) {

		//for the purposes of this exercise, pretend that this method adds a cake to the order
		System.out.println("cake ordered; " + cake.getCakeFlavor().label + ", " + cake.getFrostingFlavor().label +
				", " + cake.getShape().label + ", " + cake.getSize().label + ", " + cake.getCakeColor().label);

	}

}
