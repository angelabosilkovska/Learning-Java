package Zadaca12;

public class Glavna {
	public static void main(String[] args) {
    Brod b=new Brod(24,45,54,32,54);
    Voz v=new Voz(43,1,3,5);
    System.out.println(v.getTezinaNaTovar());
    System.out.println(v.getDolzinaVoKm());
    System.out.println(b.getTezinaNaTovar());
    System.out.println(b.getDolzinaVoKm());
    double vv=v.presmetka();
    double bb=b.presmetka();
    System.out.println(vv);
    System.out.println(bb);
    }
}
