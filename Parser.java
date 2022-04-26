package hr.fer.oop;

public class Parser {
	public static User parseInputString (String input) throws Exception {
		String[] tmp = input.split("/");
		
		
		double tmpOIB = 0;
		String tmpServiceType_value;
		try {
			
			if (tmp.length != 4) throw new InvalidNumberOfArgumentsException("Exception occured!");
			
			tmpOIB = Double.parseDouble(tmp[0]);
			tmpServiceType_value = tmp[3]; 
			
			if (tmpServiceType_value != "A" && tmpServiceType_value != "B"
					&& tmpServiceType_value != "C") {
				throw new NumberFormatException();
			}
		} catch (NumberFormatException exc) {
			throw new ArgumentParseException("Exception occured!", exc);
		} 
		
		ServiceType tmpEnum;
		if (tmpServiceType_value == "A") tmpEnum = ServiceType.SUBSCRIBE;
		else if (tmpServiceType_value == "B") tmpEnum = ServiceType.PREPAID;
		else tmpEnum = ServiceType.VIRTUAL;
		return new User(tmpOIB, tmp[1], tmp[2], tmpEnum);
	}
	
	public static void main(String[] args) throws Exception{
		parseInputString("12345678912s345/jure/juric/A");
	}
}