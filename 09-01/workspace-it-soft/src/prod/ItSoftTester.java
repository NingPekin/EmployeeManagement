package prod;
import bus.*;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ItSoftTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SINComparator sinComparator=new SINComparator();
		Sequence sequence=new Sequence();
		sequence.setCount(100);
		FullTime f1=new FullTime(sequence.getCount(),"Ning","Wei",19932314,"214@gmail.com","832 rue ree",1521532,EnumType.Type.fullTime,EnumType.Performance.excellent,58732,EnumType.FullTimePosition.analystProgrammer);
		FullTime f2=new FullTime(sequence.getCount(),"Chen","Li",19980312,"341@sohu.com","344 rue ali",132,EnumType.Type.fullTime,EnumType.Performance.fair,35672,EnumType.FullTimePosition.secretary);
		PartTime p1=new PartTime(sequence.getCount(),"Mary","Brown",19932144,"124124@gmail.com","1234 st marc",143521,EnumType.Type.partTime,EnumType.Performance.fair,88,20,4,EnumType.PartTimePosition.traineeStudent);
		PartTime p2=new PartTime(sequence.getCount(),"Jack","Ma",19932088,"9923@qq.com","1234 lincolin",5213,EnumType.Type.partTime,EnumType.Performance.excellent,60,40,12,EnumType.PartTimePosition.trainerConsultants);
		
		
		//ADD emp to datacollection
		DataCollection.AddEmployee(f1);
		DataCollection.AddEmployee(f2);
		DataCollection.AddEmployee(p1);
		DataCollection.AddEmployee(p2);
		
		//print
		for(Employee aEmployee:DataCollection.getArrayEmployee())
		{
			System.out.println(aEmployee);
		}
		
//		//search for emp by sin
		System.out.println("search for emp by sin");
		System.out.println("==========================");
		
		System.out.println("Enter the SIN you want to search:");
		Scanner scann=new Scanner(System.in);
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
		System.out.println(p);
		}

		}while(isFound==false);
		
		
		//sort by sin
		System.out.println("Sort by SIN!");
		System.out.println("==========================");
		Collections.sort(DataCollection.getArrayEmployee(),sinComparator);
		//print
		for(Employee aEmployee:DataCollection.getArrayEmployee())
		{
			System.out.println(aEmployee);
		}
		
		//remove 
		System.out.println("Remove");
		System.out.println("==========================");
		
		System.out.println("Enter the SIN of emp you want to remove:");
		searchedInfo=scann.nextInt();
		emp=DataCollection.Search(searchedInfo);
		if(emp!=null)
		{	
		DataCollection.RemoveEmployee(emp);
		//print output
		for(Employee aEmployee:DataCollection.getArrayEmployee())
		{
			System.out.println(aEmployee);
		}
		
		}
		else
		{
		System.out.println("It's not found!");	
		}
		
		
	}

}
