package com.kctech.day1;

public class Parameter
      {
	    static void myMethod(String fname) {
	    System.out.println(fname + " Refsnes");
	  }

	  public static void main(String[] args) {
	    myMethod("Liam");
	    myMethod("Jenny");
	    myMethod("Anja");
	  }
	}