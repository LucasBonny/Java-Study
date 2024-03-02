package util;

public class Currency {
	public static double quantity;
	public static double multiplier;
	public static final double IOF = 0.06;
	
	public static double CurrencyConverter() {
		double CConv = (quantity * multiplier) + (IOF * (quantity * multiplier));
		return CConv;
	}
}
