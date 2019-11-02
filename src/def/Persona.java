package def;

import java.io.Writer;
import java.util.Scanner;

public class Persona {

	public Persona(String nome, String cognome, String nTel, String email) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.nTel = nTel;
		this.email = email;
	}

	private String nome;
	private String cognome;
	private String nTel;
	private String email;

	public Persona() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getnTel() {
		return nTel;
	}

	public String getMail() {
		return email;
	}

	public void setnTel(String nTel) {
		this.nTel = nTel;
	}

	public Persona(String nome, String cognome, String nTel) {
		this.nome = nome;
		this.cognome = cognome;
		this.nTel = nTel;
	}

	public void newPersona() {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire i Dati del Nuovo Contatto\nNome: ");
		this.nome = input.nextLine();

		System.out.println("Cognome: ");
		this.cognome = input.nextLine();

		do {
			System.out.println("Numero di Telefono: ");
			this.nTel = input.nextLine();
		} while (!this.isNumeric(this.nTel));

		do {
			System.out.println("E-Mail: ");
			this.email = input.nextLine();
		} while (!this.email.contains("@") && !this.email.contains("."));
	}

	public boolean isNumeric(String strNum) {
		try {
			double d = Double.parseDouble(strNum);
		} catch (NumberFormatException | NullPointerException nfe) {
			return false;
		}
		return true;
	}

}
