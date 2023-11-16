/**
 * Copyright (C) 2011-2015 The XDocReport Team <xdocreport@googlegroups.com>
 *
 * All rights reserved.
 *
 * Permission is hereby granted, free  of charge, to any person obtaining
 * a  copy  of this  software  and  associated  documentation files  (the
 * "Software"), to  deal in  the Software without  restriction, including
 * without limitation  the rights to  use, copy, modify,  merge, publish,
 * distribute,  sublicense, and/or sell  copies of  the Software,  and to
 * permit persons to whom the Software  is furnished to do so, subject to
 * the following conditions:
 *
 * The  above  copyright  notice  and  this permission  notice  shall  be
 * included in all copies or substantial portions of the Software.
 *
 * THE  SOFTWARE IS  PROVIDED  "AS  IS", WITHOUT  WARRANTY  OF ANY  KIND,
 * EXPRESS OR  IMPLIED, INCLUDING  BUT NOT LIMITED  TO THE  WARRANTIES OF
 * MERCHANTABILITY,    FITNESS    FOR    A   PARTICULAR    PURPOSE    AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE,  ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SettingsDialog.java
 *
 * Created on 9 f�vr. 2012, 16:19:52
 */

package fr.opensagres.xdocreport.gui;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author pascalleclercq
 */
public class SettingsDialog extends javax.swing.JDialog {

    /** Creates new form SettingsDialog */
    public SettingsDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        fieldsXmlFolderChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    }
    JFileChooser fieldsXmlFolderChooser = new JFileChooser();
    private File fieldsXmlFolder;
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldsXmlPanel = new javax.swing.JPanel();
        fieldsXmlLbl = new javax.swing.JLabel();
        fieldsXmlTxt = new javax.swing.JTextField();
        fieldsXmlBrowseBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        shellLbl = new javax.swing.JLabel();
        shellTxt = new javax.swing.JTextField();
        shellBrowseBtn = new javax.swing.JButton();
        cancenBtn = new javax.swing.JButton();
        okBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 300, 200));
        getContentPane().setLayout(null);

        fieldsXmlPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fieldsXmlPanel.setPreferredSize(new java.awt.Dimension(300, 110));
        fieldsXmlPanel.setLayout(null);

        fieldsXmlLbl.setText("Directory (*.fields.xml)");
        fieldsXmlLbl.setPreferredSize(new java.awt.Dimension(150, 16));
        fieldsXmlPanel.add(fieldsXmlLbl);
        fieldsXmlLbl.setBounds(10, 20, 150, 16);
        fieldsXmlPanel.add(fieldsXmlTxt);
        fieldsXmlTxt.setBounds(160, 10, 290, 28);

        fieldsXmlBrowseBtn.setText("Browse...");
        fieldsXmlBrowseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldsXmlBrowseBtnActionPerformed(evt);
            }
        });
        fieldsXmlPanel.add(fieldsXmlBrowseBtn);
        fieldsXmlBrowseBtn.setBounds(460, 10, 100, 29);

        getContentPane().add(fieldsXmlPanel);
        fieldsXmlPanel.setBounds(0, 60, 560, 50);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 110));
        jPanel1.setLayout(null);

        shellLbl.setText("File (xdrtools.bat)");
        shellLbl.setPreferredSize(new java.awt.Dimension(150, 16));
        jPanel1.add(shellLbl);
        shellLbl.setBounds(10, 20, 150, 16);
        jPanel1.add(shellTxt);
        shellTxt.setBounds(150, 10, 300, 28);

        shellBrowseBtn.setText("Browse...");
        shellBrowseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shellBrowseBtnActionPerformed(evt);
            }
        });
        jPanel1.add(shellBrowseBtn);
        shellBrowseBtn.setBounds(460, 10, 100, 29);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 560, 60);

        cancenBtn.setText("Cancel");
        cancenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancenBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancenBtn);
        cancenBtn.setBounds(460, 120, 86, 29);

        okBtn.setText("Ok");
        getContentPane().add(okBtn);
        okBtn.setBounds(380, 120, 75, 29);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldsXmlBrowseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldsXmlBrowseBtnActionPerformed
 
    int result = fieldsXmlFolderChooser.showOpenDialog(null);

    System.out.println("result "+result);
     
     fieldsXmlFolder=fieldsXmlFolderChooser.getSelectedFile();
     
     fieldsXmlTxt.setText(fieldsXmlFolder.getPath());


}//GEN-LAST:event_fieldsXmlBrowseBtnActionPerformed

    private void shellBrowseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shellBrowseBtnActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_shellBrowseBtnActionPerformed

    private void cancenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancenBtnActionPerformed
        setVisible(false);
}//GEN-LAST:event_cancenBtnActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SettingsDialog dialog = new SettingsDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancenBtn;
    private javax.swing.JButton fieldsXmlBrowseBtn;
    private javax.swing.JLabel fieldsXmlLbl;
    private javax.swing.JPanel fieldsXmlPanel;
    private javax.swing.JTextField fieldsXmlTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton okBtn;
    private javax.swing.JButton shellBrowseBtn;
    private javax.swing.JLabel shellLbl;
    private javax.swing.JTextField shellTxt;
    // End of variables declaration//GEN-END:variables

}
