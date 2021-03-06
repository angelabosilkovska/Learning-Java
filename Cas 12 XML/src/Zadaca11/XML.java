package Zadaca11;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;
import java.util.ArrayList;

public class XML {
   public String kreirajXmlFajl(ArrayList<Profesor>profesori) throws IOException{
	   String  response="Ne e kreiran dokument ";
		   try {
			   DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
			   DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
			   Document document=documentBuilder.newDocument();
			   
			   Element root=(Element) document.createElement("Profesori");
			   document.appendChild(root);  
			   for(int i=0;i<profesori.size();i++)
			   {
				   Element profesor=(Element) document.createElement("Profesor");
				   root.appendChild(profesor);
				   
				   Element ime=document.createElement("ime");
				   profesor.appendChild(ime);
				   ime.appendChild(document.createTextNode(profesori.get(i).ime));
				   
				   Element prezime=document.createElement("prezime");
				   profesor.appendChild(prezime);
				   prezime.appendChild(document.createTextNode(profesori.get(i).prezime));
				   
				   Element titula=document.createElement("titula");
				   profesor.appendChild(titula);
				   titula.appendChild(document.createTextNode(profesori.get(i).titula));
				   
				   Element plata=document.createElement("plata");
				   profesor.appendChild(plata);
				   plata.appendChild(document.createTextNode(profesori.get(i).plata));
			   }
			   TransformerFactory transformerFactory=TransformerFactory.newInstance();
			   Transformer transformer=transformerFactory.newTransformer();
			   DOMSource source=new DOMSource(document);
			   File file=new File("Profesorxml.xml");
			   Result result=new StreamResult(file);
			   transformer.transform(source, result);
			   response="Dokumentot e kreiran";
		   }
	   
		   catch(Exception e) {
			   response +="Error: "+e;
		   }
   
	   return response;
   }
}