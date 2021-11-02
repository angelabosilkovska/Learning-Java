package Zadaca32;

public class Glavna {
    public static void main(String[] args) {
    	Kompjuter k=new Kompjuter();
    	k.setTipNaProcesor("Inte; i5");
    	k.setGoleminaNaDisk("500GB");
    	k.setGoleminaNaRam("4GB");
    	System.out.println("tipNaProcesor: "+k.getTipNaProcesor()+";GoleminaNaDisk: "+k.getGoleminaNaDisk()+";goleminaNaRam:"+k.getGoleminaNaRam());
    }
}
