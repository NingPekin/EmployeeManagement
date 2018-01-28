package bus;
import java.util.regex.Pattern;

public class Validation 
{
	//Validate Alphabet Letters
		public static void validName(String string) throws MyException
		{
			if(!(Pattern.matches("^[A-Za-z]+$", string)))
			{throw new MyException("Please enter only alphabet letter");}
		}

	//Validate SSN
		public static void validSIN(String sin) throws MyException{
			//9-digit
			if(!(Pattern.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]", sin)))
			throw new MyException("Please enter SIN as 9 digit number");}
	
	//Validate Positive numbers
		public static void negativeNumberException(int num)throws MyException{
			if(num < 0){
				     throw new MyException("Please enter a positive number");  }		
		 }	
	//Validate range
		public static void betweenZeroAndNine(int num)throws MyException {		
			if (num < 0 || num > 9){throw new MyException("Please enter a number between 0 and 9");}
		}	
		
	//Validate email
		public static void validEmail(String email) throws MyException
		{
			if(!(Pattern.matches("^.+@.+\\.+.+$",email)))
			{
				throw new MyException("Please enter an email address in a correct format(abc@abc.com)");
				
			}
		}
		//Validate Positive Salary
		public static void negativeDoubleNumberException(double num)throws MyException{
			if(num < 0){
				     throw new MyException("Please enter a positive number");  }		
		 }	
}
