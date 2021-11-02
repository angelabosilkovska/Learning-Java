package Zadaca20;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import Zadaca18.Vozilo;

public class XML {
	public String kreirajXmlFajl(ArrayList<Avion>avioni) throws IOException{
		  String response="Dokumentot ne e kreiran";
		  try {
			  DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
			  DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
			  Document document=documentBuilder.newDocument();
			  
			  Element root=(Element) document.createElement("Avioni");
			  document.appendChild(root);
			  for(int i=0;i<avioni.size();i++) {
				  Element avion=(Element) document.createElement("Avion");
				  root.appendChild(avion);
				  
				  Element marka=document.createElement("Marka");
				  avion.appendChild(marka);
				  marka.appendChild(document.createTextNode(avioni.get(i).getMarka()));
				  
				  Element model=document.createElement("Model");
				  avion.appendChild(model);
				  model.appendChild(document.createTextNode(avioni.get(i).getModel()));
				  
				  Element cena=document.createElement("Cena");
				  avion.appendChild(cena);
				  cena.appendChild(document.createTextNode(avioni.get(i).getCena()));
			  }
			  TransformerFactory transformerFactory=TransformerFactory.newInstance();
			  Transformer transformer=transformerFactory.newTransformer();
			  DOMSource source=new DOMSource(document);
			  File file=new File("Avionxml.xml");
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
