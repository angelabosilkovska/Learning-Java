package Zadaca20;

public class Glavna {
   public static void main(String[] args) {
	   Kompjuter k=new Kompjuter("gdd","sgvs","vgs");
	   Kompjuter k1=new Kompjuter();
	   System.out.println(k.tipNaProcesor+" "+k.goleminaNaDisk+" "+k.goleminaNaRam);
	   System.out.println(k1.tipNaProcesor+" "+k1.goleminaNaDisk+" "+k1.goleminaNaRam);
   }
}
