package com.kctech.day1;

class Motorcycle
{  
	  void run()
	  {
		  System.out.println("running");
		  }  
	}  
	class Splender extends Motorcycle{  
	  void run()
	  {
		  System.out.println("running safely with 60km");
		  }  
	  
	  public static void main(String args[])
	  {  
		  Motorcycle m = new Splender(); 
	      m.run();  
	  }  
	}  