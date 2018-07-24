/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.BufferedWriter;
import java.io.IOException;


/**
 *
 * @author imperatus
 */
public class Cost 
{
  private final String date;
  private final double cost;


  public Cost (String date, double cost)
  {
    this.date = date;
    this.cost = cost;
  }


  public String getDate ()
  {
    return date;
  }


  public double getCost ()
  {
    return cost;
  }


  public void write (BufferedWriter x) throws IOException
  {
    x.write(date);
    x.write(";");
    x.write(String.valueOf(cost));
  }
  
  
}
