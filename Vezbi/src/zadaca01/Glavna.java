package zadaca01;

public class Glavna {

	public static void main(String[] args) {
       Proizvod p=new Proizvod();
       Proizvod p1=new Proizvod("Cokolado",55);
       p1.tezina=98.5;
       System.out.println(p.imeNaProizvod+" "+p.tezina+" "+p.cena);
       System.out.println(p1.imeNaProizvod+" "+p1.tezina+" "+p1.cena);
	}

}
