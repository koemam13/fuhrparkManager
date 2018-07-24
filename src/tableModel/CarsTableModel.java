/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableModel;

import data.Car;
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
public class CarsTableModel extends AbstractTableModel
{
  private final List<Car> cars = new ArrayList<>();
  
  private static final String [] colNames = {"Fahrzeug","Kennzeichen","Kostenstelle","Kilometer","Erst Zulassung",
                                             "Lletzte §57a Begutachtung", "Nächste Begutachtung","Letzter Service",
                                             "Nächster Service", "Kosten"};

  @Override
  public int getRowCount ()
  {
    return cars.size();
  }


  @Override
  public int getColumnCount ()
  {
    return colNames.length;
  }


  @Override
  public String getColumnName (int columnIndex)
  {
    return colNames[columnIndex];
  }
  
  


  @Override
  public Object getValueAt (int rowIndex, int columnIndex)
  {
    final Car c = cars.get(rowIndex);
    switch(columnIndex)
    {
      case 0: 
        return c.getName();
      case 1:
        return c.getId();
      case 2:
        return c.getKostenstelle();
      case 3:
        return c.getKm();
      case 4:
        return c.getFirstRegistration();
      case 5:
        return c.getLastInspection();
      case 6:
        return c.getNextInspection();
      case 7:
        return c.getLastService();
      case 8:
        return c.getNextService();
      case 9:
        return c.getCost();
    }
    return null;
  }
  
  public boolean add (Car c)
  {
    boolean rv = cars.add(c);
    fireTableRowsInserted(cars.size()-1, cars.size()-1);
    return rv;
  }
  
  public boolean remove(Car c)
  {
    int index = cars.indexOf(c);
    boolean rv = cars.remove(c);
    fireTableRowsDeleted(index, index);
    return rv;
    
  }
  
  public Car remove (int index)
  {
    Car c = cars.remove(index);
    fireTableRowsDeleted(index, index);
    return c;
    
  }
  
  public Car getCar (int index)
  {
    Car c = cars.get(index);
    return c;
  }
  
  public void write (BufferedWriter w) throws IOException
  {
    for (Car c : cars) {
      c.write(w);
      w.newLine();
    }
  }
  
    public void set (int index, Car c)
  {
    cars.set(index, c);
    fireTableRowsUpdated(index, index);
  }

  
  public void read (BufferedReader r) throws FileFormatException, IOException
  {
    cars.clear();
    fireTableDataChanged();
    
    while (r.ready()) {
      String line = r.readLine().trim();
      
      String s[] = line.split(",");
      
      if(s.length < 9)
        throw new FileFormatException("Falsches format");
      
      System.out.println(java.util.Arrays.toString(s));
      
      cars.add(new Car(s[0], s[1],s[2],Integer.parseInt(s[3]),s[4],s[5],s[6],s[7],s[8],Double.parseDouble(s[9])));
      fireTableDataChanged();
      
    }
  }
  
}
