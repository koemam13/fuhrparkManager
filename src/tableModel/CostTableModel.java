/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableModel;

import data.Cost;
import data.FileFormatException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author imperatus
 */
public class CostTableModel extends AbstractTableModel
{

  private final List<Cost> costs = new ArrayList<>();
  private final String[] colNames =
  {
    "Monat/Jahr", "Kosten"
  };


  @Override
  public int getRowCount ()
  {
    return costs.size();
  }


  @Override
  public int getColumnCount ()
  {
    return colNames.length;
  }


  @Override
  public Object getValueAt (int rowIndex, int columnIndex)
  {
    final Cost c = costs.get(rowIndex);
    switch (columnIndex)
    {
      case 0:
        return c.getDate();
      case 1:
        String x;
        x = String.format("%.2f \u20AC", c.getCost());
        return x;
      default:
        throw new RuntimeException("wrong column index " + columnIndex);
    }
  }


  public boolean add (Cost c)
  {
    boolean rv = costs.add(c);
    fireTableRowsInserted(costs.size() - 1, costs.size() - 1);
    return rv;
  }


  public List<Cost> getCosts ()
  {
    return costs;
  }


  public double getAllTimeCost ()
  {
    double x = 0;
    for (Cost c : costs)
    {
      x += c.getCost();
    }
    String s = String.format("%.2f", x);
    System.out.println(s);
    return Double.parseDouble(s.replace(",", "."));
  }


  @Override
  public String getColumnName (int column)
  {
    return colNames[column];
  }


  public Cost getCost (int index)
  {
    Cost c = costs.get(index);
    return c;
  }


  public boolean remove (Cost c)
  {
    int index = costs.indexOf(c);
    boolean rv = costs.remove(c);
    fireTableRowsDeleted(index, index);
    return rv;
  }


  public Cost remove (int index)
  {
    Cost c = costs.remove(index);
    fireTableRowsDeleted(index, index);
    return c;
  }


  public void set (int index, Cost c)
  {
    costs.set(index, c);
    fireTableRowsUpdated(index, index);
  }


  public void write (BufferedWriter x) throws IOException
  {
    for (Cost c : costs)
    {
      c.write(x);
      x.newLine();
    }
  }


  public void read (BufferedReader r) throws FileFormatException, IOException
  {
    costs.clear();
    fireTableDataChanged();

    while (r.ready())
    {
      String line = r.readLine().trim();

      String s[] = line.split(";");

      if (s.length < 2)
      {
        throw new FileFormatException("Falsches format");
      }

      costs.add(new Cost(s[0], Double.parseDouble(s[1])));
      fireTableDataChanged();

    }
  }

}
