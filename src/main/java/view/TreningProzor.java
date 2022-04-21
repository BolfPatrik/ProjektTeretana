/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import controller.ObradaPolaznik;
import controller.ObradaTrener;
import controller.ObradaTrening;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Polaznik;
import model.Trener;
import model.Trening;
import util.EdunovaException;
import util.EdunovaUtil;

/**
 *
 * @author patri
 */
public class TreningProzor extends javax.swing.JFrame {
    private ObradaTrening obrada;
    /**
     * Creates new form TreningProzor
     */
    public TreningProzor() {
        initComponents();
        obrada = new ObradaTrening();
        setTitle(EdunovaUtil.getNaslov("Treninzi"));
        ucitaj();
        ucitajPolaznike();
        ucitajTrenere();
        DatePickerSettings dps = new DatePickerSettings(new Locale("hr", "HR"));
        dps.setFormatForDatesCommonEra("dd.MM.yyyy");
    }

    private void ucitaj(){
         DefaultListModel<Trening> m = new DefaultListModel<>();
        List<Trening> entiteti = obrada.read();

        for (Trening s : entiteti) {
            m.addElement(s);
        }
        lstEntiteti.setModel(m);
    }
  private void ucitajPolaznike() {
        DefaultComboBoxModel<Polaznik> ms = new DefaultComboBoxModel<>();
        Polaznik polaznik = new Polaznik();
        polaznik.setSifra(Long.valueOf(0));
        polaznik.setIme("Nije odabrano");
        polaznik.setPrezime("Nije odabrano");
        ms.addElement(polaznik);
        new ObradaPolaznik().read().forEach(s -> {
            ms.addElement(s);
        });
        cmbPolaznici.setModel(ms);
    }

    private void ucitajTrenere() {
        DefaultComboBoxModel<Trener> ms = new DefaultComboBoxModel<>();
        Trener trener = new Trener();
        trener.setSifra(Long.valueOf(0));
        trener.setIme("Nije odabrano");
        trener.setPrezime("Nije odabrano");
        ms.addElement(trener);
        new ObradaTrener().read().forEach(s -> {
            ms.addElement(s);
        });
        cmbTreneri.setModel(ms);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPolazniciNaTreningu = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        cmbPolaznici = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbTreneri = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dpDatumPocetka = new com.github.lgooddatepicker.components.DatePicker();
        btnKreiraj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Naziv");

        jLabel5.setText("Polaznici");

        jScrollPane2.setViewportView(lstPolazniciNaTreningu);

        jLabel7.setText("Traži po imenu, prezimenu ili OIB-u");
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N

        btnTrazi.setText("Traži");

        lstEntiteti.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstEntiteti);

        jLabel2.setText("Trener");

        cmbTreneri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTreneriActionPerformed(evt);
            }
        });

        jLabel3.setText("Polaznik");

        jLabel4.setText("Datum početka");

        btnKreiraj.setText("Kreiraj");
        btnKreiraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKreirajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNaziv)
                        .addComponent(cmbTreneri, 0, 244, Short.MAX_VALUE)
                        .addComponent(cmbPolaznici, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(dpDatumPocetka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnKreiraj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPromjeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnObrisi)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cmbTreneri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbPolaznici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpDatumPocetka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnKreiraj)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTrazi))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
        if (evt.getValueIsAdjusting() || lstEntiteti.getSelectedValue() == null) {
            return;
        }
        obrada.setEntitet(lstEntiteti.getSelectedValue());
        var e = obrada.getEntitet();
        txtNaziv.setText(e.getNaziv());

        if (e.getTrener() == null) {
            cmbTreneri.setSelectedIndex(0);
        } else {
            cmbTreneri.setSelectedItem(e.getTrener());
        }

        if (e.getPolaznik()== null) {
            cmbPolaznici.setSelectedIndex(0);
        } else {
            cmbPolaznici.setSelectedItem(e.getPolaznik());
        }

        if (e.getDatumpocetka()!= null) {
            dpDatumPocetka.setDate(e.getDatumpocetka().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        } else {
            dpDatumPocetka.setDate(null);
        }

    }//GEN-LAST:event_lstEntitetiValueChanged

    private void cmbTreneriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTreneriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTreneriActionPerformed

    private void btnKreirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKreirajActionPerformed
        try {
            if(obrada.getEntitet()==null){
                obrada.setEntitet(new Trening());
            }
            preuzmiVrijednosti();
            obrada.create();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnKreirajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed

        if (obrada.getEntitet() == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite stavku");
            return;
        }
        preuzmiVrijednosti();

        try {
            obrada.update();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed

        if (obrada.getEntitet() == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite stavku");
            return;
        }

        if (JOptionPane.showConfirmDialog(
            getRootPane(),
            "Sigurno obrisati \"" + obrada.getEntitet().getNaziv() + "\"?",
            "Brisanje",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION) {
        return;
        }

        try {
            obrada.delete();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnObrisiActionPerformed
private void preuzmiVrijednosti() {
        var e = obrada.getEntitet();
        e.setNaziv(txtNaziv.getText());
        e.setTrener((Trener) cmbTreneri.getSelectedItem());
        e.setPolaznik((Polaznik) cmbPolaznici.getSelectedItem());
        if(dpDatumPocetka.getDate()!=null){
             e.setDatumpocetka(
                Date.from(
                        dpDatumPocetka.getDate().atStartOfDay().atZone(
                                ZoneId.systemDefault()
                        ).toInstant()
                )
        );
        }else{
            e.setDatumpocetka(null);
        }
}
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKreiraj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JComboBox<Polaznik> cmbPolaznici;
    private javax.swing.JComboBox<Trener> cmbTreneri;
    private com.github.lgooddatepicker.components.DatePicker dpDatumPocetka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<Trening> lstEntiteti;
    private javax.swing.JList<String> lstPolazniciNaTreningu;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables
}
