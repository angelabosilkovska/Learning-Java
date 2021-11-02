package Zadaca5Primer16;

public class Glavna {
	public static void main(String[] args) {
		Vraboten objekt=new Vraboten();
		String firma="Interworks";
		String ime="Simona";
		String prezime="Nikolovska";
		String ulica="Elpida Karamndi";
		String grad="Bitola";
		String drzava="Makedonija";
		
		objekt.a();
		objekt.b(ime, prezime);
		String a=objekt.c();
		System.out.println(a);
		String b=objekt.d(grad, drzava);
		System.out.println(b);
}

}
