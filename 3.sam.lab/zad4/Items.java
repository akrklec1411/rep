package hr.fer.oop.cetvrtiZad;

class Items<T> extends Artikl<T> {
	
	private double quantity;
	
	public Items(T tag, double pricing, Type type) {
		super(tag, pricing, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setQuantity(double quantity) {
		if (quantity < 0) {
			throw new IllegalArgumentException("Negative values forbidden");
		}
		
		if(getType() == Type.ITEM) {
			if (quantity - (int)quantity == 0) {
				this.quantity = quantity;
			} else {
				throw new IllegalArgumentException("For pricing per item, the quantity cannot have decimals");
			}
		} else {
			this.quantity = quantity;
		}
			
		
	}

	@Override
	public double getPrice() {
		if (getType() == Type.ITEM)
			return quantity*getPricing();
		else {
			return quantity*getPricing()*0.001;
		}
	}
	
	public static void main(String[] args) {

		Items<Integer> jabukaCrvena = new Items<Integer>(123, 80, Type.ITEM);
		jabukaCrvena.setQuantity(500);
		System.out.println(jabukaCrvena.getPrice());
	}

}
