package com.kctech.daythree;

interface printable
{  
void print();  
}  
class Abstractions implements printable
{  
public void print() 
{
	System.out.println("Hello");
	}  
  
public static void main(String args[])
{  
	Abstractions obj = new 	Abstractions();  
     obj.print();  
 }  
}  