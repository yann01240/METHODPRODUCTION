/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packVue;

import java.io.File;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import methodproduction.ChampionsLeague;
import methodproduction.Competition;
import methodproduction.CoupeDeLaLigue;
import methodproduction.CoupeNational;
import methodproduction.Division1;
import methodproduction.Division2;
import methodproduction.EuropaLeague;
import methodproduction.Saison;
import packModele.ConnexionBD;

/**
 *
 * @author Aurèle
 */
public class MaFenetre extends javax.swing.JFrame {

    /**
     * Creates new form MaFenetre
     */
    Saison saison;

    Vector<String> list = new Vector();

    /**
     *
     */
    public MaFenetre() {
        initComponents();
        saison = new Saison();
        try {
            Statement st = ConnexionBD.getConnexion().createStatement();
            ResultSet rs = st.executeQuery("select `nom_pays` from `equipe` group by `nom_pays` order by 1;");
            while (rs.next()) {
                list.add(rs.getString("nom_pays"));
            }
        } catch (Exception ex) {
        }
        jComboBox1.setEnabled(false);
        jComboBox3.setEnabled(false);
        jComboBox1.setSelectedIndex(-1);
        StyledDocument doc = jTextPane1.getStyledDocument();
        MutableAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, 0, center, true);
        Montrer("logo.png");
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        label = new java.awt.Label();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jComboBox3 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Football Championship 2015");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Résultats"));

        jTextPane1.setEditable(false);
        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jButton1.setText("Lancer la saison");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        label.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label.setForeground(new java.awt.Color(51, 51, 51));
        label.setText("Selectionner votre pays");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(list));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jPanel3.setMaximumSize(new java.awt.Dimension(396, 207));
        jPanel3.setMinimumSize(new java.awt.Dimension(396, 207));
        jPanel3.setPreferredSize(new java.awt.Dimension(396, 207));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 207, Short.MAX_VALUE)
        );

        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setForeground(new java.awt.Color(51, 51, 51));
        label1.setText("Selectionner votre compétition");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Champions League", "Europa League", "Division 1", "Division 2", "Coupe de la Ligue", "Coupe Nationale" }));
        jComboBox3.setSelectedIndex(-1);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox3, 0, 150, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1)
                            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 113, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        test();
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jComboBox1.setEnabled(false);
        jComboBox3.setEnabled(false);

        jComboBox1.setSelectedIndex(-1);

        jComboBox3.setSelectedIndex(-1);
        saison.getCompetitions().clear();

        try {
            Statement st = ConnexionBD.getConnexion().createStatement();
            ResultSet rs = st.executeQuery("select `nom_pays` from `equipe` group by `nom_pays` order by 1;");
            while (rs.next()) {
                try {
                    saison.addCompetition(new Division1(rs.getString("nom_pays")));
                    saison.getCompetitions().get(saison.getCompetitions().size() - 1).simulation();
                } catch (Exception e) {
                    saison.removeCompetition(saison.getCompetitions().get(saison.getCompetitions().size() - 1));
                }
                try {
                    saison.addCompetition(new Division2(rs.getString("nom_pays")));
                    saison.getCompetitions().get(saison.getCompetitions().size() - 1).simulation();
                } catch (Exception e) {
                    saison.removeCompetition(saison.getCompetitions().get(saison.getCompetitions().size() - 1));
                }
                try {
                    saison.addCompetition(new CoupeDeLaLigue(rs.getString("nom_pays")));
                    saison.getCompetitions().get(saison.getCompetitions().size() - 1).simulation();
                } catch (Exception e) {
                    saison.removeCompetition(saison.getCompetitions().get(saison.getCompetitions().size() - 1));
                }
                try {
                    saison.addCompetition(new CoupeNational(rs.getString("nom_pays")));
                    saison.getCompetitions().get(saison.getCompetitions().size() - 1).simulation();
                } catch (Exception e) {
                    saison.removeCompetition(saison.getCompetitions().get(saison.getCompetitions().size() - 1));
                }
            }
            saison.addCompetition(new EuropaLeague());
            saison.addCompetition(new ChampionsLeague());
            for (Competition competition : saison.getCompetitions()) {
                try {
                    saison.getCompetitions().get(saison.getCompetitions().size() - 1).addAllEquipes(competition.selectionChampions());
                    saison.getCompetitions().get(saison.getCompetitions().size() - 2).addAllEquipes(competition.selectionEuropa());
                } catch (Exception e) {
                }
            }
            saison.getCompetitions().get(saison.getCompetitions().size() - 2).simulation();
            saison.getCompetitions().get(saison.getCompetitions().size() - 1).simulation();
        } catch (Exception ex) {
        }
        jComboBox1.setEnabled(false);
        jComboBox3.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        test();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void test(){
        if (jComboBox3.getSelectedIndex() < 2 && jComboBox3.getSelectedIndex() >= 0) {
            jComboBox1.setEnabled(false);
            jComboBox1.setSelectedIndex(-1);
            jTextPane1.setText(saison.getCompetitions().get(saison.getCompetitions().size() - 1 - jComboBox3.getSelectedIndex()).toString());
        } else if (jComboBox3.getSelectedIndex() < 0) {
            jTextPane1.setText("");
        } else if (jComboBox3.getSelectedIndex() >= 2 && jComboBox3.getSelectedIndex() < 6 && jComboBox1.getSelectedIndex() < 0) {
            jTextPane1.setText("");
            jComboBox1.setEnabled(true);
        } else if (jComboBox3.getSelectedIndex() >= 2 && jComboBox3.getSelectedIndex() < 6 && jComboBox1.getSelectedIndex() >= 0) {

            switch (jComboBox3.getSelectedIndex()) {
                case 2:
                    for (int i = 0; i < saison.getCompetitions().size(); i++) {
                        if (saison.getCompetitions().get(i) instanceof Division1 && saison.getCompetitions().get(i).getPays().equals(list.get(jComboBox1.getSelectedIndex()))) {
                            jTextPane1.setText(saison.getCompetitions().get(i).toString());
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < saison.getCompetitions().size(); i++) {
                        if (saison.getCompetitions().get(i) instanceof Division2 && saison.getCompetitions().get(i).getPays().equals(list.get(jComboBox1.getSelectedIndex()))) {
                            jTextPane1.setText(saison.getCompetitions().get(i).toString());
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < saison.getCompetitions().size(); i++) {
                            if (saison.getCompetitions().get(i) instanceof CoupeDeLaLigue && saison.getCompetitions().get(i).getPays().equals(list.get(jComboBox1.getSelectedIndex()))) {
                                jTextPane1.setText(saison.getCompetitions().get(i).toString());
                            }
                    }
                    break;
                case 5:
                    for (int i = 0; i < saison.getCompetitions().size(); i++) {
                        if (saison.getCompetitions().get(i) instanceof CoupeNational && saison.getCompetitions().get(i).getPays().equals(list.get(jComboBox1.getSelectedIndex()))) {
                            jTextPane1.setText(saison.getCompetitions().get(i).toString());
                        }
                    }
                    break;
            }
        }
    }
    private void Montrer(String chemin) {
        jPanel3.removeAll();
        File file = new File(chemin);
        ImagePanel p = new ImagePanel(file);
        p.setSize(p.getWidth(), p.getHeight());
        jPanel3.setSize(p.getWidth(), p.getHeight());
        jPanel3.add(p);
        jPanel3.repaint(10);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private java.awt.Label label;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
