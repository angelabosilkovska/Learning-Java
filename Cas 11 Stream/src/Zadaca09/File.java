package Zadaca09;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File {
   FileInputStream in;
   FileOutputStream out;
   String text1;
   
   public File(String text1) {
   	this.text1=text1;
   }
   public void zapishi(String text) throws IOException{
	   out=new FileOutputStream(text1);
	   
	   for(int i=0; i<text.length(); i++) {
 		   out.write(text.charAt(i));
 	   }
   }
   public void procitaj() throws IOException{
	   in=new FileInputStream(text1);
	   int c;
	   while((c=in.read()) != -1) {
 		   System.out.print((char) c);	   
 		   }
 	   in.close();
   }
   public void pecatiSekojVtorZbor() throws IOException{
	   int k=0;
   	   int c;
   	   in=new FileInputStream(text1);
   	
   	   while((c=in.read()) != -1) {
   		   if((char)c==' ') {
   			   k++;
   		   }
   		   if(k%2==0) {
   			   System.out.print((char)c);
   		   }
   			   
       }
   }
}