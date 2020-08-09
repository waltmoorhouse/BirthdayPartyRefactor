package scrap.heap.refactor.model;

/**
 * Class represents a type of balloon. Colors and Materials available are exposed via enums.
 */
public class Balloon {
	private Color color;
	private Material material;

	private Balloon()  {
		// No constructing balloons without properties.
	}

	public Balloon(Color color, Material material)  {
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
}
