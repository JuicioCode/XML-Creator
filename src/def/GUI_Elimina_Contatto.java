package def;

public class GUI_Elimina_Contatto extends javax.swing.JFrame {

	private GestoreGUI g;

	public GUI_Elimina_Contatto(GestoreGUI g) {
		this.g = g;
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		this.setResizable(false);
        this.setTitle("Rubrica XML Pezzotti - Elimina Contatto");
		panel_Menu = new javax.swing.JPanel();
		label_no = new javax.swing.JLabel();
		button_Home = new javax.swing.JButton();
		button_Elimina_Contatto = new javax.swing.JButton();
		text_Nome = new javax.swing.JTextField();
		label_Titolo1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		panel_Menu.setPreferredSize(new java.awt.Dimension(560, 560));

		label_no.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
		label_no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		label_no.setText("Inserisci ID Contatto");
		label_no.setToolTipText("");

		button_Home.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		button_Home.setText("Home");
		button_Home.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button_HomeActionPerformed(evt);
			}
		});

		button_Elimina_Contatto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		button_Elimina_Contatto.setText("Elimina Contatto");
		button_Elimina_Contatto.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button_Crea_ContattoActionPerformed(evt);
			}
		});

		text_Nome.setText("Inserisci ID CONTATTO");

		label_Titolo1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
		label_Titolo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		label_Titolo1.setText("Elimina Contatto");
		label_Titolo1.setToolTipText("");

		javax.swing.GroupLayout panel_MenuLayout = new javax.swing.GroupLayout(panel_Menu);
		panel_Menu.setLayout(panel_MenuLayout);
		panel_MenuLayout.setHorizontalGroup(panel_MenuLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(panel_MenuLayout.createSequentialGroup().addContainerGap().addGroup(panel_MenuLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(panel_MenuLayout.createSequentialGroup()
								.addComponent(button_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 93,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								panel_MenuLayout.createSequentialGroup().addGap(0, 130, Short.MAX_VALUE)
										.addGroup(panel_MenuLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(text_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(panel_MenuLayout.createSequentialGroup().addGap(31, 31, 31)
														.addComponent(button_Elimina_Contatto,
																javax.swing.GroupLayout.PREFERRED_SIZE, 238,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(155, 155, 155))))))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						panel_MenuLayout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label_no).addGap(204, 204, 204))
				.addGroup(
						panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										panel_MenuLayout.createSequentialGroup().addContainerGap(146, Short.MAX_VALUE)
												.addComponent(label_Titolo1, javax.swing.GroupLayout.PREFERRED_SIZE,
														300, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(114, 114, 114))));
		panel_MenuLayout
				.setVerticalGroup(panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(panel_MenuLayout.createSequentialGroup().addContainerGap(114, Short.MAX_VALUE)
								.addComponent(label_no, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(text_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(56, 56, 56)
								.addComponent(button_Elimina_Contatto, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(32, 32, 32).addComponent(button_Home).addContainerGap())
						.addGroup(panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(panel_MenuLayout.createSequentialGroup().addGap(16, 16, 16)
										.addComponent(label_Titolo1, javax.swing.GroupLayout.PREFERRED_SIZE, 84,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(309, Short.MAX_VALUE))));

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
		if (text_Nome.getText().contains("wipe")) {
			g.getWriter().wipe();
		} else {
			try {
				g.getWriter().deleteElement(text_Nome.getText());
			} catch (Exception e) {
				System.out.println("Non Esiste");
			}
		}

	}

	// Variables declaration
	private javax.swing.JButton button_Elimina_Contatto;
	private javax.swing.JButton button_Home;
	private javax.swing.JLabel label_Titolo1;
	private javax.swing.JLabel label_no;
	private javax.swing.JPanel panel_Menu;
	private javax.swing.JTextField text_Nome;
	// End of variables declaration
}
