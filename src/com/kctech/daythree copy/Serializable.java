package com.kctech.daythree;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

@SuppressWarnings("serial")
public class Serializable  implements java.io.Serializable {
	
	public int a;
	public String b;
	
	
	Serializable(int a,String b)
	{
		this.a=a;
		this.b=b;
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Serializable object= new Serializable(25,"Martin");
		
		String filename="serialize.txt";
		
		FileOutputStream file=new FileOutputStream(filename);
		ObjectOutputStream ob=new ObjectOutputStream (file);
		
		ob.writeObject(object);
		
		ob.close();
		
		file.close();
		
		System.out.println("Serialzation Successful");

	}

	
}
