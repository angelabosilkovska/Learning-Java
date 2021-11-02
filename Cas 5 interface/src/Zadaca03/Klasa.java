package Zadaca03;

public class Klasa implements IComparable{
     public void CompareTo(int a, int b) {
    	 if(a>b)
    		 System.out.println(a+" e pogolemo od"+" "+b);
    	 else
    		 if(a<b)
    			 System.out.println(a+" e pomalo od"+" "+b);
    		 else
    			 System.out.println(a+" "+"ima ednakva vrednost so "+b);
     }
}
