package Zadaca5Primer11;

public class Glavna {
   public static void main (String[] args) {
	   String StringValue="HariMarkoski";
	   String returnValue;
	   MethodsForReturnAndPrint pr=new MethodsForReturnAndPrint();
	   returnValue=pr.MojMetod(StringValue);
	   System.out.println(returnValue);
   }
}
