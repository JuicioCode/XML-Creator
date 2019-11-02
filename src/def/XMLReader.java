package def;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class XMLReader {

	private final FileReader file;
	private final BufferedReader b;
	private String path = "C:/Users/Public/rubrica.xml";
	private String string;

	public XMLReader() throws FileNotFoundException, IOException {
		this.file = new FileReader(path);
		this.b = new BufferedReader(file);
		this.string = b.readLine();
	}

	public String copy() {
		int length = this.string.length() - 10;
		this.string = string.substring(0, length);
		return this.string;
	}

	public int nPersona() {
		return Integer.parseInt(string.substring(string.length() - 2, string.length() - 1));
	}

}
