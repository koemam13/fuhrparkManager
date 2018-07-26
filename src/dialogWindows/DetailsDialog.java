package dialogWindows;


import data.Car;
import data.Cost;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import tableModel.CostTableModel;


/*
 * To change this license header, choose License Headers in Project Properties. To change this template file, choose
 * Tools | Templates and open the template in the editor.
 */
/**
 *
 * @author imperatus
 */
public class DetailsDialog extends javax.swing.JDialog
{

  CostTableModel model = new CostTableModel();

  private static File f;
  private String name;
  private String id;
  private String kostenstelle;
  private int km;
  private String firstRegistration;
  private String lastInspection;
  private String nextInspection;
  private String lastService;
  private String nextService;
  private double allTimeCost;
  private String tireDims;
  private String summer;
  private String winter;
  private String repairs;
  private int kmbr;
  private boolean pressedOK;


  /**
   * Creates new form DetailsDialog
   * @param parent
   * @param modal
   */
  public DetailsDialog (java.awt.Frame parent, boolean modal)
  {
    super(parent, modal);
    initComponents();
    jtCost.setModel(model);
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

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    jLabel13 = new javax.swing.JLabel();
    jLabel14 = new javax.swing.JLabel();
    jtfName = new javax.swing.JTextField();
    jtfID = new javax.swing.JTextField();
    jtfKostenstelle = new javax.swing.JTextField();
    jtfKM = new javax.swing.JTextField();
    jtfFirstRegistration = new javax.swing.JTextField();
    jtfLInspection = new javax.swing.JTextField();
    jtfNInspection = new javax.swing.JTextField();
    jtfLService = new javax.swing.JTextField();
    jtfNService = new javax.swing.JTextField();
    jtfAllTimeCost = new javax.swing.JTextField();
    jtfTireDimensions = new javax.swing.JTextField();
    jtfWinter = new javax.swing.JTextField();
    jtfSummer = new javax.swing.JTextField();
    jtaRepairs = new javax.swing.JTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    jtCost = new javax.swing.JTable();
    jbAdd = new javax.swing.JButton();
    jbDelete = new javax.swing.JButton();
    jbEdit = new javax.swing.JButton();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    getContentPane().setLayout(new java.awt.GridBagLayout());

    jLabel1.setText("Name");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.weightx = 0.2;
    getContentPane().add(jLabel1, gridBagConstraints);

    jLabel2.setText("Kennzeichen");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.weightx = 0.2;
    getContentPane().add(jLabel2, gridBagConstraints);

    jLabel3.setText("Kostenstelle");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.weightx = 0.2;
    getContentPane().add(jLabel3, gridBagConstraints);

    jLabel4.setText("Kilometerstand");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.weightx = 0.2;
    getContentPane().add(jLabel4, gridBagConstraints);

    jLabel5.setText("Erstzulassung");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.weightx = 0.2;
    getContentPane().add(jLabel5, gridBagConstraints);

    jLabel6.setText("Letzte §57a Begutachtung");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.weightx = 0.2;
    getContentPane().add(jLabel6, gridBagConstraints);

    jLabel7.setText("Nächste §57a Begutachtung");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.weightx = 0.2;
    getContentPane().add(jLabel7, gridBagConstraints);

    jLabel8.setText("Letzer Service");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 7;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.weightx = 0.2;
    getContentPane().add(jLabel8, gridBagConstraints);

    jLabel9.setText("Nächster Service");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.weightx = 0.2;
    getContentPane().add(jLabel9, gridBagConstraints);

    jLabel10.setText("Gesamt Kosten");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 9;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.weightx = 0.2;
    getContentPane().add(jLabel10, gridBagConstraints);

    jLabel11.setText("Reifendimensionen");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.weightx = 0.2;
    getContentPane().add(jLabel11, gridBagConstraints);

    jLabel12.setText("Winterreifen");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 11;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.weightx = 0.2;
    getContentPane().add(jLabel12, gridBagConstraints);

    jLabel13.setText("Sommerreifen");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.weightx = 0.2;
    getContentPane().add(jLabel13, gridBagConstraints);

    jLabel14.setText("Sonstige Reperaturen");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 3;
    getContentPane().add(jLabel14, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    getContentPane().add(jtfName, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    getContentPane().add(jtfID, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    getContentPane().add(jtfKostenstelle, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    getContentPane().add(jtfKM, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    getContentPane().add(jtfFirstRegistration, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    getContentPane().add(jtfLInspection, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    getContentPane().add(jtfNInspection, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 7;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    getContentPane().add(jtfLService, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    getContentPane().add(jtfNService, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 9;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    getContentPane().add(jtfAllTimeCost, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    getContentPane().add(jtfTireDimensions, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 11;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    getContentPane().add(jtfWinter, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 0.5;
    getContentPane().add(jtfSummer, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 15;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.gridheight = 4;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    getContentPane().add(jtaRepairs, gridBagConstraints);

    jtCost.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][]
      {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String []
      {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    jScrollPane1.setViewportView(jtCost);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.gridheight = 18;
    gridBagConstraints.weightx = 0.3;
    getContentPane().add(jScrollPane1, gridBagConstraints);

    jbAdd.setText("Hinzufügen");
    jbAdd.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jbAddActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.weightx = 0.15;
    getContentPane().add(jbAdd, gridBagConstraints);

    jbDelete.setText("Löschen");
    jbDelete.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jbDeleteActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 5;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 0.15;
    getContentPane().add(jbDelete, gridBagConstraints);

    jbEdit.setText("Bearbeiten");
    jbEdit.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jbEditActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 18;
    getContentPane().add(jbEdit, gridBagConstraints);

    jButton1.setText("Speichern");
    jButton1.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton1ActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.weightx = 0.7;
    getContentPane().add(jButton1, gridBagConstraints);

    jButton2.setText("Abbrechen");
    jButton2.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton2ActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.weightx = 0.3;
    getContentPane().add(jButton2, gridBagConstraints);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jbAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbAddActionPerformed
  {//GEN-HEADEREND:event_jbAddActionPerformed
    CostDialog dlg = new CostDialog(null, true);
    dlg.setLocationRelativeTo(this);
    dlg.setTitle("Eingabefenster");
    dlg.setMinimumSize(new Dimension(50, 30));
    dlg.setVisible(true);

    if (!dlg.isOKPressed())
    {
      return;
    }

    Cost c = dlg.getCost();
    model.add(c);
    jtfAllTimeCost.setText(String.valueOf(model.getAllTimeCost()));
    jbDelete.setEnabled(true);
    jbEdit.setEnabled(true);
  }//GEN-LAST:event_jbAddActionPerformed

  private void jbEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbEditActionPerformed
  {//GEN-HEADEREND:event_jbEditActionPerformed
    try
    {
      if (model.getRowCount() == 0)
      {
        throw new Exception("Keine Zeilen vorhanden!");
      }

      int index = jtCost.getSelectedRow();


      Cost c = model.getCost(index);
      EditCostDialog dlg = new EditCostDialog(null, true);
      dlg.setCost(c);
      dlg.setMinimumSize(new Dimension(400, 400));
      dlg.setTitle("Bearbeiten...");
      dlg.setLocationRelativeTo(this);
      dlg.setVisible(true);
      if (!dlg.isOKPressed())
      {
        return;
      }
      Cost c2 = dlg.getCost();
      model.set(index, c2);
    }
    catch (Exception ex)
    {
      JOptionPane.showMessageDialog(this, ex.getMessage(), "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_jbEditActionPerformed

  private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbDeleteActionPerformed
  {//GEN-HEADEREND:event_jbDeleteActionPerformed
    int index = jtCost.getSelectedRow();
    if (index < 0)
    {
      JOptionPane.showMessageDialog(
              this, // parent
              "Bitte eine Person selektieren", // message
              "Fehler: Entfernen nicht möglich", // title
              JOptionPane.ERROR_MESSAGE
      );
      return;
    }
    model.remove(index);

    if (model.getRowCount() <= 0)
    {
      jbDelete.setEnabled(false);
      jbEdit.setEnabled(false);
    }
  }//GEN-LAST:event_jbDeleteActionPerformed



  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
  {//GEN-HEADEREND:event_jButton1ActionPerformed

    name = jtfName.getText();
    id = jtfID.getText();
    kostenstelle = jtfKostenstelle.getText();
    km = Integer.parseInt(jtfKM.getText());
    firstRegistration = jtfFirstRegistration.getText();
    lastInspection = jtfLInspection.getText();
    nextInspection = jtfNInspection.getText();
    lastService = jtfLService.getText();
    nextService = jtfNService.getText();
    allTimeCost = model.getAllTimeCost();
    tireDims = jtfTireDimensions.getText();
    summer = jtfSummer.getText();
    winter = jtfWinter.getText();
    repairs = jtaRepairs.getText();


    try
    {
      save();
    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(this, e.getMessage(), "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
    }
    pressedOK = true;
    dispose();
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
  {//GEN-HEADEREND:event_jButton2ActionPerformed
    pressedOK = false;

    try
    {
      save();

    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(this, e.getMessage(), "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
    }

    dispose();
  }//GEN-LAST:event_jButton2ActionPerformed


  public Car getCar ()
  {
    return new Car(name, id, kostenstelle, km, firstRegistration, lastInspection, nextInspection, lastService, nextService, allTimeCost);
  }


  public void readFile (Car c) throws Exception
  {


    File e = new File(f + File.separator + c.getName() + "_costs.dat");
    File d = new File(f + File.separator + c.getName() + "_details.dat");

    System.out.println(e.getAbsolutePath() + d.getAbsolutePath());
    if (e.exists() && d.exists())
    {
      try
      {
        BufferedReader r = new BufferedReader(new FileReader(e));
        BufferedReader u = new BufferedReader(new FileReader(d));

        model.read(r);


        String line = u.readLine().trim();

        String s[] = line.split(";");

        jtfName.setText(s[0]);
        jtfID.setText(s[1]);
        jtfKostenstelle.setText(s[2]);
        jtfKM.setText(s[3]);
        jtfFirstRegistration.setText(s[4]);
        jtfLInspection.setText(s[5]);
        jtfNInspection.setText(s[6]);
        jtfLService.setText(s[7]);
        jtfNService.setText(s[8]);
        jtfAllTimeCost.setText(s[9]);

        if (!s[10].isEmpty())
        {
          jtfTireDimensions.setText(s[10]);
        }
        if (!s[11].isEmpty())
        {
          jtfSummer.setText(s[11]);
        }
        if (!s[12].isEmpty())
        {
          jtfWinter.setText(s[12]);
        }
        if (!s[13].isEmpty())
        {
          jtaRepairs.setText(s[13]);
        }
        if (!s[14].isEmpty())
        {
          kmbr = Integer.parseInt(s[14]);
        }
        else
        {
          kmbr = Integer.parseInt(s[3]);
        }


        u.close();
        r.close();

      }
      catch (Exception ex)
      {
        throw new Exception("Fehler aufgetreten beim einlesen der Dateien");
      }
    }
    else
    {

      jtfName.setText(c.getName());
      jtfID.setText(c.getId());
      jtfKostenstelle.setText(c.getKostenstelle());
      jtfKM.setText(String.valueOf(c.getKm()));
      jtfFirstRegistration.setText(c.getFirstRegistration());
      jtfLInspection.setText(c.getLastInspection());
      jtfNInspection.setText(c.getNextInspection());
      jtfLService.setText(c.getLastService());
      jtfNService.setText(c.getNextService());
      jtfAllTimeCost.setText(String.valueOf(c.getCost()));
      kmbr = c.getKm();
    }

  }


  public boolean isPressedOK ()
  {
    return pressedOK;
  }


  public void setFileRoot (File q)
  {
    System.out.println(q.getAbsolutePath());
    f = q;
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
      java.util.logging.Logger.getLogger(DetailsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(DetailsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(DetailsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(DetailsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /*
     * Create and display the dialog
     */
    java.awt.EventQueue.invokeLater(() ->
    {
      DetailsDialog dialog = new DetailsDialog(new javax.swing.JFrame(), true);
      dialog.addWindowListener(new java.awt.event.WindowAdapter()
      {
        @Override
        public void windowClosing (java.awt.event.WindowEvent e)
        {
          SaveAndClose dlg = new SaveAndClose(null, true);
          dlg.setVisible(true);
          if(dlg.isWantSave()){
            try
            {
              dialog.save();
            }
            catch (IOException ex)
            {
              JOptionPane.showMessageDialog(null, ex.getMessage(), "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
            }

          }
          System.exit(0);
        }
      });

      dialog.setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JButton jbAdd;
  private javax.swing.JButton jbDelete;
  private javax.swing.JButton jbEdit;
  private javax.swing.JTable jtCost;
  private javax.swing.JTextField jtaRepairs;
  private javax.swing.JTextField jtfAllTimeCost;
  private javax.swing.JTextField jtfFirstRegistration;
  private javax.swing.JTextField jtfID;
  private javax.swing.JTextField jtfKM;
  private javax.swing.JTextField jtfKostenstelle;
  private javax.swing.JTextField jtfLInspection;
  private javax.swing.JTextField jtfLService;
  private javax.swing.JTextField jtfNInspection;
  private javax.swing.JTextField jtfNService;
  private javax.swing.JTextField jtfName;
  private javax.swing.JTextField jtfSummer;
  private javax.swing.JTextField jtfTireDimensions;
  private javax.swing.JTextField jtfWinter;
  // End of variables declaration//GEN-END:variables

  
  private void save() throws IOException
  {
    BufferedWriter w = new BufferedWriter(new FileWriter(new File(f + File.separator + name + "_details.dat")));

      w.write(name);
      w.write(";");
      w.write(id);
      w.write(";");
      w.write(kostenstelle);
      w.write(";");
      w.write(String.valueOf(km));
      w.write(";");
      w.write(firstRegistration);
      w.write(";");
      w.write(lastInspection);
      w.write(";");
      w.write(nextInspection);
      w.write(";");
      w.write(lastService);
      w.write(";");
      w.write(nextService);
      w.write(";");
      w.write(String.valueOf(allTimeCost));
      w.write(";");
      w.write(tireDims);
      w.write(";");
      w.write(summer);
      w.write(";");
      w.write(winter);
      w.write(";");
      w.write(repairs);
      w.write(";");
      w.write(String.valueOf(kmbr));

      w.close();
      
       try
      {
        BufferedWriter x = new BufferedWriter(new FileWriter(new File(f + File.separator + name + "_costs.dat")));

        model.write(x);

        x.close();
      }
      catch (Exception e)
      {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
      }
  }
}
