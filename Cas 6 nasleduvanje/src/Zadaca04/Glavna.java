package Zadaca04;

public class Glavna {
    public static void main(String[] args) {
    	Vraboten v=new Vraboten();
    	v.VnesV();
    	v.IspisV();
    	Sef s=new Sef();
    	s.VnesS();
    	s.IspisS();
    	Vraboten v1=new Vraboten("Petko","Petkovski","fgvs",424,"gdfxd",535);
    	v1.IspisV();
    	Sef s1=new Sef("Petko","Petkovski","fgvs",424,"gdfxd",535,"fgd",4353);
    	s1.IspisS();
    }
}
