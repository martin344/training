package com.kctech.daythree;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		// TODO Auto-generated method stub

		Serializable obj =null;

		String filenameread="serialize.txt";

		FileInputStream file=new FileInputStream(filenameread);
		ObjectInputStream bj = new ObjectInputStream(file); 

		obj= (Serializable)bj.readObject();
		bj.close();
		file.close();

		System.out.println("Deserialization is success");
		System.out.println("The integer value of a is :"+obj.a);
		System.out.println("The string value of b is :"+obj.b);




	}

}
