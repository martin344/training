package com.kctech.daythree;

import java.io.FileInputStream;  
public class Inputfile 
{  
     public static void main(String args[])
     {    
          try
          {    
            FileInputStream fin=new FileInputStream("");    
            int i=fin.read();  
            System.out.print((char)i);    
  
            fin.close();    
          }
          catch(Exception e)
          {
        	  System.out.println(e);
          }    
         }    
        }  