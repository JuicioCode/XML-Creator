/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package def;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.xml.transform.TransformerException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;

/**
 *
 * @author 76184503
 */
public class GUI_Cerca_Contatto extends javax.swing.JFrame {

	private GestoreGUI g;
    /**
     * Creates new form GUI
     */
    public GUI_Cerca_Contatto(GestoreGUI g) {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Menu = new javax.swing.JPanel();
        label_Titolo = new javax.swing.JLabel();
        button_Home = new javax.swing.JButton();
        button_Crea_Contatto = new javax.swing.JButton();
        text_Nome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_Menu.setPreferredSize(new java.awt.Dimension(560, 560));
        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);
    	textArea.setEditable(false);

        label_Titolo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label_Titolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Titolo.setText("Cerca Contatto");
        label_Titolo.setToolTipText("");

        button_Home.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_Home.setText("Home");
        button_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_HomeActionPerformed(evt);
            }
        });

        button_Crea_Contatto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_Crea_Contatto.setText("Cerca Contatto");
        button_Crea_Contatto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Crea_ContattoActionPerformed(evt);
            }
        });

        text_Nome.setText("Inserisci una Parola...");
       
        javax.swing.GroupLayout panel_MenuLayout = new javax.swing.GroupLayout(panel_Menu);
        panel_MenuLayout.setHorizontalGroup(
        	panel_MenuLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panel_MenuLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panel_MenuLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(panel_MenuLayout.createSequentialGroup()
        					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        					.addContainerGap())
        				.addGroup(panel_MenuLayout.createSequentialGroup()
        					.addComponent(button_Home, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
        					.addGroup(panel_MenuLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(panel_MenuLayout.createSequentialGroup()
        							.addGap(69)
        							.addComponent(button_Crea_Contatto, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
        							.addContainerGap())
        						.addGroup(Alignment.TRAILING, panel_MenuLayout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
        							.addGroup(panel_MenuLayout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(text_Nome, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
        								.addComponent(label_Titolo, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE))
        							.addGap(140))))))
        );
        panel_MenuLayout.setVerticalGroup(
        	panel_MenuLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panel_MenuLayout.createSequentialGroup()
        			.addComponent(label_Titolo, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(text_Nome, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(panel_MenuLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(button_Home)
        				.addComponent(button_Crea_Contatto, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        panel_Menu.setLayout(panel_MenuLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        this.setResizable(false);
        this.setTitle("Rubrica XML Pezzotti - Cerca Contatto");
        pack();
    }

    private void button_HomeActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
		g.getMenu().setVisible(true);
    }

    private void button_Crea_ContattoActionPerformed(java.awt.event.ActionEvent evt) {
    	textArea.setText("");
    	String risString = g.getWriter().searchContact(text_Nome.getText());
    	if(risString.equals(""))
        textArea.setText("Nessun Risultato");
        else textArea.setText(risString);
    }

    // Variables declaration
    private javax.swing.JTextArea textArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton button_Crea_Contatto;
    private javax.swing.JButton button_Home;
    private javax.swing.JLabel label_Titolo;
    private javax.swing.JPanel panel_Menu;
    private javax.swing.JTextField text_Nome;
}
