package hr.fer.oop;

public class User {
	private double oib;
	private String name, surname;
	private ServiceType serviceType;
	
	public User(double oib, String name, String surname, ServiceType serviceType) {
		super();
		this.oib = oib;
		this.name = name;
		this.surname = surname;
		this.serviceType = serviceType;
	}

	public double getOib() {
		return oib;
	}

	public void setOib(double oib) {
		this.oib = oib;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public ServiceType getServiceType() {
		return serviceType;
	}

	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}
	
	
	//	OIB_value/name_value/surname_value/serviceType_value
	
	// serviceType_value = 'A' (SUBSCRIBE), 'B' (PREPAID), ili 'C' (VIRTUAL)
	
	
}
