package hr.fer.oop.treciZad;

import java.util.Arrays;

public class XY extends SingleTypeKeyValue<Double>{

	public XY(Double key, Double value) {
		super(key, value);
		// TODO Auto-generated constructor stub
	}
	public XY(double key, double value) {
		super(Double.valueOf(key), Double.valueOf(value));
		// TODO Auto-generated constructor stub
	}
	
	public static boolean isIncreasingFunction(XY[] data) {
		Double[] keys = new Double[data.length];
		for (int i = 0; i < keys.length; ++i) {
			keys[i] = data[i].getKey();
		}
		Arrays.sort(keys);
		boolean flag = true;
		double tmpValue = 0;
		double tmpValuePreth = 0;
		for (int i = 0; i < keys.length; ++i) {
			for (XY xy : data) {
				if (xy.getKey().equals(keys[i])) {
					if (tmpValue == 0) {
						tmpValuePreth = xy.getValue();
					}
					tmpValue = xy.getValue();
					
					break;
				}
			}
			if(!(tmpValue >= tmpValuePreth)) {
				if (keys[i] != keys[i-1]) {
					flag = false;
					break;
				}
				
			} else {
				tmpValuePreth = tmpValue;
			}
			
		}
		return flag;
	}
	
//	public static void main(String[] args) {
//		System.out.println(
//				isIncreasingFunction(new XY[] {new XY(6,8),new XY(7,12),new XY(9,9),new XY(10,10),new XY(11,11)}
//				));
//	}
}
