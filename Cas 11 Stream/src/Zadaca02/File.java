package Zadaca02;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File {
	FileInputStream in;
	FileOutputStream out;
	String fName;
	
	public File(String fName) {
		this.fName=fName;
	}
	public void zapishi(String text) throws IOException {
		   out=new FileOutputStream(this.fName);
		   
		   for(int i=0; i<text.length(); i++) {
			   out.write(text.charAt(i));
		   }
	   }
	   public void prochitaj() throws IOException {
		   in=new FileInputStream(this.fName);
		   int c;
		   while((c=in.read()) != -1) {
			   System.out.print((char) c);
		   }
		   in.close();
	   }
	public void proveri(char x) throws IOException{
		int k=0;
		int c;
		in=new FileInputStream(fName);
		
		while ((c=in.read()) != -1) {
			if(x==(char)c) {
				k++;
			}
		}
		System.out.println(k);
	}
}
