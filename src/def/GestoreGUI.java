package def;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

public class GestoreGUI {
	private GUI_Cerca_Contatto cerca_Contatto;
	private GUI_Elimina_Contatto elimina_Contatto;
	private GUI_Crea_Contatto crea_Contatto;
	private GUI_Visualizza_Rubrica visualizza_Rubrica;
	private GUI_Menu menu;
	private XMLWriter writer;
	private String back = "";
	private Boolean exists;
	int i = 0;
	
	public GestoreGUI() {}

	public void init() throws FileNotFoundException, IOException, ParserConfigurationException, SAXException, TransformerException {
		writer = new XMLWriter();
		
		if (!writer.getFileXML().exists()) {
			System.out.println("File Non Esistente");
			exists = false;
		} else {
			XMLReader r = new XMLReader();
			System.out.println("Il file e' gia' esistente");
			exists = true;
			back = r.copy();
		}

		writer.init(exists);
		
		if (exists) {
			i = Integer.parseInt(writer.getI());
		}
		
		this.prova();
				
		cerca_Contatto = new GUI_Cerca_Contatto(this);
		elimina_Contatto = new GUI_Elimina_Contatto(this);
		crea_Contatto = new GUI_Crea_Contatto(this);
		visualizza_Rubrica = new GUI_Visualizza_Rubrica(this);
		menu = new GUI_Menu(this);
		menu.setVisible(true);
		
	}
	
	
	public void prova() throws TransformerException {
		/*
		 * writer.writeRubrica(i, "Mattia", "Pezzotti", "3668925557",
		 * "matpezzo01@gmail.com"); i++; writer.writeRubrica(i, "Noemi", "Cancelli",
		 * "45203452", "lal@gmail.com"); i++; writer.writeRubrica(i, "Gigi", "Coin",
		 * "87654", "maasdzo01asd@gmail.com");
		 */

		// writer.searchContact("36");
		// writer.printById("2");
		// writer.prettyPrint();
		// writer.deleteElement("4");
		
	}

	
	public int getI() {
		i++;
		return this.i;
	}
	
	public GUI_Cerca_Contatto getCerca_Contatto() {
		return cerca_Contatto;
	}

	public void setCerca_Contatto(GUI_Cerca_Contatto cerca_Contatto) {
		this.cerca_Contatto = cerca_Contatto;
	}

	public GUI_Elimina_Contatto getElimina_Contatto() {
		return elimina_Contatto;
	}

	public void setElimina_Contatto(GUI_Elimina_Contatto elimina_Contatto) {
		this.elimina_Contatto = elimina_Contatto;
	}

	public GUI_Crea_Contatto getCrea_Contatto() {
		return crea_Contatto;
	}

	public void setCrea_Contatto(GUI_Crea_Contatto crea_Contatto) {
		this.crea_Contatto = crea_Contatto;
	}

	public GUI_Visualizza_Rubrica getVisualizza_Rubrica() {
		return visualizza_Rubrica;
	}

	public void setVisualizza_Rubrica(GUI_Visualizza_Rubrica visualizza_Rubrica) {
		this.visualizza_Rubrica = visualizza_Rubrica;
	}

	public GUI_Menu getMenu() {
		return menu;
	}

	public void setMenu(GUI_Menu menu) {
		this.menu = menu;
	}
	
	public XMLWriter getWriter() {
		return writer;
	}

	public void setWriter(XMLWriter writer) {
		this.writer = writer;
	}

}
