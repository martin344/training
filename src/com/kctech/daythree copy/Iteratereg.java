package com.kctech.daythree;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratereg 
{
  public static void main(String[] args)
{
  
    
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    Iterator<String> it = cars.iterator();

          while(it.hasNext())
          {   String a;
        	  a=it.next();
        	  System.out.println(a);
          }
  }
}
