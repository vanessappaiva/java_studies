package util;

public class CurrencyConverter {

	
	public static double IOF = 1.06;
	
	
	public static double conversor(double dollar, double quantity) {
		return dollar*quantity*IOF;
	}
	
	
}

