package hr.fer.oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class Parser {

	public static Reading parseInputString(String input) throws ParseReadingException {
		try {
		
			Integer tmp_serialNumber = null;
			LocalDate tmp_timeStamp = null;
			Double tmp_readingValue = null;
			
		//prvi format
			//provjeriti dal su na pocetku i na kraju {} 
			
			//{serialNumber : serialNumber_value, timestamp : timestamp_value, currentReading : currentReading_value}
			
			if (input.charAt(0) == '{' && input.charAt(input.length() - 1) == '}') {

				input = input.substring(1, input.length() - 1);
				//serialNumber : serialNumber_value, timestamp : timestamp_value, currentReading : currentReading_value
				
				//sljedeci korak => odvojiti po zarezima
				
				String segsKom[] = input.split(",");
				//provjeriti dal lista ima 3 clana
				if (segsKom.length != 3) 
					throw new IncorrectArgumentNumberException();
				
				// splitati clanove po ":" i provjeriti dal podlista ima 2 clana
				
				int cnt = 0;
				for (String s : segsKom) {
					
					String[] tmp_seg = s.split(":");
					if (tmp_seg.length != 2) {
						throw new IncorrectArgumentNumberException();
					}
					
					switch (cnt) {
					case 0:
						tmp_serialNumber = Integer.parseInt(tmp_seg[1].strip()); 
						break;
					case 1:
						tmp_timeStamp = parseDateForManufacturerA(tmp_seg[1].strip());
						break;
					
					default:
						tmp_readingValue = Double.parseDouble(tmp_seg[1].strip());
						break;
					}
					
					
					cnt++;
				}
				
		//drugi format
			} else {
				//pokusati splitati po ";"
				
				String[] tmp_input = input.split(";");
				
				//provjeriti dal je lenght == 3
				
				if (tmp_input.length != 3) 
					throw new IncorrectArgumentNumberException();
				
				int cnt = 0;
				for (String s : tmp_input) {
					
					
					switch (cnt) {
					case 0:
						tmp_serialNumber = Integer.parseInt(s.strip()); 
						break;
					case 1:
						tmp_timeStamp = parseDateForManufacturerB(s.strip());
						break;
					
					default:
						tmp_readingValue = Double.parseDouble(s.strip());
						break;
					}
					
					
					cnt++;
				}
			}
					
			return new Reading(tmp_serialNumber, tmp_readingValue, tmp_timeStamp);
			//IncorrectArgumentNumberException throw
		
		} catch (NumberFormatException | DateTimeParseException exc) {
			throw new ReadingFormatException(exc);
		}
		
			
	}
	
	private static LocalDate parseDateForManufacturerA (String dateA) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		dtf = dtf.withLocale( Locale.GERMAN );
		LocalDate date = LocalDate.parse(dateA, dtf);
		
		return date;
	}
	
	private static LocalDate parseDateForManufacturerB (String dateB) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM dd yyyy");
		dtf = dtf.withLocale( Locale.GERMAN );
		LocalDate date = LocalDate.parse(dateB, dtf);
		
		return date;
	}
	
	public static void main(String[] args) throws ParseReadingException {
		parseInputString("{serialNumber : 2223, timestamp : 05-12-1992, currentReading : 284.3}");
	}
}
