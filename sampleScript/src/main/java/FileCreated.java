import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class FileCreated {
	public static void main(String[] args) throws IOException {
		List<String> words = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(
				new FileReader("C:\\Users\\mohbhal\\OneDrive - Publicis Groupe\\Desktop\\test.txt"));
		String line;
		while ((line = reader.readLine()) != null) {
			words.add(line);
			// System.out.println(line);
			String[] fl = line.split("/");

			String second = fl[1];
			if (second.contains("xml")) {

				System.out.println(second);
			} else {
				System.out.println("text");

			}
			for (int i = 0; i < words.size(); i++) {
				String xmlFilePath = second;

				try {

					DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

					DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

					Document document = documentBuilder.newDocument();

					// root element
					Element root = document.createElement("company");
					document.appendChild(root);

					// employee element
					Element employee = document.createElement("employee");

					root.appendChild(employee);

					// set an attribute to staff element
					Attr attr = document.createAttribute("id");
					attr.setValue("10");
					employee.setAttributeNode(attr);

					// you can also use staff.setAttribute("id", "1") for this

					// firstname element
					Element firstName = document.createElement("firstname");
					firstName.appendChild(document.createTextNode("James"));
					employee.appendChild(firstName);

					TransformerFactory transformerFactory = TransformerFactory.newInstance();
					Transformer transformer = transformerFactory.newTransformer();
					DOMSource domSource = new DOMSource(document);
					StreamResult streamResult = new StreamResult(new File(xmlFilePath));

					// If you use
					// StreamResult result = new StreamResult(System.out);
					// the output will be pushed to the standard output ...
					// You can use that for debugging

					transformer.transform(domSource, streamResult);

					System.out.println("Done creating XML File");

				} catch (ParserConfigurationException pce) {
					pce.printStackTrace();
				} catch (TransformerException tfe) {
					tfe.printStackTrace();
				}
			}

		}

	}
}
