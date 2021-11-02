package Zadaca08;

public class Glavna {

	public static void main(String[] args) {
		Covek c=new Covek();
        c.setIme("Trajko");
        c.setPrezime("Trajkovski");
        c.setMaticenBroj(56753);
        System.out.println(c.getIme());
        System.out.println(c.getPrezime());
        System.out.println(c.getMaticenBroj());
	}

}
