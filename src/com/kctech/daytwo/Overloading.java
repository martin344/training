package com.kctech.daytwo;

public class Overloading {
	public int sum( int a,int b,int c)
	{
		return(a+b+c);
	}
	public float sum(float a,float b,float c)
	{
		return(a+b+c);
	}
	public double sum(double a,double b,double c)
	{
		return(a+b+c);
		
	}
	public static void main(String args[])
	{
		Overloading o=new Overloading();
		System.out.println(o.sum(1, 2, 3));
		System.out.println(o.sum(1.1,2.2,3.3));
	}

}
