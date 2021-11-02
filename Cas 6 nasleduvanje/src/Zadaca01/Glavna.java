package Zadaca01;

public class Glavna {
   public static void main (String[] args) {
	   Covek c=new Covek("Angela","Bosilkovska");
	   System.out.println(c.getIme()+" "+c.getPrezime());
	   Student s=new Student("Petko","Petkovski",61,9.5);
	   System.out.println(s.getIme()+" "+s.getPrezime()+" "+s.getIndeks()+" "+s.getProsek());
   }
}
