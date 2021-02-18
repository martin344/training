package com.kctech.daythree;
import java.io.*;  
public class Filewriter 
{  
    public static void main(String[] args)
    {  
        try 
        {  
        	File file = new File("output.txt");
            Writer w = new FileWriter(file);  
            String content = "I love my country because it is beautiful";  
            w.write(content);  
            w.close();  
            System.out.println("Done");  
        } 
        catch (IOException e)
        {  
            System.out.println(e); 
        }  
    }  
}  