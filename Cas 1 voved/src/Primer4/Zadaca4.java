package Primer4;

public class Zadaca4 {
    public static void main(String[] args) {
    	String question = "How much does this element weights?";
    	String weightTemp = "The element weight in metric is";
    	String weightTemp2 = "The element weight in imperial is";
    	int metricValue = 10;
    	float imperialValue;
    	String metricSign = "kg";
    	String imperialSign = "pounds";
    	
    	double x=metricValue*2.205;
    	System.out.println(question);
    	System.out.println(weightTemp+" "+metricValue+metricSign+" "+weightTemp2+" "+x+imperialSign);
    	
    }
}
