package bus;
import java.util.Comparator;

public class SINComparator implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		if(Integer.toString(e1.getSin()).compareTo(Integer.toString(e2.getSin()))<0)
		{
			return -1;
		}
		else if (Integer.toString(e1.getSin()).compareTo(Integer.toString(e2.getSin()))>0)
		{
			return +1;
			
		}
		return 0;
		
	}

}
