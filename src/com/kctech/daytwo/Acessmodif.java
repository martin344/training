package com.kctech.daytwo;
class Mac{
	public int a=20;
	public void dis()
	{
		System.out.println("Mac os");
	}
}
public class Acessmodif {
	public static void main(String args[])
	{
		Mac m=new Mac();
		System.out.println(m.a);
		m.dis();
	}

}
