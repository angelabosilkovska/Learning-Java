package Zadaca15;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XML {
	public String kreirajXmlFajl(ArrayList<Profesor>profesori) throws IOException{
		  String response="Dokumentot ne e kreiran";
		  try {
			  DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
			  DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
			  Document document=documentBuilder.newDocument();
			  
			  Element root=(Element) document.createElement("Profesori");
			  document.appendChild(root);
			  for(int i=0;i<profesori.size();i++) {
				  Element profesor=(Element) document.createElement("Doktor");
				  root.appendChild(profesor);
				  
				  Element ime=document.createElement("Ime");
				  profesor.appendChild(ime);
				  ime.appendChild(document.createTextNode(profesori.get(i).ime));
				  
				  Element prezime=document.createElement("Prezime");
				  profesor.appendChild(prezime);
				  prezime.appendChild(document.createTextNode(profesori.get(i).prezime));
				  
				  Element titula=document.createElement("Titula");
				  profesor.appendChild(titula);
				  titula.appendChild(document.createTextNode(profesori.get(i).titula));
				  
				  Element plata=document.createElement("Plata");
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
