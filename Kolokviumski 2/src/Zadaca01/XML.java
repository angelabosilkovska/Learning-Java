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

public class XML {
   public String kreirajXmlFajl(String imeNaFajl) {
	   String response="Dokumentot ne e kreiran";
	   try {
		   DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
		   DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
		   Document document=documentBuilder.newDocument();
		   
		   Element root=(Element) document.createElement("Lekovi");
		   Element lek=(Element) document.createElement("Lek");
		   Element ime=(Element) document.createElement("Ime");
		   Element nesakaniDejstva=(Element) document.createElement("NesakaniDejstva");
		   Element nd1=(Element) document.createElement("nd1");
		   Element glavobolka=(Element) document.createElement("Glavobolka");
		   Element nd2=(Element) document.createElement("nd2");
		   Element vrtoglavica=(Element) document.createElement("Vrtoglavica");
		   Element cena=(Element) document.createElement("Cena");
		   
		   document.appendChild(root);
		   root.appendChild(lek);
		   lek.appendChild(ime);
		   lek.appendChild(nesakaniDejstva);
		   nesakaniDejstva.appendChild(nd1);
		   nd1.appendChild(glavobolka);
		   nesakaniDejstva.appendChild(nd2);
		   nd2.appendChild(vrtoglavica);
		   lek.appendChild(cena);
		   cena.appendChild(document.createTextNode("220"));
		   
		   	   
		    Source source = new DOMSource(document);
			File file = new File(imeNaFajl);
			Result result = new StreamResult(file);
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.transform(source, result);
			response="Dokumentot e kreiran";
			} catch (Exception e) {
				response +="Error: "+e;
			}
	   return response;
	   }
   }
