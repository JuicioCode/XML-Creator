package def;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.xml.transform.TransformerException;

public class GUI_Menu extends javax.swing.JFrame {
	private GestoreGUI g;

	public GUI_Menu(GestoreGUI g) {
		this.g = g;
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
        this.setTitle("Rubrica XML Pezzotti - Menu");
		panel_Menu = new javax.swing.JPanel();
		label_Titolo = new javax.swing.JLabel();
		button_Crea_Contatto = new javax.swing.JButton();
		button_Visualizza_Rubrica1 = new javax.swing.JButton();
		button_Elimina_Contatto = new javax.swing.JButton();
		button_Ricerca_Contatto1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		panel_Menu.setPreferredSize(new java.awt.Dimension(560, 560));

		label_Titolo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
		label_Titolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		label_Titolo.setText("Rubrica XML");
		label_Titolo.setToolTipText("");

		button_Crea_Contatto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		button_Crea_Contatto.setText("Crea Contatto");
		button_Crea_Contatto.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					button_Crea_ContattoActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		button_Visualizza_Rubrica1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		button_Visualizza_Rubrica1.setText("Visualizza Rubrica");
		button_Visualizza_Rubrica1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					button_Visualizza_Rubrica1ActionPerformed(evt);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		button_Elimina_Contatto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		button_Elimina_Contatto.setText("Elimina Contatto");
		button_Elimina_Contatto.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					button_Elimina_ContattoActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		button_Ricerca_Contatto1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		button_Ricerca_Contatto1.setText("Cerca Contatto");
		button_Ricerca_Contatto1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					button_Ricerca_Contatto1ActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		javax.swing.GroupLayout panel_MenuLayout = new javax.swing.GroupLayout(panel_Menu);
		panel_Menu.setLayout(panel_MenuLayout);
		panel_MenuLayout.setHorizontalGroup(
				panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								panel_MenuLayout
										.createSequentialGroup()
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(
												label_Titolo, javax.swing.GroupLayout.PREFERRED_SIZE, 238,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(154, 154, 154))
						.addGroup(panel_MenuLayout.createSequentialGroup().addGap(159, 159, 159)
								.addGroup(panel_MenuLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(button_Visualizza_Rubrica1,
												javax.swing.GroupLayout.PREFERRED_SIZE, 238,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(button_Crea_Contatto, javax.swing.GroupLayout.PREFERRED_SIZE, 238,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(button_Ricerca_Contatto1, javax.swing.GroupLayout.PREFERRED_SIZE,
												238, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(button_Elimina_Contatto, javax.swing.GroupLayout.PREFERRED_SIZE,
												238, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(163, Short.MAX_VALUE)));
		panel_MenuLayout
				.setVerticalGroup(panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(panel_MenuLayout.createSequentialGroup().addGap(18, 18, 18)
								.addComponent(label_Titolo, javax.swing.GroupLayout.PREFERRED_SIZE, 84,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(button_Visualizza_Rubrica1, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(button_Crea_Contatto, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(button_Ricerca_Contatto1, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(button_Elimina_Contatto, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(19, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(panel_Menu,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				panel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void button_Crea_ContattoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		this.setVisible(false);
		g.getCrea_Contatto().setVisible(true);
	}

	private void button_Visualizza_Rubrica1ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
    	this.setVisible(false);
    	String string = g.getWriter().printRubrica();
    	if(string != null && string != "")
    	g.getVisualizza_Rubrica().getArea().setText(string);
    	else
    		g.getVisualizza_Rubrica().getArea().setText("La Rubrica è vuota, aggiungi dei contatti!");
        g.getVisualizza_Rubrica().setVisible(true);
	}

	private void button_Elimina_ContattoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		this.setVisible(false);
		g.getElimina_Contatto().setVisible(true);
	}

	private void button_Ricerca_Contatto1ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		this.setVisible(false);
		g.getCerca_Contatto().setVisible(true);
	}
	
	
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton button_Crea_Contatto;
	private javax.swing.JButton button_Elimina_Contatto;
	private javax.swing.JButton button_Ricerca_Contatto1;
	private javax.swing.JButton button_Visualizza_Rubrica1;
	private javax.swing.JLabel label_Titolo;
	private javax.swing.JPanel panel_Menu;
	// End of variables declaration//GEN-END:variables
}
