/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

/**
 *
 * @author patri
 */
public class Autorizacija extends javax.swing.JFrame {
    /**
     * Creates new form Autorizacija
     */
    public Autorizacija() {
        initComponents();
    
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
        jLabel2 = new javax.swing.JLabel();
        txtLozinka = new javax.swing.JPasswordField();
        txtEmail = new javax.swing.JTextField();
        buttonPrijava = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setType(java.awt.Window.Type.UTILITY);

        jLabel1.setText("Email");

        jLabel2.setText("Lozinka");

        txtLozinka.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLozinkaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLozinkaFocusLost(evt);
            }
        });
        txtLozinka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLozinkaKeyPressed(evt);
            }
        });

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        buttonPrijava.setText("Prijava");
        buttonPrijava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrijavaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(txtLozinka, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(buttonPrijava, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(buttonPrijava, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPrijavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrijavaActionPerformed
        autorizacija();
    }//GEN-LAST:event_buttonPrijavaActionPerformed

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        txtEmail.setBackground(Color.GRAY);
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        txtEmail.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtLozinkaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLozinkaFocusGained
        txtLozinka.setBackground(Color.GRAY);
    }//GEN-LAST:event_txtLozinkaFocusGained

    private void txtLozinkaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLozinkaFocusLost
        txtLozinka.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtLozinkaFocusLost

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if(txtEmail.getText().trim().isEmpty()){
            return;
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtLozinka.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtLozinkaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLozinkaKeyPressed
        if(txtEmail.getText().trim().isEmpty()){
            txtEmail.requestFocus();
            return;
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            autorizacija();
        }
        
    }//GEN-LAST:event_txtLozinkaKeyPressed

    private void autorizacija(){
        if(txtEmail.getText().trim().isEmpty()){
            txtEmail.requestFocus();
            return;
        }
        if(txtLozinka.getPassword().length==0){
            txtLozinka.requestFocus();
            return;
        }
        try {
            InternetAddress emailAddr = new InternetAddress(txtEmail.getText());
            emailAddr.validate();
        } catch (AddressException e) {
            txtEmail.requestFocus();
            return;
        }
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPrijava;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtLozinka;
    // End of variables declaration//GEN-END:variables
}
