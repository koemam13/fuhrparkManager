/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogWindows;


import data.Car;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


/**
 *
 * @author imperatus
 */
public class PrintDetails extends javax.swing.JDialog implements Printable
{

  private static File f;
  private boolean print = false;
  private static PrintDetails dialog;


  /**
   * Creates new form showDetails
   *
   * @param parent
   * @param modal
   */
  public PrintDetails (java.awt.Frame parent, boolean modal)
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

    jlName = new javax.swing.JLabel();
    jno = new javax.swing.JLabel();
    jid = new javax.swing.JLabel();
    jido = new javax.swing.JLabel();
    jk = new javax.swing.JLabel();
    jko = new javax.swing.JLabel();
    jkm = new javax.swing.JLabel();
    jkmo = new javax.swing.JLabel();
    jfr = new javax.swing.JLabel();
    jfro = new javax.swing.JLabel();
    jli = new javax.swing.JLabel();
    jni = new javax.swing.JLabel();
    jnio = new javax.swing.JLabel();
    jls = new javax.swing.JLabel();
    jlso = new javax.swing.JLabel();
    jns = new javax.swing.JLabel();
    jnso = new javax.swing.JLabel();
    jatc = new javax.swing.JLabel();
    jatco = new javax.swing.JLabel();
    jtd = new javax.swing.JLabel();
    jtdo = new javax.swing.JLabel();
    jts = new javax.swing.JLabel();
    jtso = new javax.swing.JLabel();
    jtw = new javax.swing.JLabel();
    jtwo = new javax.swing.JLabel();
    jlio = new javax.swing.JLabel();
    jkpk = new javax.swing.JLabel();
    jkpkmo = new javax.swing.JLabel();
    jrep = new javax.swing.JLabel();
    jrepo = new javax.swing.JLabel();
    jkbro = new javax.swing.JLabel();
    jkbr = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
    layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
    layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
    getContentPane().setLayout(layout);

    jlName.setText("Name:");
    jlName.setToolTipText("");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.weightx = 0.25;
    gridBagConstraints.insets = new java.awt.Insets(4, 2, 4, 2);
    getContentPane().add(jlName, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.weightx = 0.25;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    getContentPane().add(jno, gridBagConstraints);

    jid.setText("Kennzeichen:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(4, 2, 4, 2);
    getContentPane().add(jid, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    getContentPane().add(jido, gridBagConstraints);

    jk.setText("Kostenstelle:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    getContentPane().add(jk, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    getContentPane().add(jko, gridBagConstraints);

    jkm.setText("Aktueller Kilometerstand");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    getContentPane().add(jkm, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    getContentPane().add(jkmo, gridBagConstraints);

    jfr.setText("Erstzulassung:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.weightx = 0.25;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    getContentPane().add(jfr, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.weightx = 0.25;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    getContentPane().add(jfro, gridBagConstraints);

    jli.setText("Letzte §57a Begutachtung:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(4, 2, 4, 2);
    getContentPane().add(jli, gridBagConstraints);

    jni.setText("Nächste §57a Begutachtung:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    getContentPane().add(jni, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    getContentPane().add(jnio, gridBagConstraints);

    jls.setText("Letzter Service:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(4, 2, 4, 2);
    getContentPane().add(jls, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    getContentPane().add(jlso, gridBagConstraints);

    jns.setText("Nächster Service:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    getContentPane().add(jns, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    getContentPane().add(jnso, gridBagConstraints);

    jatc.setText("Gesamtkosten:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(4, 2, 4, 2);
    getContentPane().add(jatc, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    getContentPane().add(jatco, gridBagConstraints);

    jtd.setText("Reifendimensionen:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(4, 2, 4, 2);
    getContentPane().add(jtd, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    getContentPane().add(jtdo, gridBagConstraints);

    jts.setText("Sommerreifen:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(4, 2, 4, 2);
    getContentPane().add(jts, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    getContentPane().add(jtso, gridBagConstraints);

    jtw.setText("Winterreifen:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 24;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(4, 2, 4, 2);
    getContentPane().add(jtw, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 24;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    getContentPane().add(jtwo, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    getContentPane().add(jlio, gridBagConstraints);

    jkpk.setText("Kosten pro KM:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(4, 2, 4, 2);
    getContentPane().add(jkpk, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    getContentPane().add(jkpkmo, gridBagConstraints);

    jrep.setText("Sonstige reperaturen:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 30;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.insets = new java.awt.Insets(25, 0, 5, 0);
    getContentPane().add(jrep, gridBagConstraints);

    jrepo.setText("Sonstige reperaturen");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 32;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(18, 0, 4, 0);
    getContentPane().add(jrepo, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(4, 2, 4, 2);
    getContentPane().add(jkbro, gridBagConstraints);

    jkbr.setText("Kilometerstand bei Registrierung:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new java.awt.Insets(4, 2, 4, 2);
    getContentPane().add(jkbr, gridBagConstraints);

    pack();
  }// </editor-fold>//GEN-END:initComponents


  public void setRootFile (File x)
  {
    f = x;

  }


  public void setLabels (Car c) throws Exception
  {
    File x = new File(f + File.separator + c.getName() + "_details.dat");

    System.out.println(x.getAbsolutePath());

    if (x.exists())
    {
      try
      {
        BufferedReader r = new BufferedReader(new FileReader(x));

        String line = r.readLine().trim();

        String[] s = line.split(";");

        System.out.println(java.util.Arrays.toString(s));

        jno.setText(s[0]);
        jido.setText(s[1]);
        jko.setText(s[2]);
        jkmo.setText(s[3] + "km");
        jfro.setText(s[4]);
        jlio.setText(s[5]);
        jnio.setText(s[6]);
        jlso.setText(s[7]);
        jnso.setText(s[8]);
        jatco.setText(s[9] + " \u20AC");
        jtdo.setText(s[10]);
        jtso.setText(s[11]);
        jtwo.setText(s[12]);
        jrepo.setText(s[13]);
        jkpkmo.setText(String.format("%.2f \u20AC", Double.parseDouble(s[9]) / (Integer.parseInt(s[3]) - Integer.parseInt(s[14]))));
        jkbro.setText(s[14]);
      }
      catch (Exception e)
      {
        throw new Exception("Fehler beim Einlesen der Datei.");
      }
    }
    else
    {
      jno.setText(c.getName());
      jido.setText(c.getId());
      jko.setText(c.getKostenstelle());
      jkmo.setText(String.valueOf(c.getKm()) + " km");
      jfro.setText(c.getFirstRegistration());
      jlio.setText(c.getLastInspection());
      jnio.setText(c.getNextInspection());
      jlso.setText(c.getLastService());
      jnso.setText(c.getNextService());
      jatco.setText(String.valueOf(c.getCost()) + "\u20AC");
    }
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
      java.util.logging.Logger.getLogger(PrintDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(PrintDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(PrintDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(PrintDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /*
     * Create and display the dialog
     */
    java.awt.EventQueue.invokeLater(() ->
    {
      dialog = new PrintDetails(new javax.swing.JFrame(), true);

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
  private javax.swing.JLabel jatc;
  private javax.swing.JLabel jatco;
  private javax.swing.JLabel jfr;
  private javax.swing.JLabel jfro;
  private javax.swing.JLabel jid;
  private javax.swing.JLabel jido;
  private javax.swing.JLabel jk;
  private javax.swing.JLabel jkbr;
  private javax.swing.JLabel jkbro;
  private javax.swing.JLabel jkm;
  private javax.swing.JLabel jkmo;
  private javax.swing.JLabel jko;
  private javax.swing.JLabel jkpk;
  private javax.swing.JLabel jkpkmo;
  private javax.swing.JLabel jlName;
  private javax.swing.JLabel jli;
  private javax.swing.JLabel jlio;
  private javax.swing.JLabel jls;
  private javax.swing.JLabel jlso;
  private javax.swing.JLabel jni;
  private javax.swing.JLabel jnio;
  private javax.swing.JLabel jno;
  private javax.swing.JLabel jns;
  private javax.swing.JLabel jnso;
  private javax.swing.JLabel jrep;
  private javax.swing.JLabel jrepo;
  private javax.swing.JLabel jtd;
  private javax.swing.JLabel jtdo;
  private javax.swing.JLabel jts;
  private javax.swing.JLabel jtso;
  private javax.swing.JLabel jtw;
  private javax.swing.JLabel jtwo;
  // End of variables declaration//GEN-END:variables


  @Override
  public int print (Graphics g, PageFormat pf, int pageIndex) throws PrinterException
  {
    if (pageIndex > 0)
    {
      /*
       * We have only one page, and 'page' is zero-based
       */
      return NO_SUCH_PAGE;
    }

    /*
     * User (0,0) is typically outside the imageable area, so we must translate by the X and Y values in the PageFormat
     * to avoid clipping
     */
    Graphics2D g2d = (Graphics2D) g;

    g2d.translate(pf.getImageableX(), pf.getImageableY());

    /*
     * Now print the window and its visible contents
     */
    PrintDetails dlg = new PrintDetails(null, true);
    dlg.revalidate();
    dlg.repaint();
    dlg.printAll(g);

    /*
     * tell the caller that this page is part of the printed document
     */
    return PAGE_EXISTS;


  }


  public static class Printer implements Printable
  {

    final Component comp;


    public Printer (Component comp)
    {
      this.comp = comp;
    }


    @Override
    public int print (Graphics g, PageFormat format, int page_index)
            throws PrinterException
    {
      if (page_index > 0)
      {
        return Printable.NO_SUCH_PAGE;
      }

      // get the bounds of the component
      Dimension dim = comp.getSize();
      double cHeight = dim.getHeight();
      double cWidth = dim.getWidth();

      // get the bounds of the printable area
      double pHeight = format.getImageableHeight();
      double pWidth = format.getImageableWidth();

      double pXStart = format.getImageableX();
      double pYStart = format.getImageableY();

      double xRatio = pWidth / cWidth;
      double yRatio = pHeight / cHeight;


      Graphics2D g2 = (Graphics2D) g;
      g2.translate(pXStart, pYStart);
      g2.scale(xRatio, yRatio);
      comp.paint(g2);

      return Printable.PAGE_EXISTS;
    }
  }
}
