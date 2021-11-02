package Zadaca25;

public class Glavna {
	public static void main(String[] args) {
		Vraboten v=new Vraboten("Petko","Petkovski","ghjbk",50,5);
		System.out.println(v.getime());
		System.out.println(v.getprezime());
		System.out.println(v.getfirma());
		System.out.println(v.getbod());
		System.out.println(v.getvrednostnabod());
	    int p=(v.getbod()*v.getvrednostnabod());
	    System.out.println(p);
	}
}
