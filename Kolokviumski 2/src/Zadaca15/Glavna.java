package Zadaca15;

public class Glavna {

	public static void main(String[] args) {
		Covek c=new Covek("Angela","Bosilkovska",1999);
		System.out.println(c.getIme()+" "+c.getPrezime()+" "+c.godinaNaRaganje);
		Covek c1=new Covek();
		c1.setIme("Marija");
        c1.setPrezime("Mitrevska");
		c1.godinaNaRaganje=2000;
        System.out.println(c1.getIme()+" "+c1.getPrezime()+" "+c1.godinaNaRaganje);
	}

}
