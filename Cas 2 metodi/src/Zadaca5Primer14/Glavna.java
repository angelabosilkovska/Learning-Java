package Zadaca5Primer14;

public class Glavna {
	public static void main(String[] args) {
		int GoleminaNaMemorija=3;
		int GoleminaNaCip=6;
		String TipNaMemorija="DDR2";
		NadgradbaNaRam p=new NadgradbaNaRam();
		String res;
		res=p.Vrednosti(GoleminaNaMemorija,GoleminaNaCip,TipNaMemorija);
		System.out.println(res);
	}
}
