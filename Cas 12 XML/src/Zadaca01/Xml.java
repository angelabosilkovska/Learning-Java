package Zadaca01;
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

	public void kreirajXmlFajl (String imeNaFajl) {
		try {
			//Standarden kod za kreiranje dokument
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory .newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.newDocument();
			
			//Kreiranje na elementi (tagovite) na dokumentot
			Element root = (Element) document.createElement("Student");
			Element prezime = (Element) document.createElement("Prezime");
			Element ime = (Element) document.createElement("Ime");
			Element indeks = (Element) document.createElement("indeks");
			
			//dodeluvanje na vresnosti
			prezime.appendChild(document.createTextNode("Petko"));
			ime.appendChild(document.createTextNode("Petkovski"));
			indeks.appendChild(document.createTextNode("2050"));
			root.appendChild(ime);
			root.appendChild(prezime);
			root.appendChild(indeks);
			document.appendChild(root);
			
			//standarden kod za zapichuvanje na fajlot na disk
			Source source = new DOMSource(document);
			File file = new File(imeNaFajl);
			Result result = new StreamResult(file);
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.transform(source, result);
			System.out.println("Dokumntot e kreiran, negovoto ime e: "+imeNaFajl);
			} catch (Exception e) {
				System.out.println(e.toString());
			}
	}
}
