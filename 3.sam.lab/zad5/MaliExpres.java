package hr.fer.oop.petiZad;

public class MaliExpres {
	public static double checkout(ShoppingCart cart) {
		double sum = 0;
		for (Item i : cart.getItems()) {
			try {
				if (i instanceof AlcBeverage) {
					if (cart.getCustomer().getAge() < 18)
						throw new IllegalAgeException("Nije dozvoljena prodaja alkohola maloljetnicima");
				}
				sum += i.getPrice(1);
			} catch (NullPointerException exc) {
				sum += 0;
			}
		}
		return sum;
	}
}
