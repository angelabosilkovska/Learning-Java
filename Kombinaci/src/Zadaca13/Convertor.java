package Zadaca13;

public class Convertor implements IConversion {
	
	public Convertor() {

    }
	@Override
	public double convertKg(double kg) {
		return 0.4536/kg;
	}
	@Override
	public double convertLb(double lb) {
		return lb/0.4536;
	}
}
