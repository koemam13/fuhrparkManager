/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogWindows;

import data.Cost;
import javax.swing.JOptionPane;


/**
 *
 * @author imperatus
 */
public class EditCostDialog extends javax.swing.JDialog
{

  private String month;
  private double cost;
  private boolean OKPressed;


  /**
   * Creates new form CostDialog
   *
   * @param parent
   * @param modal
   */
  public EditCostDialog (java.awt.Frame parent, boolean modal)
  {
    super(parent, modal);
    initComponents();
  }


  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
   * content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {
    java.awt.GridBagConstraints gridBagConstraints;

    jPanel1 = new javax.swing.JPanel();
    jlMonth = new javax.swing.JLabel();
    jlCost = new javax.swing.JLabel();
    jtfMonth = new javax.swing.JTextField();
    jtfCost = new javax.swing.JTextField();
    jPanel2 = new javax.swing.JPanel();
    jPanel3 = new javax.swing.JPanel();
    jbOK = new javax.swing.JButton();
    jbCancel = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel1.setLayout(new java.awt.GridBagLayout());

    jlMonth.setText("Monat/Jahr");
    jPanel1.add(jlMonth, new java.awt.GridBagConstraints());

    jlCost.setText("Kosten");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    jPanel1.add(jlCost, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    jPanel1.add(jtfMonth, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    jPanel1.add(jtfCost, gridBagConstraints);

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

    jPanel3.setLayout(new java.awt.GridLayout(1, 0));

    jbOK.setText("ok");
    jbOK.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jbOKActionPerformed(evt);
      }
    });
    jPanel3.add(jbOK);

    jbCancel.setText("Abbrechen");
    jbCancel.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jbCancelActionPerformed(evt);
      }
    });
    jPanel3.add(jbCancel);

    jPanel2.add(jPanel3);

    getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jbOKActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbOKActionPerformed
  {//GEN-HEADEREND:event_jbOKActionPerformed
    month = jtfMonth.getText();
    String s = jtfCost.getText();
    if (month.isEmpty() || s.isEmpty())
    {
      JOptionPane.showMessageDialog(this, "Bitte Datum o. Kosten eingeben.", "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
    }
    try
    {
      cost = Double.parseDouble(s);
    }
    catch (NumberFormatException e)
    {
      JOptionPane.showMessageDialog(this, "Bitte eine Zahl eingeben", "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
    }

    OKPressed = true;
    dispose();
  }//GEN-LAST:event_jbOKActionPerformed

  private void jbCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbCancelActionPerformed
  {//GEN-HEADEREND:event_jbCancelActionPerformed
    OKPressed = false;
    dispose();
  }//GEN-LAST:event_jbCancelActionPerformed


  public Cost getCost ()
  {
    return new Cost(month, cost);
  }


  public boolean isOKPressed ()
  {
    return OKPressed;
  }


  public void setCost (Cost c)
  {
    jtfCost.setText(String.valueOf(c.getCost()));
    jtfMonth.setText(c.getDate());
  }


  /**
   * @param args the command line arguments
   */
  public static void main (String args[])
  {
    /*
     * Set the Nimbus look and feel
     */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /*
     * If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel. For details see
     * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try
    {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
      {
        if ("Nimbus".equals(info.getName()))
        {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    }
    catch (ClassNotFoundException ex)
    {
      java.util.logging.Logger.getLogger(EditCostDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(EditCostDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(EditCostDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(EditCostDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /*
     * Create and display the dialog
     */
    java.awt.EventQueue.invokeLater(() ->
    {
      EditCostDialog dialog = new EditCostDialog(new javax.swing.JFrame(), true);
      dialog.addWindowListener(new java.awt.event.WindowAdapter()
      {
        @Override
        public void windowClosing (java.awt.event.WindowEvent e)
        {
          System.exit(0);
        }
      });
      dialog.setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JButton jbCancel;
  private javax.swing.JButton jbOK;
  private javax.swing.JLabel jlCost;
  private javax.swing.JLabel jlMonth;
  private javax.swing.JTextField jtfCost;
  private javax.swing.JTextField jtfMonth;
  // End of variables declaration//GEN-END:variables

}
