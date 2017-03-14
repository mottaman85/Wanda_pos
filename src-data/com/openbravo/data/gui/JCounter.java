//    Wanda POS - Africa's Gift to the World
//    Copyright (c) 2014-2015 IT-Kamer & previous Unicenta POS and Openbravo POS works
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

package com.openbravo.data.gui;

import javax.swing.*;
import com.openbravo.format.Formats;
import com.openbravo.data.user.BrowseListener;
import com.openbravo.data.user.BrowsableEditableData;
import com.openbravo.data.user.StateListener;

/**
 *
 * @author  adrianromero
 */
public class JCounter extends JPanel implements BrowseListener, StateListener  {
    
    /** Creates new form JCounter
     * @param bd */
    public JCounter(BrowsableEditableData bd) {
        initComponents();
        bd.addBrowseListener(this);
        bd.addStateListener(this);
    }
    
    /**
     *
     * @param iState
     */
    public void updateState(int iState) {
        if (iState == BrowsableEditableData.ST_INSERT) {
             // Insert
            jlblIndex.setText("*");
        }
    }  

    /**
     *
     * @param iIndex
     * @param iCounter
     */
    public void updateIndex(int iIndex, int iCounter) {

        if (iIndex >= 0 && iIndex < iCounter) {
            jlblIndex.setText(Formats.INT.formatValue(new Integer(iIndex + 1)));
        } else {
            jlblIndex.setText("-");
        }
        jlblCounter.setText(Formats.INT.formatValue(new Integer(iCounter)));
    }    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblIndex = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlblCounter = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(80, 20));
        setMinimumSize(new java.awt.Dimension(80, 20));
        setPreferredSize(new java.awt.Dimension(80, 20));

        jlblIndex.setText("XX");
        add(jlblIndex);

        jLabel2.setText("/");
        add(jLabel2);

        jlblCounter.setText("XX");
        add(jlblCounter);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlblCounter;
    private javax.swing.JLabel jlblIndex;
    // End of variables declaration//GEN-END:variables
    
}