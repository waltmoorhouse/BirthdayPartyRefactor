package scrap.heap.refactor.model;

/**
 * Class represents a type of cake. Flavors, Colors, Sizes, and Shapes available are exposed via enums.
 */
public class Cake {
	private Flavor cakeFlavor;
	private Flavor frostingFlavor;
	private Shape shape;
	private Size size;
	private Color cakeColor;

	private Cake()  {
		// No constructing balloons without properties.
	}

	public Cake(Flavor cakeFlavor, Flavor frostingFlavor, Shape shape, Size size, Color cakeColor)  {
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
}
