package Zadaca02;

public class HTTPServer implements IServer {
     public String Connect(int a,int b) {
    	 return a+" "+b;
     }
     public String Disconnect() {
    	return "Serverot e diskonektiran";
     }
}
