class DisneyBakery {
	public static void main(String[] args) {
		makechai();
		makechai(2);
		makechai("choco");
		makechai("masala");
		makechai("green");
		makechai("lemon");
		makechai("masala", 4);
		makechai("choco", 3);
		makechai("lemon", 2);

	}

	static void makechai() {
		System.out.println("Bill for normal chai=10");
	}

	static void makechai(int quantity) {
		System.out.println("Bill for normal chai=" + (quantity * 10));
	}

	static void makechai(String flavour) {
		System.out.println("Bill for " + flavour + " chai=15");
	}

	static void makechai(String flavour, int quantity) {
		System.out.println("Bill for " + flavour + " chai=" + (quantity * 15));
	}
}