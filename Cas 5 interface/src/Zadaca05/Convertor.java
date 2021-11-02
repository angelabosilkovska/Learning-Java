package Zadaca05;

public class Convertor implements IConversion {

    public Convertor() {

    }
    @Override
    public double convertInches(double in) {
    	return in/2.54;
    }
    @Override
    public double convertCentimeters(double cm) {
    	return 2.54*cm;
    }
}
