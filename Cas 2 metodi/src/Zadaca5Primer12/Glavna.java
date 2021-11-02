package Zadaca5Primer12;

public class Glavna {
   public static void main(String[] args) {
	   String ime="Petko";
	   String otcek="DEDED";
	   int godini=12;
	   Predmet p=new Predmet();
	   String res;
	   res=p.Vrednosti(ime, otcek, godini);
	   System.out.println(res);
	   
   }
   
}
