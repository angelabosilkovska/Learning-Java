package Zadaca5Primer15;

public class Glavna {
   public static void main(String[] args) {
	   Predmet p=new Predmet();
	   String matematika="eden";
	   String INKI="inki";
	   int Semestar=1;
	   String imeprezime="martinatrajkovska";
	   p.ImeNaPredmet();
	   p.ImeNaOtsek(INKI);
	   String a=p.Semestar();
	   System.out.println(a);
	   String b=p.Ime(imeprezime);
	   System.out.println(b);
   }
}