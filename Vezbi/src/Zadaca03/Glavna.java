package Zadaca03;

public class Glavna {

	public static void main(String[] args) {
       Fakultet f=new Fakultet("FIKT",3,500,"fdgxd","fgxhgf");
       Fakultet f1=new Fakultet("FINKI",10,5000,"dvgzd","ftdg");
       f.Zgolemuvanje();
       System.out.println(f.Zgolemuvanje());
       f.Namaluvanje();
       System.out.println(f.Namaluvanje());
       f.Pecati();
       f1.Zgolemuvanje();
       System.out.println(f1.Zgolemuvanje());
       f1.Namaluvanje();
       System.out.println(f1.Namaluvanje());
       f1.Pecati();
	}

}
