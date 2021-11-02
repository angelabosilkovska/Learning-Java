package Zadaca08;

public class HTTPServer implements IServers{
	public HTTPServer()
	{
		
	}
	@Override
	public String Connect(int a, int b) {
		return a+" "+b;
	}
	@Override
	public String Disconnect() {
	   String a="Serverot e diskonektiran";
	   return a;
	}
}
