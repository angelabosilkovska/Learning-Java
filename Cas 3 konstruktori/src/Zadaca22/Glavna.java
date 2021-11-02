package Zadaca22;

public class Glavna {
    public static void main(String[] args) {
    	Covek c=new Covek("Petko","Petkovski",61,98,"2019");
    	System.out.println(c.getime());
    	System.out.println(c.getprezime());
    	System.out.println(c.getvisina());
    	System.out.println(c.gettezina());
    	System.out.println(c.getdata());
    	
    	System.out.println(c.getime()+" "+c.getprezime()+" "+c.getvisina()+" "+c.gettezina()+" "+" "+c.getdata());
    }
}
