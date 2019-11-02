package def;

//Imports
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLWriter {

	//Variables Declaration
	private File fileXML;
	private FileWriter fw;
	private String path = "C:/Users/Public/rubrica.xml"; //Path to file
	private DocumentBuilderFactory documentFactory;
	private DocumentBuilder documentBuilder;
	private Document document;
	private Element contatto;
	private Element root;
	//End of variables Declaration

	public XMLWriter() {
		this.fileXML = new File(path);
	}

	// Gets the path and instance of the already existing file
	public void copy() throws ParserConfigurationException, SAXException, IOException {
		document = documentBuilder.parse(path);
		root = document.getDocumentElement();
	}

	// Inits all the Document DOM instances and creates a new root and header if the file does not exist
	public void init(Boolean exist) throws IOException, ParserConfigurationException, SAXException {
		documentFactory = DocumentBuilderFactory.newInstance();
		documentBuilder = documentFactory.newDocumentBuilder();
		if (exist)
			//The file did exist
			copy();
		else {
			//The file did not exist
			document = documentBuilder.newDocument();
			root = document.createElement("rubrica");
			document.appendChild(root);
		}
	}

	// For Debug purpose, prints a String if the file exists
	public void newFile() throws IOException {
		if (fileXML.exists()) {
			System.out.println("Il file " + path + " esiste");
		} else if (fileXML.createNewFile()) {
			System.out.println("Il file " + path + " e' stato creato");

		} else {
			System.out.println("Il file " + path + " non può essere creato");
		}
	}

	// Creates a new node along with his tag and argument
	public Element writeTagElement(Document document, String argString, String tagString) {
		Element tag = document.createElement(tagString);
		tag.appendChild(document.createTextNode(argString));
		return tag;
	}

	// Appends a new contact to write on the instance of the DOM Writer
	public Element writeNewContact(int id, String nome, String cognome, String tel, String email) {
		contatto = document.createElement("contatto");
		contatto.setAttribute("id", "" + id);
		contatto.appendChild(writeTagElement(document, nome, "Nome")); //append the "Nome" node with his attribute to his parent
		contatto.appendChild(writeTagElement(document, cognome, "Cognome"));//append the "Cognome" node with his attribute to his parent
		contatto.appendChild(writeTagElement(document, tel, "Numero_Di_Telefono"));//append the "Numero_Di_Telefono" node with his attribute to his parent
		contatto.appendChild(writeTagElement(document, email, "E-Mail"));//append the "E-Mail" node with his attribute to his parent
		return contatto;
	}

	// Appends a new contact to write under the root element
	public void writeRubrica(int id, String nome, String cognome, String tel, String email) {
		root.appendChild(writeNewContact(id, nome, cognome, tel, email));
	}

	// Checks if the .xml file has any contacts and returns the last used ID if any exists
	public String getI() {
		String name = "1";
		try {
			document.getDocumentElement().normalize();
			NodeList layerConfigList = document.getElementsByTagName("contatto");
			Node node = layerConfigList.item(layerConfigList.getLength() - 1);
			Element e = (Element) node;
			name = e.getAttribute("id");
		} catch (Exception e) {
			System.out.println("File senza contatti");
		}
		return name;

	}

	// Searches the .xml file for recurrence of a given Word
	public String searchContact(String s) {
		String check = "";
		document.getDocumentElement().normalize(); // normalizes the Document in a readable format
		NodeList nodi = document.getElementsByTagName("contatto");  // returns all the nodes with the name "contatto"
		int length = nodi.getLength(); // returns the number of the nodes
		for (int i = 0; i < length; i++) {
			if (nodi.item(i).getNodeType() == Node.ELEMENT_NODE) { // this FOR searches for each ELEMENT_NODE element in the file and prints his children's Content
				Element el = (Element) nodi.item(i);
				if (el.getNodeName().contains("contatto")) {
					String name = el.getElementsByTagName("Nome").item(0).getTextContent();// return a String which contains the Content of the Node "Nome"
					String cognome = el.getElementsByTagName("Cognome").item(0).getTextContent();// return a String which contains the Content of the Node "Cognome"
					String tel = el.getElementsByTagName("Numero_Di_Telefono").item(0).getTextContent();// return a String which contains the Content of the Node "Numero_Di_Telefono"
					String mail = el.getElementsByTagName("E-Mail").item(0).getTextContent();// return a String which contains the Content of the Node "E-Mail"
					if (name.contains(s) || cognome.contains(s) || tel.contains(s) || mail.contains(s)) { // checks if any of the Strings has the word given
						check += ("ID:" + el.getAttribute("id") + "\n" + name + ", " + cognome + ", " + tel + ", " + mail + "\n\n");
					}
				}
			}
		}
		return check;
	}

	// For Debug purpose, prints the element in the .xml file with the chosen ID
	public boolean printById(String id) {
		document.getDocumentElement().normalize(); // normalizes the Document in a readable format
		NodeList nodi = document.getElementsByTagName("contatto"); // returns all the nodes with the name "contatto"
		int length = nodi.getLength(); // returns the number of the nodes
		for (int i = 0; i < length; i++) {
			if (nodi.item(i).getNodeType() == Node.ELEMENT_NODE) { // this FOR searches for each ELEMENT_NODE element in the file and prints his children's Content
				Element el = (Element) nodi.item(i);
				if (el.getNodeName().contains("contatto")) { 
					if (Integer.parseInt(el.getAttribute("id")) == Integer.parseInt(id)) {
						String name = el.getElementsByTagName("Nome").item(0).getTextContent(); // return a String which contains the Content of the Node "Nome"
						String cognome = el.getElementsByTagName("Cognome").item(0).getTextContent(); // return a String which contains the Content of the Node "Cognome"
						String tel = el.getElementsByTagName("Numero_Di_Telefono").item(0).getTextContent(); // return a String which contains the Content of the Node "Numero_Di_Telefono"
						String mail = el.getElementsByTagName("E-Mail").item(0).getTextContent();// return a String which contains the Content of the Node "E-Mail"
						System.out.println(name + " " + cognome + " " + tel + " " + mail);
						return true;
					}
				}
			}
		}
		return false;
	}

	// Returns all the elements in the .xml file in a formalized way
	public String printRubrica() {
		String string = "";
		document.getDocumentElement().normalize(); // normalizes the Document in a readable format
		NodeList nodi = document.getElementsByTagName("contatto"); // returns all the nodes with the name "contatto"
		int length = nodi.getLength(); // returns the number of the nodes
		for (int i = 0; i < length; i++) {
			if (nodi.item(i).getNodeType() == Node.ELEMENT_NODE) { // this FOR searches for each ELEMENT_NODE element in the file and prints his children's Content
				Element el = (Element) nodi.item(i);
				if (el.getNodeName().contains("contatto")) {
					String name = el.getElementsByTagName("Nome").item(0).getTextContent(); // return a String which contains the Content of the Node "Nome"
					String cognome = el.getElementsByTagName("Cognome").item(0).getTextContent(); // return a String which contains the Content of the Node "Cognome"
					String tel = el.getElementsByTagName("Numero_Di_Telefono").item(0).getTextContent(); // return a String which contains the Content of the Node "Numero_Di_Telefono"
					String mail = el.getElementsByTagName("E-Mail").item(0).getTextContent(); // return a String which contains the Content of the Node "E-Mail"
					String id = el.getAttribute("id");
					string += "\nID Contatto: " + id + "\nNome: " + name + "\nCognome: " + cognome + "\nTelefono: "
							+ tel + "\nE-Mail: " + mail + "\n";
				}
			}
		}
		return string;
	}

	// For Debug purpose, it prints all the elements in the .xml file in a more readable way (without the nodes and all the other stuff, just names)
	public void prettyPrint() throws Exception {
		Transformer tf = TransformerFactory.newInstance().newTransformer();
		tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		tf.setOutputProperty(OutputKeys.INDENT, "yes");
		Writer out = new StringWriter();
		tf.transform(new DOMSource(document), new StreamResult(out));
		System.out.println(out.toString());
	}

	// Deletes a contact in the .xml File based on the given ID
	public Boolean deleteElement(String id) {
		document.getDocumentElement().normalize(); // normalizes the Document in a readable format
		NodeList nodi = document.getElementsByTagName("contatto"); // returns all the nodes with the name "contatto"
		int length = nodi.getLength(); // returns the number of the nodes
		for (int i = 0; i < length; i++) { // this for search for each ELEMENT_NODE element in the file and deletes the one with the correct ID along with his children
			if (nodi.item(i).getNodeType() == Node.ELEMENT_NODE) {
				Element el = (Element) nodi.item(i);
				if (el.getNodeName().contains("contatto")) {
					if (Integer.parseInt(el.getAttribute("id")) == Integer.parseInt(id)) {
						el.getParentNode().removeChild(el);
						return true;
					}
				}
			}
		}
		return false;
	}

	// Deletes all contacts in the .xml File
	public void wipe() {
		document.getDocumentElement().normalize(); // normalizes the Document in a readable format
		NodeList nodi = document.getElementsByTagName("contatto"); // returns all the nodes with the name "contatto"
		int length = nodi.getLength(); // returns the number of the nodes
		for (int i = 0; i < length; i++) { // this FOR searches for each ELEMENT_NODE element in the file and deletes them along with his children
			if (nodi.item(0).getNodeType() == Node.ELEMENT_NODE) {
				Element el = (Element) nodi.item(0);
				if (el.getNodeName().contains("contatto")) {
					el.getParentNode().removeChild(el);
				}
			}
		}
	}

	// Creates the .xml File and parse the DOM object into the .xml file
	public void parseDOMtoXML() throws TransformerException {
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource domSource = new DOMSource(document);
		StreamResult streamResult = new StreamResult(new File(path));
		transformer.transform(domSource, streamResult);
	}

	//Getters and Setters
	public File getFileXML() {
		return fileXML;
	}

	public void setFileXML(File fileXML) {
		this.fileXML = fileXML;
	}

	public FileWriter getFw() {
		return fw;
	}

	public void setFw(FileWriter fw) {
		this.fw = fw;
	}
	//End of Getters and Setters
}
