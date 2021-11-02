package Zadaca11;

public class Glavna {

	public static void main(String[] args) {
		Avtomobil a=new Avtomobil("dfzs","fzdgv","zdg",15000);
        int b=a.Mnozenje(43);
        System.out.println(b);
        System.out.println(a.marka+" "+a.model+" "+a.boja+" "+a.pominatiKm);
	}
}
