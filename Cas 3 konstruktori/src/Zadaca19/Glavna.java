package Zadaca19;

public class Glavna {
	 public static void main(String[] args) {
		   Kompjuter k=new Kompjuter("scdds","wfsd","fsdrf");
		   System.out.println(k.tipNaProcesor+" "+k.goleminaNaDisk+" "+k.goleminaNaRam);
		   
		   Kompjuter k1=new Kompjuter();
		   System.out.println(k1.tipNaProcesor);
		   System.out.println(k1.goleminaNaDisk);
		   System.out.println(k1.goleminaNaRam);
	   }
	 
	 }
