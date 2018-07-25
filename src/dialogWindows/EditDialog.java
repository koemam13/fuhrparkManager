/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dialogWindows;

import data.Car;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author imperatus
 */
public class EditDialog extends javax.swing.JDialog {
  
  private boolean PressedOK;
  private String name;
  private String id;
  private String kostenstelle;
  private int km;
  private String lInspection;
  private String nInspection;
  private String lService;
  private String nService;
  private String firstRegistration;
  private double cost;

  


  public String getFirstRegistration ()
  {
    return firstRegistration;
  }

    /** Creates new form AddDialog
   * @param parent
   * @param modal */
    public EditDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setLocationRelativeTo(parent);
        initComponents();      
    }



    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {
    java.awt.GridBagConstraints gridBagConstraints;

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jtfName = new javax.swing.JTextField();
    jtfID = new javax.swing.JTextField();
    jtfKostenstelle = new javax.swing.JTextField();
    jtfKM = new javax.swing.JTextField();
    jtfInspectionL = new javax.swing.JTextField();
    jtfInspectionN = new javax.swing.JTextField();
    jtfServiceL = new javax.swing.JTextField();
    jtfServiceN = new javax.swing.JTextField();
    jLabel9 = new javax.swing.JLabel();
    jtfFirstRegistration = new javax.swing.JTextField();
    jPanel2 = new javax.swing.JPanel();
    jPanel3 = new javax.swing.JPanel();
    jbAdd = new javax.swing.JButton();
    jPanel4 = new javax.swing.JPanel();
    jbDel = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel1.setLayout(new java.awt.GridBagLayout());

    jLabel1.setText("Fahrzeugname");
    jPanel1.add(jLabel1, new java.awt.GridBagConstraints());

    jLabel2.setText("Kennzeichen");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    jPanel1.add(jLabel2, gridBagConstraints);

    jLabel3.setText("Kostenstelle");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    jPanel1.add(jLabel3, gridBagConstraints);

    jLabel4.setText("Kilometerstand");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    jPanel1.add(jLabel4, gridBagConstraints);

    jLabel5.setText("Letzte §57a Begutachtung");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 5;
    jPanel1.add(jLabel5, gridBagConstraints);

    jLabel6.setText("Nächste §57a Begutachtung");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    jPanel1.add(jLabel6, gridBagConstraints);

    jLabel7.setText("Letzter Service");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 7;
    jPanel1.add(jLabel7, gridBagConstraints);

    jLabel8.setText("Nächster Service");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    jPanel1.add(jLabel8, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    jPanel1.add(jtfName, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    jPanel1.add(jtfID, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    jPanel1.add(jtfKostenstelle, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    jPanel1.add(jtfKM, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    jPanel1.add(jtfInspectionL, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    jPanel1.add(jtfInspectionN, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 7;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    jPanel1.add(jtfServiceL, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    jPanel1.add(jtfServiceN, gridBagConstraints);

    jLabel9.setText("Erst Zulassung");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    jPanel1.add(jLabel9, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    jPanel1.add(jtfFirstRegistration, gridBagConstraints);

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

    jPanel2.setLayout(new java.awt.GridLayout(1, 0));

    jbAdd.setText("Bestätigen");
    jbAdd.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jbAddActionPerformed(evt);
      }
    });
    jPanel3.add(jbAdd);

    jPanel2.add(jPanel3);

    jbDel.setText("Abbrechen");
    jbDel.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jbDelActionPerformed(evt);
      }
    });
    jPanel4.add(jbDel);

    jPanel2.add(jPanel4);

    getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

    pack();
  }// </editor-fold>//GEN-END:initComponents
  
  
  
  private void jbAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbAddActionPerformed
  {//GEN-HEADEREND:event_jbAddActionPerformed
    try
    {
      name=jtfName.getText();
      id=jtfID.getText();
      kostenstelle=jtfKostenstelle.getText();
      km= new Scanner(jtfKM.getText()).nextInt();
      lInspection=jtfInspectionL.getText();
      nInspection=jtfInspectionN.getText();
      lService=jtfServiceL.getText();
      nService=jtfServiceN.getText();
      firstRegistration=jtfFirstRegistration.getText();
      
      PressedOK = true;
      dispose();
    }
    catch (Exception ex)
    {
      JOptionPane.showMessageDialog(
        this,
        ex.getMessage(),
        "Fehler...",
        JOptionPane.ERROR_MESSAGE
      );
    }
  }//GEN-LAST:event_jbAddActionPerformed

  private void jbDelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbDelActionPerformed
  {//GEN-HEADEREND:event_jbDelActionPerformed
      PressedOK = false;
      dispose();
  }//GEN-LAST:event_jbDelActionPerformed

  public void setTF(Car c)
  {
    jtfName.setText(c.getName());
    jtfID.setText(c.getId());
    jtfFirstRegistration.setText(c.getFirstRegistration());
    jtfInspectionL.setText(c.getLastInspection());
    jtfInspectionN.setText(c.getNextInspection());
    jtfKM.setText(String.valueOf(c.getKm()));
    jtfKostenstelle.setText(c.getKostenstelle());
    jtfServiceL.setText(c.getLastService());
    jtfServiceN.setText(c.getNextService());
    cost = c.getCost();
    
  }
  
  public Car getCar()
  {
    return new Car(name, id, kostenstelle, km, firstRegistration, lInspection, nInspection, lService, nService, cost);
  }

  public boolean isPressedOK ()
  {
    return PressedOK;
  }


  @Override
  public String getName ()
  {
    return name;
  }


  public String getId ()
  {
    return id;
  }


  public String getKostenstelle ()
  {
    return kostenstelle;
  }


  public int getKm ()
  {
    return km;
  }


  public String getlInspection ()
  {
    return lInspection;
  }


  public String getnInspection ()
  {
    return nInspection;
  }


  public String getlService ()
  {
    return lService;
  }


  public String getnService ()
  {
    return nService;
  }

  
  
  
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() ->
        {
          EditDialog dialog = new EditDialog(new javax.swing.JFrame(), true);
          dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
              System.exit(0);
            }
          });
          dialog.setVisible(true);
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JButton jbAdd;
  private javax.swing.JButton jbDel;
  private javax.swing.JTextField jtfFirstRegistration;
  private javax.swing.JTextField jtfID;
  private javax.swing.JTextField jtfInspectionL;
  private javax.swing.JTextField jtfInspectionN;
  private javax.swing.JTextField jtfKM;
  private javax.swing.JTextField jtfKostenstelle;
  private javax.swing.JTextField jtfName;
  private javax.swing.JTextField jtfServiceL;
  private javax.swing.JTextField jtfServiceN;
  // End of variables declaration//GEN-END:variables

}
