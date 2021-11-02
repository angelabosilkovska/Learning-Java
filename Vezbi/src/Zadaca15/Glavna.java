package Zadaca15;

public class Glavna {

	public static void main(String[] args) {
		Avtomobil a=new Avtomobil();
		a.marka="gfxb";
		a.model="fsdsd";
		a.pominatiKm=0;
		Avtomobil a1=new Avtomobil("fsdd","zfvdd",25443);
        System.out.println(a.marka+a.model+a.pominatiKm);
        System.out.println(a1.marka+a1.model+a1.pominatiKm);
	}

}
