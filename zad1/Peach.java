package hr.fer.oop.zad1;

class Peach extends Fruit {
	public Peach(String species, int numberOfFruits, double productionPrice, int peachDiameter) {
		super(species, numberOfFruits, productionPrice);
		this.peachDiameter = peachDiameter;
	}

	private int peachDiameter;

	public int getPeachDiameter() {
		return peachDiameter;
	}

	public void setPeachDiameter(int peachDiameter) {
		this.peachDiameter = peachDiameter;
	}


	public double myMarketPrice() {
		if (getPeachDiameter() >= 2 && getPeachDiameter() <= 8) {
			return getProductionPrice()/getNumberOfFruits() * 1.4;
		} else return getProductionPrice()/getNumberOfFruits() * 1.3;
		
	}
	
	

	
}
