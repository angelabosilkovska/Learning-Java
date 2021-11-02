package Zadaca16;
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
	public String kreirajXmlFajl(ArrayList<Dekan>dekani) throws IOException{
		  String response="Dokumentot ne e kreiran";
		  try {
			  DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
			  DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
			  Document document=documentBuilder.newDocument();
			  
			  Element root=(Element) document.createElement("Dekani");
			  document.appendChild(root);
			  for(int i=0;i<dekani.size();i++) {
				  Element dekan=(Element) document.createElement("Dekan");
				  root.appendChild(dekan);
				  
				  Element ime=document.createElement("Ime");
				  dekan.appendChild(ime);
				  ime.appendChild(document.createTextNode(dekani.get(i).ime));
				  
				  Element prezime=document.createElement("Prezime");
				  dekan.appendChild(prezime);
				  prezime.appendChild(document.createTextNode(dekani.get(i).prezime));
				  
				  Element fakultet=document.createElement("Fakultet");
				  dekan.appendChild(fakultet);
				  fakultet.appendChild(document.createTextNode(dekani.get(i).fakultet));
				  
				  Element plata=document.createElement("Plata");
				  dekan.appendChild(plata);
				  plata.appendChild(document.createTextNode(dekani.get(i).plata));
			  }
			  TransformerFactory transformerFactory=TransformerFactory.newInstance();
			  Transformer transformer=transformerFactory.newTransformer();
			  DOMSource source=new DOMSource(document);
			  File file=new File("Dekanxml.xml");
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
