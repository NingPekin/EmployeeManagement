package data;
import java.util.*;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream; 
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import bus.*;


public class FileHandler {
	
	public static final String filePath = "src/data/emp.ser";
	public static final String filePath2 = "src/data/performance.ser";
	// 1- write to serialized file
		
		public static void writeData(ArrayList<Employee> arr_emp) throws IOException 
	     {
			FileOutputStream outFile = new FileOutputStream(filePath);				
			ObjectOutputStream outStream = new ObjectOutputStream(outFile);	
			outStream.writeObject(arr_emp);		
			outStream.close();
		}

	// 2- read from serialized file
		public static  ArrayList<Employee> readData() 
				throws IOException, FileNotFoundException,ClassNotFoundException
		{			
		    FileInputStream inFile = new FileInputStream(filePath);		
			ObjectInputStream inStream = new ObjectInputStream(inFile);			
			@SuppressWarnings("unchecked")
			ArrayList<Employee> arr_emp = (ArrayList<Employee>)inStream.readObject();
			inStream.close();
			return arr_emp;
		}
		
	//3- write performance to serialized file
		public static void writePerformance(ArrayList<Employee> arr_emp) throws IOException
		{
			FileOutputStream outFile=new FileOutputStream(filePath2);
			ObjectOutputStream outStream =new ObjectOutputStream(outFile);
			
			for	(Employee emp : arr_emp)
			{
			outStream.writeObject(emp.getPerformance());
			outStream.writeObject(emp.Bonus());
			}
			outStream.close();
		}
	//4- read from serialized file
		public static ArrayList<Object> readFromPerformanceFile ()  throws IOException, ClassNotFoundException
		{		
//			ArrayList<String> performance=new ArrayList<String>();
//			ArrayList<Double> bonus=new ArrayList<Double>();
			ArrayList<Object> objectsList = new ArrayList<Object>();
			boolean cont = true;
			try
			{
				FileInputStream inFile=new FileInputStream(filePath2);
				ObjectInputStream inStream=new ObjectInputStream(inFile);
			   while(cont)
			   {
			      Object obj = inStream.readObject();
			      if(obj != null)
			         objectsList.add(obj);
			      else
			         cont = false;
			   }
			   inStream.close();
		
			}
			catch(Exception e)
			{
			   //System.out.println(e.printStackTrace());
			}
			return objectsList;

						
			
		}
}

