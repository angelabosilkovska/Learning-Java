package Zadaca02;
import java.io.File;
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

public class Xml {
 
	public void kreirajFajl(String imeNaFajl) {
		try {
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory .newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.newDocument();
			
			Element root = (Element) document.createElement("Vraboten");
			Element ime = (Element) document.createElement("Ime");
			Element prezime = (Element) document.createElement("Prezime");
			Element plata = (Element) document.createElement("Plata");
			
			ime.appendChild(document.createTextNode("Petko"));
			prezime.appendChild(document.createTextNode("Petkovski"));
			plata.appendChild(document.createElement("42421"));
			root.appendChild(ime);
			root.appendChild(prezime);
			root.appendChild(plata);
			document.appendChild(root);
			
			Source source = new DOMSource(document);
			File file = new File(imeNaFajl);
			Result result = new StreamResult(file);
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.transform(source, result);
			System.out.println("Dokumentot e kreiran, negovoto ime e: "+imeNaFajl);
			} catch(Exception e) {
				System.out.println(e.toString());
			}
	}
}
