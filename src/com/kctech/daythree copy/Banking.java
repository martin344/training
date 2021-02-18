package com.kctech.daythree;
abstract class Bank
{
	abstract int interest();
}
class SBI extends Bank
{
	int interest()
	{
	  return 6;
	}
}
class IB extends Bank
{
	int interest()
	{
		return 8;
	}
}
class Banking
{
	public static void main(String args[])
	{
		Bank b;
		b=new SBI();
		System.out.println("Rate of interest for SBI is:"+ b.interest());
		b=new IB();
		System.out.println("Rate of interest for IB is:"+ b.interest());
}
}

