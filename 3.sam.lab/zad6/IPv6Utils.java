package hr.fer.oop.sestiZad;

public class IPv6Utils {

	public static void checkIPv6AddressValidity(String string) throws InvalidIPv6AddressException {
		String[] segs;
		
		if (string.split(":").length != 8) {
			throw new InvalidIPv6AddressException("IPv6 address does not contain 8 hexadecimal numbers!");
		}
		
		segs = string.split(":");
		
		for (String s : segs) {
			
			try {
				Long.parseLong(s, 16);
				
			} catch (NumberFormatException exc) {
				throw new InvalidIPv6AddressException("One or more strings in the IPv6 address are not hexadecimal numbers!");
			}
			
		}
		for (String s : segs) {
			Long tmpHex = Long.parseLong(s, 16);
			if (!(tmpHex <= 0xFFFF && tmpHex >= 0x0)) {
				throw new InvalidIPv6AddressException("One or more numbers in the IPv6 address are not in the correct range!");
			}
		}
	}
	public static void main(String[] args) throws InvalidIPv6AddressException {
		//checkIPv6AddressValidity("2001:0db8:0001:0000:FFFF:0ab9:C0A8:0102");
		checkIPv6AddressValidity("2001:XXXX:FFFFF");
	}
}
		
