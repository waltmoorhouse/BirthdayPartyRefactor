package scrap.heap.refactor.model;

/**
 * Class represents a type of cake. Flavors, Colors, Sizes, and Shapes available are exposed via enums.
 */
public class Cake implements Orderable {
	private final Flavor cakeFlavor;
	private final Flavor frostingFlavor;
	private final Shape shape;
	private final Size size;
	private final Color cakeColor;

	public Cake(Flavor cakeFlavor, Flavor frostingFlavor, Shape shape, Size size, Color cakeColor) {
		this.cakeFlavor = cakeFlavor;
		this.frostingFlavor = frostingFlavor;
		this.shape = shape;
		this.size = size;
		this.cakeColor = cakeColor;
	}

	public Flavor getCakeFlavor() {
		return cakeFlavor;
	}

	public Flavor getFrostingFlavor() {
		return frostingFlavor;
	}

	public Shape getShape() {
		return shape;
	}

	public Size getSize() {
		return size;
	}

	public Color getCakeColor() {
		return cakeColor;
	}

	public enum Flavor {
		CHOCOLATE("chocolate"),
		VANILLA("vanilla");

		public final String label;
		Flavor(String label) {
			this.label = label;
		}
	}

	public enum Shape {
		CIRCLE("circle"),
		SQUARE("square");

		public final String label;
		Shape(String label) {
			this.label = label;
		}
	}

	public enum Size {
		SMALL("small"),
		MEDIUM("medium"),
		LARGE("large");

		public final String label;
		Size(String label) {
			this.label = label;
		}
	}

	/**
	 * If cakes and balloons can come in more colors than example, we can combine this enum with the Balloon Color enum.
	 */
	public enum Color {
		BROWN("brown"),
		YELLOW("yellow");

		public final String label;

		Color(String label) {
			this.label = label;
		}
	}

	@Override
	public void addToOrder(int qty) {
		for (int x = 0; x < qty; x++) {
			orderCake(this);
		}
	}

	private static void orderCake(Cake cake) {

		//for the purposes of this exercise, pretend that this method adds a cake to the order
		System.out.println("cake ordered; " + cake.getCakeFlavor().label + ", " + cake.getFrostingFlavor().label +
				", " + cake.getShape().label + ", " + cake.getSize().label + ", " + cake.getCakeColor().label);

	}
}
