/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package def;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.xml.transform.TransformerException;

/**
 *
 * @author 76184503
 */
public class GUI_Visualizza_Rubrica extends javax.swing.JFrame {

	private GestoreGUI g;
    /**
     * Creates new form GUI
     */
    public GUI_Visualizza_Rubrica(GestoreGUI g) {
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
        textarea_Rubrica.setEditable(false);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Menu = new javax.swing.JPanel();
        button_Home = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea_Rubrica = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_Menu.setPreferredSize(new java.awt.Dimension(560, 560));

        button_Home.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button_Home.setText("Home");
        button_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_HomeActionPerformed(evt);
            }
        });

        textarea_Rubrica.setColumns(20);
        textarea_Rubrica.setRows(5);
        jScrollPane1.setViewportView(textarea_Rubrica);

        javax.swing.GroupLayout panel_MenuLayout = new javax.swing.GroupLayout(panel_Menu);
        panel_Menu.setLayout(panel_MenuLayout);
        panel_MenuLayout.setHorizontalGroup(
            panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                    .addGroup(panel_MenuLayout.createSequentialGroup()
                        .addComponent(button_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_MenuLayout.setVerticalGroup(
            panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_Home)
                .addContainerGap())
        );

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
        this.setTitle("Rubrica XML Pezzotti - Visualizza Rubrica");
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_HomeActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
		g.getMenu().setVisible(true);
		
    }
    
    public javax.swing.JTextArea getArea() {
    	return textarea_Rubrica;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Home;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_Menu;
    private javax.swing.JTextArea textarea_Rubrica;
    // End of variables declaration//GEN-END:variables
}
