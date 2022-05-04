package hr.fer.oop.prviZad;

class Vector3D extends Triple<Number>{

	public Vector3D(Number firstEl, Number secondEl, Number thirdEl) {
		super(firstEl, secondEl, thirdEl);
		// TODO Auto-generated constructor stub
	}
	
	public static double dotProduct(Vector3D first, Vector3D second) {
		double sum = 0;
		for (int i = 1; i <= 3; ++i) {
			sum += first.getElement(i).doubleValue() * second.getElement(i).doubleValue();
		}
		return sum;
	}

}
