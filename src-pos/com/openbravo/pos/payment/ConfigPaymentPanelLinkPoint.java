//    Wanda POS  - Africa's Gift to the World
//    Copyright (C) 2008-2009 Openbravo, S.L.
//    www.erp-university-africa.com
//
//    This file is part of Wanda POS
//
//    Wanda POS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//   Wanda POS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with Wanda POS.  If not, see <http://www.gnu.org/licenses/>.

package com.openbravo.pos.payment;

import com.openbravo.pos.forms.AppConfig;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.pos.util.AltEncrypter;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author  Mikel Irurita
 */
public class ConfigPaymentPanelLinkPoint extends javax.swing.JPanel implements PaymentConfiguration {

    private static File m_fCurrentDirectory = null;
        
    /** Creates new form ConfigPaymentPanelLinkPoint */
    public ConfigPaymentPanelLinkPoint() {
        initComponents();
    }
    
    /**
     *
     * @return
     */
    @Override
    public JPanel getComponent() {
        return this;
    }
    
    /**
     *
     * @param config
     */
    @Override
    public void loadProperties(AppConfig config) {
        String sCommerceID = config.getProperty("payment.commerceid");
        String sCertificatePass = config.getProperty("payment.certificatePassword");
        String sCertificatePath = config.getProperty("payment.certificatePath");
        
        if (sCommerceID!=null && sCertificatePath!=null && sCertificatePass!=null && sCertificatePass.startsWith("crypt:")) {
            jtxtStoreName.setText(config.getProperty("payment.commerceid"));
            AltEncrypter cypher = new AltEncrypter("cypherkey");
            jtxtCertificatePass.setText(cypher.decrypt(config.getProperty("payment.certificatePassword").substring(6)));
            jtxtCertificatePath.setText(config.getProperty("payment.certificatePath"));
        }
    }
    
    /**
     *
     * @param config
     */
    @Override
    public void saveProperties(AppConfig config) {
        AltEncrypter cypher = new AltEncrypter("cypherkey");      
        config.setProperty("payment.commerceid", comboValue(jtxtStoreName.getText()));
        config.setProperty("payment.certificatePath", comboValue(jtxtCertificatePath.getText()));
        config.setProperty("payment.certificatePassword", "crypt:" + cypher.encrypt(new String(jtxtCertificatePass.getPassword())));
    }
    
    private String comboValue(Object value) {
        return value == null ? "" : value.toString();
    }
    
    private static class ExtensionsFilter extends FileFilter {
        
        private final String message;
        private final String[] extensions;
        
        public ExtensionsFilter(String message, String... extensions) {
            this.message = message;
            this.extensions = extensions;            
        }
        
        @Override
        public boolean accept(File f) {
            if (f.isDirectory()) {
                return true;
            } else {
                String sFileName = f.getName();
                int ipos = sFileName.lastIndexOf('.');
                if (ipos >= 0) {
                    String sExt = sFileName.substring(ipos + 1);
                    for(String s : extensions) {
                        if (s.equalsIgnoreCase(sExt)) {
                            return true;
                        }
                    }
                }                        
                return false;
            }   
        }
        
        @Override
        public String getDescription() {
            return message;
        }      
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtStoreName = new javax.swing.JTextField();
        jtxtCertificatePass = new javax.swing.JPasswordField();
        jtxtCertificatePath = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(400, 116));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText(AppLocal.getIntString("label.storename")); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText(AppLocal.getIntString("label.certificatepwd")); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText(AppLocal.getIntString("label.certificatepath")); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 30));

        jtxtStoreName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtxtStoreName.setPreferredSize(new java.awt.Dimension(200, 30));

        jtxtCertificatePass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtxtCertificatePass.setPreferredSize(new java.awt.Dimension(200, 30));

        jtxtCertificatePath.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtxtCertificatePath.setPreferredSize(new java.awt.Dimension(300, 30));

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/fileopen.png"))); // NOI18N
        jButton1.setToolTipText("Open Folder");
        jButton1.setMaximumSize(new java.awt.Dimension(64, 40));
        jButton1.setMinimumSize(new java.awt.Dimension(64, 40));
        jButton1.setPreferredSize(new java.awt.Dimension(64, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtCertificatePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtStoreName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtCertificatePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtStoreName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtCertificatePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtCertificatePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    JFileChooser fc = new JFileChooser(m_fCurrentDirectory);
    fc.addChoosableFileFilter(new ExtensionsFilter("PKCS12 certificates", "p12"));
    
    if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fc.getSelectedFile();
        jtxtCertificatePath.setText(selectedFile.getAbsolutePath());
        m_fCurrentDirectory = fc.getCurrentDirectory();
    }
}//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jtxtCertificatePass;
    private javax.swing.JTextField jtxtCertificatePath;
    private javax.swing.JTextField jtxtStoreName;
    // End of variables declaration//GEN-END:variables

}