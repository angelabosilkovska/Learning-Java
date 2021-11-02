package Zadaca02;

public class Glavna {

	public static void main(String[] args) {
		Avtomobil a=new Avtomobil("BMW","X6","Crna",100000,2015,656);
		a.Pecati();
		a.Vrakja();
		System.out.println(a.Vrakja());
		System.out.println(a.godinaNaProizvodstvo+" "+a.registracija);
	}

}
