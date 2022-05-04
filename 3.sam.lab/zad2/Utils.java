package hr.fer.oop.drugiZad;

class Utils {
	public static int checkPassword(String input) {
		//
		
		int grade;
		int numOfDigits = 0;
		int numOfUpper = 0;
		
		for (int i = 0; i<input.length(); ++i) {
			String s = Character.toString(input.charAt(i));
			try {
				Double d = Double.parseDouble(s);
				numOfDigits++;
			} catch (NumberFormatException exc) {
				if (Character.isUpperCase(input.charAt(i))) {
					numOfUpper++;
				}
			}
		}
		grade = input.length() + numOfDigits*3 + numOfUpper*2;
		
		
		if (input.length() < 6 && grade < 10) {
			//throw new SecurityException();
			throw new IllegalArgumentException();
		} else if (grade < 10) {
			throw new SecurityException();
		} else if (input.length() < 6) {
			throw new IllegalArgumentException();
		}
		return grade;
		
	}
}
