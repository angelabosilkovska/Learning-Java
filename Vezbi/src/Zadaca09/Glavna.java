package Zadaca09;

public class Glavna {

	public static void main(String[] args) {
		Restoran r=new Restoran();
        r.setIme("gvsdf");
        r.setLokacija("frdrgzse");
        r.setTelefon(356556);
        r.setBrNaSedista(324);
        System.out.println(r.getIme());
        System.out.println(r.getLokacija());
        System.out.println(r.getTelefon());
        System.out.println(r.getBrNaSedista());
	}

}
