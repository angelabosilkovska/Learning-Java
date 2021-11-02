package Zadaca10;
import java.io.File;
import java.io.IOException;

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
import java.util.ArrayList;

public class XML {
	public String kreirajXmlFajl(ArrayList<Vraboten>vraboteni) throws IOException{
		String response="Dokumentot ne e kreiran";
		try {
			DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
			Document document=documentBuilder.newDocument();
			
			Element root=(Element) document.createElement("Vraboteni");
			document.appendChild(root);
			for(int i=0;i<vraboteni.size();i++) {
				Element vraboten=(Element) document.createElement("Vraboten");
				root.appendChild(vraboten);
				
				Element ime=document.createElement("ime");
				vraboten.appendChild(ime);
				ime.appendChild(document.createTextNode(vraboteni.get(i).ime));
				
				Element prezime=document.createElement("prezime");
				vraboten.appendChild(ime);
				prezime.appendChild(document.createTextNode(vraboteni.get(i).prezime));
				
				Element plata=document.createElement("plata");
				vraboten.appendChild(plata);
				plata.appendChild(document.createTextNode(vraboteni.get(i).plata));
				}
			TransformerFactory transformerFactory=TransformerFactory.newInstance();
			Transformer transformer=transformerFactory.newTransformer();
			DOMSource source=new DOMSource(document);
			File file=new File("Vrabotenxml.xml");
			Result result=new StreamResult(file);
			transformer.transform(source, result);
			response="Dokumentot e kreiran";
		}
		catch(Exception e) {
			response +="Error:"+e;
		}
		return response;
	}
}
