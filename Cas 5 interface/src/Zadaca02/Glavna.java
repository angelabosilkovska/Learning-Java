package Zadaca02;

public class Glavna {
   public static void main(String[] args) {
	   HTTPServer s=new HTTPServer();
	   System.out.println(s.Connect(5,7));
	   System.out.println(s.Disconnect());
   }
}  
