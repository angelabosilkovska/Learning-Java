package Zadaca05;

public class Glavna {
  public static void main(String[] args) {	
	Vraboten v=new Vraboten("gdfsg","vgdf",5334,6545,432,"Petko","Petkovski",334,"fgvs",567,535);
	System.out.println(v.getImeF());
	System.out.println(v.getUlicaF());
	System.out.println(v.getTelefonF());
	System.out.println(v.getGodinaOtvoranjeO());
	System.out.println(v.getBrojVraboteniO());
	System.out.println(v.getImeV());
	System.out.println(v.getPrezimeV());
	System.out.println(v.getTelefonV());
	System.out.println(v.getBodV());
	System.out.println(v.getVbodV());
	Sef s=new Sef("gsgf","juyfy",8576,456,6533,"Petko","Petkovski",334,"fgvs",567,535);
	System.out.println(s.getImeF());
	System.out.println(s.getUlicaF());
	System.out.println(s.getTelefonF());
	System.out.println(s.getGodinaOtvoranjeO());
	System.out.println(s.getBrojVraboteniO());
	System.out.println(s.getImeS());
	System.out.println(s.getPrezimeS());
	System.out.println(s.getTelefonS());
	System.out.println(s.getBodS());
	System.out.println(s.getVbodS());
}
}