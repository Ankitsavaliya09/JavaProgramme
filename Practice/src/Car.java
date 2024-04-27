class Car {
	String model;
	String color;
	String manufactring;
	int price;

	void horn() {
		System.out.println("Pop Pop.....!");
	}

	void drive() {
		System.out.println("Broom Bromm....!");
	}
}

class CarApp {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.model = "MG hector";
		c1.color = "Red";
		c1.manufactring = "MG";
		c1.price = 1000000;

		System.out.println("Model:" + c1.model);
		System.out.println("Color:" + c1.color);
		System.out.println("Manufactring:" + c1.manufactring);
		System.out.println("Price:" + c1.price);
		c1.horn();
		c1.drive();
	}
}