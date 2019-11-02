package def;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.xml.transform.TransformerException;

public final class GUI_Crea_Contatto extends javax.swing.JFrame {

	private GestoreGUI g;
	String nome;
	String cognome;
	String tel;
	String mail;

	public GUI_Crea_Contatto(GestoreGUI g) {
		this.g=g;
		this.addWindowListener(new WindowAdapter() {
		    public void windowClosing(WindowEvent e) {
		    	try {
					g.getWriter().parseDOMtoXML();
				} catch (TransformerException e1) {
				}
		        System.exit(0);
		    }
		});
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		this.setResizable(false);
        this.setTitle("Rubrica XML Pezzotti - Crea Contatto");
		panel_Menu = new javax.swing.JPanel();
		label_Titolo = new javax.swing.JLabel();
		button_Home = new javax.swing.JButton();
		button_Crea_Contatto = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		text_Nome = new javax.swing.JTextField();
		text_eMail = new javax.swing.JTextField();
		text_Cognome = new javax.swing.JTextField();
		text_Tel = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		panel_Menu.setPreferredSize(new java.awt.Dimension(560, 560));

		label_Titolo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
		label_Titolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		label_Titolo.setText("Crea Contatto");
		label_Titolo.setToolTipText("");

		button_Home.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		button_Home.setText("Home");
		button_Home.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button_HomeActionPerformed(evt);
			}
		});

		button_Crea_Contatto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		button_Crea_Contatto.setText("Crea Contatto");
		button_Crea_Contatto.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button_Crea_ContattoActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		jLabel1.setText("Nome");

		jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		jLabel2.setText("Cognome");

		jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		jLabel3.setText("E-Mail");

		jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		jLabel4.setText("Telefono");

		javax.swing.GroupLayout panel_MenuLayout = new javax.swing.GroupLayout(panel_Menu);
		panel_Menu.setLayout(panel_MenuLayout);
		panel_MenuLayout.setHorizontalGroup(panel_MenuLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_MenuLayout.createSequentialGroup()
						.addGroup(panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(panel_MenuLayout.createSequentialGroup().addContainerGap(157, Short.MAX_VALUE)
										.addComponent(label_Titolo, javax.swing.GroupLayout.PREFERRED_SIZE, 263,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(8, 8, 8))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										panel_MenuLayout.createSequentialGroup().addContainerGap()
												.addGroup(panel_MenuLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(panel_MenuLayout.createSequentialGroup()
																.addComponent(button_Home,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 93,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(53, 53, 53)
																.addComponent(button_Crea_Contatto,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 238,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(30, 30, 30))
														.addGroup(panel_MenuLayout.createSequentialGroup()
																.addGroup(panel_MenuLayout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(jLabel1).addComponent(jLabel2)
																		.addComponent(jLabel3).addComponent(jLabel4))
																.addGap(54, 54, 54)
																.addGroup(panel_MenuLayout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false).addComponent(text_Nome)
																		.addComponent(text_Cognome)
																		.addComponent(text_eMail).addComponent(text_Tel,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				175, Short.MAX_VALUE))))
												.addGap(0, 0, Short.MAX_VALUE)))
						.addGap(132, 132, 132)));
		panel_MenuLayout.setVerticalGroup(panel_MenuLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(panel_MenuLayout.createSequentialGroup().addContainerGap()
						.addComponent(label_Titolo, javax.swing.GroupLayout.PREFERRED_SIZE, 84,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(panel_MenuLayout.createSequentialGroup().addGap(19, 19, 19)
										.addComponent(jLabel1))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										panel_MenuLayout.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(text_Nome, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(18, 18, 18)
						.addGroup(panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2)
								.addComponent(text_Cognome, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(text_eMail, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4).addComponent(text_Tel, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
						.addGroup(panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										panel_MenuLayout.createSequentialGroup().addComponent(button_Home)
												.addContainerGap())
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										panel_MenuLayout.createSequentialGroup()
												.addComponent(button_Crea_Contatto,
														javax.swing.GroupLayout.PREFERRED_SIZE, 66,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(41, 41, 41)))));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(panel_Menu,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				panel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void button_HomeActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
		g.getMenu().setVisible(true);
	}

	private void button_Crea_ContattoActionPerformed(java.awt.event.ActionEvent evt) {
		Boolean check;
		
		nome = text_Nome.getText();
		cognome = text_Cognome.getText();
		tel = text_Tel.getText();
		mail = text_eMail.getText();
		g.getWriter().writeRubrica(g.getI(),nome,cognome,tel,mail);
		//g.getWriter().writeRubrica(g.getI(), "Simone", "Luigi", "3668925557", "matpezzo01@gmail.com");
	}

	// Variables declaration
	private javax.swing.JButton button_Crea_Contatto;
	private javax.swing.JButton button_Home;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel label_Titolo;
	private javax.swing.JPanel panel_Menu;
	private javax.swing.JTextField text_Cognome;
	private javax.swing.JTextField text_Nome;
	private javax.swing.JTextField text_Tel;
	private javax.swing.JTextField text_eMail;
	// End of variables declaration
}
