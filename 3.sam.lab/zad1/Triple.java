package hr.fer.oop.prviZad;

class Triple <T> {
	private T firstEl;
	private T secondEl;
	private T thirdEl;
	
	public T getFirstEl() {
		return firstEl;
	}

	public void setFirstEl(T firstEl) {
		this.firstEl = firstEl;
	}

	public T getSecondEl() {
		return secondEl;
	}

	public void setSecondEl(T secondEl) {
		this.secondEl = secondEl;
	}

	public T getThirdEl() {
		return thirdEl;
	}

	public void setThirdEl(T thirdEl) {
		this.thirdEl = thirdEl;
	}

	public Triple(T firstEl, T secondEl, T thirdEl) {
		super();
		this.firstEl = firstEl;
		this.secondEl = secondEl;
		this.thirdEl = thirdEl;
	}
	
	public T getElement(int idx) {
		switch (idx) {
		case 1:
			return getFirstEl();
		case 2:
			return getSecondEl();
		case 3:
			return getThirdEl();
		default:
			throw new IllegalArgumentException();			
		}
	}
	public void setElement(int idx, T value) {
		switch (idx) {
		case 1:
			setFirstEl(value);
		case 2:
			setSecondEl(value);
		case 3:
			setThirdEl(value);
		default:
			throw new IllegalArgumentException();			
		}
	}
	
	
}
