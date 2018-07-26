/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.IOException;
import java.io.Writer;


/**
 *
 * @author imperatus
 */
public class Car
{

  private final String name;
  private final String id;
  private final String kostenstelle;
  private final int km;
  private final String firstRegistration;
  private final String lastInspection;
  private final String nextInspection;
  private final String lastService;
  private final String nextService;
  private final double cost;


  public Car (String name, String id, String kostenstelle, int km, String firstRegistration, String lastInspection, String nextInspection, String lastService, String nextService, double cost)
  {
    this.name = name;
    this.id = id;
    this.kostenstelle = kostenstelle;
    this.km = km;
    this.firstRegistration = firstRegistration;
    this.lastInspection = lastInspection;
    this.nextInspection = nextInspection;
    this.lastService = lastService;
    this.nextService = nextService;
    this.cost = cost;
  }


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


  public String getFirstRegistration ()
  {
    return firstRegistration;
  }


  public String getLastInspection ()
  {
    return lastInspection;
  }


  public String getNextInspection ()
  {
    return nextInspection;
  }


  public String getLastService ()
  {
    return lastService;
  }


  public String getNextService ()
  {
    return nextService;
  }


  public double getCost ()
  {
    return cost;
  }
  
  /* write method
   * writes all the Objects variables into the file it gets for main.gui
   */


  public void write (Writer w) throws IOException
  {
    w.write(name);
    w.write(",");
    w.write(id);
    w.write(",");
    w.write(kostenstelle);
    w.write(",");
    w.write(String.valueOf(km));
    w.write(",");
    w.write(firstRegistration);
    w.write(",");
    w.write(lastInspection);
    w.write(",");
    w.write(nextInspection);
    w.write(",");
    w.write(lastService);
    w.write(",");
    w.write(nextService);
    w.write(",");
    w.write(String.valueOf(cost));
    w.flush();
  }


}
