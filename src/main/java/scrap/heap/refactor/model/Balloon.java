package scrap.heap.refactor.model;

/**
 * Class represents a type of balloon. Colors and Materials available are exposed via enums.
 */
public class Balloon implements Orderable {
	private final Color color;
	private final Material material;

	public Balloon(Color color, Material material) {
		this.color = color;
		this.material = material;
	}

	/**
	 * If cakes and balloons can come in more colors than example, we can combine this enum with the Cake Color enum.
	 */
	public enum Color {
		RED("red"),
		BLUE("blue"),
		YELLOW("yellow");

		public final String label;
		Color(String label) {
			this.label = label;
		}
	}

	public enum Material {
		MYLAR("mylar"),
		LATEX("latex");

		public final String label;
		Material(String label) {
			this.label = label;
		}
	}

	public Color getColor() {
		return color;
	}

	public Material getMaterial() {
		return material;
	}

	@Override
	public void addToOrder(int qty) {
		orderBalloons(this, qty);
	}

	private static void orderBalloons(Balloon balloon, int number) {
		//for the purposes of this exercise, pretend this method works and adds balloons to the order
		System.out.println("Balloons ordered; " + balloon.getColor().label + ", " + balloon.getMaterial().label + ", " + number);
	}
}
