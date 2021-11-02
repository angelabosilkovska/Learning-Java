package Zadaca39;

public class Glavna {
	public static void main(String[] args) {
		Covek c=new Covek();
		//String ime,prezime,data;
		//double visina,tezina;
		c.setIme("Andrej");
		c.setPrezime("Jovanov");
		c.setTezina(25.8);
		c.setVisina(56);
		c.setData("25.12.2015");
		
		/*
		 * ime=c.getIme();
		 * prezime=c.getPrezime();
		 * visina=c.getVisina();
		 * tezina=c.getTezina();
		 * data=c.getData();
		 * System.out.println(ime+" "+prezime+" "+tezina+" "+visina+" "+data);
		 */
		System.out.println(c.getIme()+" "+c.getPrezime()+" "+c.getVisina());
	}

}
