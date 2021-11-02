package Zadaca09;

public class Glavna {

	public static void main(String[] args) {
		Vraboten v=new Vraboten("Angela","Bosilkovska",30,20000);
		v.Presmetaj();
		System.out.println(v.getIme()+v.getPrezime()+v.getGodini()+v.getOsnovnaPlata());
		System.out.println(v.Presmetaj());
	}

}
