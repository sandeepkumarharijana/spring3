package spring_demo;

public class NormalCallCenter {
	public static void main(String[] args) {
		Mobile desk1 = new Mobile("Oneplus", "Red", 16, new Airtel());
		System.out.println(desk1);
		desk1.installSoftware();

		Mobile desk2 = new Mobile("Oneplus", "Red", 16, new Airtel());
		System.out.println(desk2);
		desk2.installSoftware();

		Mobile desk3 = new Mobile("Oneplus", "Red", 16, new Airtel());
		System.out.println(desk3);
		desk3.installSoftware();

		Mobile desk4 = new Mobile("Oneplus", "Red", 16, new Airtel());
		System.out.println(desk4);
		desk4.installSoftware();

		Mobile desk5 = new Mobile("Oneplus", "Red", 16, new Airtel());
		System.out.println(desk5);
		desk5.installSoftware();
	}
}
