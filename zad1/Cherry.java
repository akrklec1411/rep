package hr.fer.oop.zad1;

class Cherry extends Fruit{
	public Cherry(String species, int numberOfFruits, double productionPrice, boolean hasWorm) {
		super(species, numberOfFruits, productionPrice);
		this.hasWorm = hasWorm;
	}

	private boolean hasWorm;

	public boolean isHasWorm() {
		return hasWorm;
	}

	public void setHasWorm(boolean hasWorm) {
		this.hasWorm = hasWorm;
	}

	
	public double myMarketPrice() {
		if (isHasWorm() == true) {
			return getProductionPrice()/getNumberOfFruits() * 1.2;
		} else return getProductionPrice()/getNumberOfFruits() * 1.5;
		
	}
	
	
	
	

}
