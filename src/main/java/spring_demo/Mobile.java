package spring_demo;

public class Mobile {
	private String brand;
	private String color;
	private int ram;
	private Sim sim;

	public Mobile(String brand, String color, int ram, Sim sim) {
		super();
		this.brand = brand;
		this.color = color;
		this.ram = ram;
		this.sim = sim;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", color=" + color + ", ram=" + ram + ", sim=" + sim + "]";
	}

	void installSoftware() {
		System.out.println("Software is Installed");
	}

	void deleteData() {
		System.out.println("Data Formatted");
	}
}