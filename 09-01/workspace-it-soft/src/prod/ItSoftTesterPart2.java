package prod;
import bus.*;

import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import data.FileHandler;

public class ItSoftTesterPart2 {

	public static Scanner scann=new Scanner(System.in);
	public static Sequence sequence=new Sequence();
	public static SINComparator sinComparator=new SINComparator();
	public static void main(String[] args) throws IOException, MyException, ClassNotFoundException {
		// TODO Auto-generated method stub	
		sequence.setCount(100);		
		char ifbackmenu;
		do
		{
		System.out.println("1. Add Full Time employee");
		System.out.println("2. Add Part Time employee");
		System.out.println("3. Search employee by SIN");
		System.out.println("4. Sort employees");
		System.out.println("5. List employees and Save to File");
		System.out.println("6. Modify Part Time employee");	
		System.out.println("7. Print Performance table");	
		System.out.println("8. Exit");
		System.out.println("Please enter your choice: ");
		int menuChoice=scann.nextInt();
		switch(menuChoice)
		{
		case 1:
			AddFullTime();
			break;
		case 2:
			AddPartTime();
			break;
		case 3:
			SearchEmployeeBySin();
			break;
		case 4:
			Sort();
			break;
		case 5:
//			PrintAndSave();
			WriteToFile();
			ReadFromFile();
			break;
		case 6:
			ModifyDuration();
			break;
		case 7:
			PrintPerformance();
			break;
		case 8:
			System.exit(0);
			break;
		}
		System.out.println("Do you want to go back to menu?(Y/N)");
		ifbackmenu=scann.next().charAt(0);
		System.out.println(ifbackmenu);
		}while(ifbackmenu=='Y'||ifbackmenu=='y');		
		}

	public static void AddFullTime() throws MyException
	{
		FullTime ft=new FullTime();
		boolean isvalid=false;
		do
		{
			try{
		System.out.println("Please enter first name:");
		String firstName=scann.next();
		ft.setFn(firstName);
		isvalid=true;	
			}
			catch(Exception e)
			{
			System.out.println(e.getMessage());	
			}
		}while(!isvalid);
		isvalid=false;
		do
		{
		try{
			System.out.println("Please enter last name:");
			String lastName=scann.next();
			ft.setLn(lastName);
			isvalid=true;	
			}
			catch(Exception e)
			{
			System.out.println(e.getMessage());	
			}
		}while(!isvalid);
		isvalid=false;
		do
		{
		try{
			System.out.println("Please enter sin:");
			int sin=scann.nextInt();
			ft.setSin(sin);
			isvalid=true;	
			}
			catch(Exception e)
			{
			System.out.println(e.getMessage());	
			}
		}while(!isvalid);
		isvalid=false;
		do
		{
		try{
			System.out.println("Please enter email:");
			String email=scann.next();
			ft.setEmail(email);
			isvalid=true;	
			}
			catch(Exception e)
			{
			System.out.println(e.getMessage());	
			}
		}while(!isvalid);
		isvalid=false;
		do
		{
		try{
			System.out.println("Please enter telephone number:");
			int tele=scann.nextInt();
			ft.setTelephone(tele);
			isvalid=true;	
			}
			catch(Exception e)
			{
			System.out.println(e.getMessage());	
			}
		}while(!isvalid);

		System.out.println("Please enter address:");
		String address=scann.next();
		
		System.out.println("Please define¡¡the performance(1.excellent/2.good/3.fair):");
		String perfor=scann.next();
		if (perfor.equals("excellent")||perfor.equals("1"))
		{
			ft.setPerformance(EnumType.Performance.excellent);
		}
		else if (perfor.equals("good")||perfor.equals("2"))
		{
			ft.setPerformance(EnumType.Performance.good);
		}
		else if (perfor.equals("fair")||perfor.equals("3"))
		{
			ft.setPerformance(EnumType.Performance.fair);
		}
		else
		{
			ft.setPerformance(null);
		}
		isvalid=false;
		do
		{
		try{
			System.out.println("Please enter annualSalary:");
			double annualSalary=scann.nextDouble();
			ft.setAnnualSalary(annualSalary);
			isvalid=true;	
			}
			catch(Exception e)
			{
			System.out.println(e.getMessage());	
			}
		}while(!isvalid);
		System.out.println("Please select your position(1.secretary/2.director/3.analystProgrammer):");
		String position=scann.next();
//		System.out.println(position);
		if(position.equals("secretary")||position.equals("1"))
			{ft.setPosition(EnumType.FullTimePosition.secretary);}
		else if(position.equals("director")||position.equals("2"))
			{ft.setPosition(EnumType.FullTimePosition.director);}
		else if(position.equals("analystProgrammer")||position.equals("3"))
			{ft.setPosition(EnumType.FullTimePosition.analystProgrammer);
			}
		else
			{ft.setPosition(null);}
//		System.out.println(ft.getPosition());
		ft.setId(sequence.getCount());
		ft.setAddress(address);
		ft.setType(EnumType.Type.fullTime);
		DataCollection.AddEmployee(ft);
		
	}
	public static void AddPartTime() throws MyException
	{
		PartTime pt=new PartTime();
		boolean isvalid=false;
		do
		{
			try{
		System.out.println("Please enter first name:");
		String firstName=scann.next();
		pt.setFn(firstName);
		isvalid=true;	
			}
			catch(Exception e)
			{
			System.out.println(e.getMessage());	
			}
		}while(!isvalid);
		isvalid=false;
		do
		{
		try{
			System.out.println("Please enter last name:");
			String lastName=scann.next();
			pt.setLn(lastName);
			isvalid=true;	
			}
			catch(Exception e)
			{
			System.out.println(e.getMessage());	
			}
		}while(!isvalid);
		isvalid=false;
		do
		{
		try{
			System.out.println("Please enter sin:");
			int sin=scann.nextInt();
			pt.setSin(sin);
			isvalid=true;	
			}
			catch(Exception e)
			{
			System.out.println(e.getMessage());	
			}
		}while(!isvalid);
		isvalid=false;
		do
		{
		try{
			System.out.println("Please enter email:");
			String email=scann.next();
			pt.setEmail(email);
			isvalid=true;	
			}
			catch(Exception e)
			{
			System.out.println(e.getMessage());	
			}
		}while(!isvalid);
		isvalid=false;
		do
		{
		try{
			System.out.println("Please enter telephone number:");
			int tele=scann.nextInt();
			pt.setTelephone(tele);
			isvalid=true;	
			}
			catch(Exception e)
			{
			System.out.println(e.getMessage());	
			}
		}while(!isvalid);
		System.out.println("Please enter address:");
		String address=scann.next();
		System.out.println("Please define¡¡the performance(1.excellent/2.good/3.fair):");
		String perfor=scann.next();
		if (perfor.equals("excellent")||perfor.equals("1"))
		{
			pt.setPerformance(EnumType.Performance.excellent);
		}
		else if (perfor.equals("good")||perfor.equals("2"))
		{
			pt.setPerformance(EnumType.Performance.good);
		}
		else if (perfor.equals("fair")||perfor.equals("3"))
		{
			pt.setPerformance(EnumType.Performance.fair);
		}
		else
		{
			pt.setPerformance(null);
		}
		
		isvalid=false;
		do
		{
		try{
			System.out.println("Please enter workHours:");
			double workHours=scann.nextDouble();
			pt.setWorkHours(workHours);
			isvalid=true;	
			}
			catch(Exception e)
			{
			System.out.println(e.getMessage());	
			}
		}while(!isvalid);
		isvalid=false;
		do
		{
		try{
			System.out.println("Please enter hourlyRate:");
			double hourlyRate=scann.nextDouble();
			pt.setHourlyRate(hourlyRate);
			isvalid=true;	
			}
			catch(Exception e)
			{
			System.out.println(e.getMessage());	
			}
		}while(!isvalid);
		
		System.out.println("Please enter duratonContract:");
		double duratonContract=scann.nextDouble();
		System.out.println("Please select your position(1. trainerConsultants/2. traineeStudent):");
		String position=scann.next();
		if(position.equals("trainerConsultants")||position.equals("1"))
			pt.setPartTimePosition(EnumType.PartTimePosition.trainerConsultants);
		else if(position=="traineeStudent"||position=="2")
			pt.setPartTimePosition(EnumType.PartTimePosition.trainerConsultants);
		else
			pt.setPartTimePosition(null);
		pt.setId(sequence.getCount());
		pt.setAddress(address);
		pt.setDuratonContract(duratonContract);
		pt.setType(EnumType.Type.partTime);	
		DataCollection.AddEmployee(pt);
	}

	public static void PrintAndSave() throws IOException
	{
		//print
		for(Employee aEmployee:DataCollection.getArrayEmployee())
		{
			System.out.println(aEmployee);
		}		
		//the emp in the arraylist 
		FileWriter outfile=new FileWriter("src/data/emp.txt");
		PrintWriter writer=new PrintWriter(outfile);		
		for(Employee e:DataCollection.getArrayEmployee())
		{	writer.println(e);
		}		
		writer.close();

	}
		
	public static void PrintPerformance() throws IOException, ClassNotFoundException
	{
		FileHandler.writePerformance(DataCollection.getArrayEmployee());
		ArrayList<Object> object=FileHandler.readFromPerformanceFile();
		int count=0;
		for(Object o:object)
		{
			count++;
			System.out.println(o);
			if(count==2)
			{
			System.out.println("------------------");
			count=0;
			}
		}
	}
	public static void WriteToFile() throws IOException
	{
	FileHandler.writeData(DataCollection.getArrayEmployee());
	}
	public static void ReadFromFile() throws IOException, ClassNotFoundException
	{
	ArrayList<Employee> arr_from_file=FileHandler.readData();
	for(Employee item : arr_from_file)
	{
		System.out.println(item);
	}
	}
	
	public static void SearchEmployeeBySin()
	{
		
		System.out.println("search for emp by sin");
		System.out.println("==========================");		
		System.out.println("Enter the SIN you want to search:");
		int searchedInfo=scann.nextInt();
//		System.out.println(searchedInfo);
		Employee emp=DataCollection.Search(searchedInfo);
		if(emp!=null)
		{
		System.out.println("It's found!");			
		System.out.println(emp);			
		}
		else
		{
		System.out.println("It's not found!");	
		}
		
	}

	public static void ModifyDuration()
	{
		//modify the duration of contract 
		System.out.println("modify the duration of contract");
		System.out.println("==========================");
		boolean isFound=true;
		do{
		System.out.println("Choose an part time employee you want to modify by SIN: ");	
		int modifiedEmp=scann.nextInt();
		PartTime p=(PartTime)DataCollection.Search(modifiedEmp);
		if(p==null)
		{
		System.out.println("It's not found!");		
		isFound=false;
		}
		else
		{
		System.out.println("Enter a new duration you want to modify : ");		
		int modifeidDuration=scann.nextInt();
		DataCollection.ModifyContract(p, modifeidDuration);
		System.out.println("Modified successfully!");	
		isFound=true;
		System.out.println(p);
		}

		}while(isFound==false);
	}

	public static void Sort()
	{	
		//sort by sin
		System.out.println("Sort by SIN!");
		System.out.println("==========================");
		Collections.sort(DataCollection.getArrayEmployee(),sinComparator);
		//print
		for(Employee aEmployee:DataCollection.getArrayEmployee())
		{
			System.out.println(aEmployee);
		}
	}

	public static void Remove()
	{
		//remove 
		System.out.println("Remove");
		System.out.println("==========================");
		
		System.out.println("Enter the SIN of emp you want to remove:");
		int searchedInfo=scann.nextInt();
		Employee emp=DataCollection.Search(searchedInfo);
		if(emp!=null)
		{	
		DataCollection.RemoveEmployee(emp);	
		
		}
		else
		{
		System.out.println("It's not found!");	
		}		
	}
	



}

