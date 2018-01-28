package bus;
import java.util.ArrayList;

public class DataCollection
{
	private static ArrayList<Employee> arrayEmployee=new ArrayList<Employee>();	
	public static ArrayList<Employee> getArrayEmployee() {
		return arrayEmployee;
	}
	
	public static void setArrayEmployee(ArrayList<Employee> arrayEmployee) {
		DataCollection.arrayEmployee = arrayEmployee;
		}
	
	public static void AddEmployee(Employee e)
	{
		arrayEmployee.add(e);
		
	}
	public static void RemoveEmployee(Employee e)
	{
		arrayEmployee.remove(e);	
	}

	public static Employee Search(int sin)
	{
		for(Employee e : getArrayEmployee())
		{
			if(e.getSin()==sin)
			{
				return e;	
			}

		}
			return null;
	
	}
		
	public static void ModifyContract(PartTime p,int c)
	{
		p.setDuratonContract(c);
			
	}
	
	
	
}
