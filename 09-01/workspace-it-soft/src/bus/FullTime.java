package bus;

public class FullTime extends Employee implements Ipayment
{
/**
	 * 
	 */
	private static final long serialVersionUID = -1017818096860739342L;
private double annualSalary;
private EnumType.FullTimePosition position;

public double getAnnualSalary() {
	return annualSalary;
}
public void setAnnualSalary(double annualSalary) throws MyException {
	Validation.negativeDoubleNumberException(annualSalary);
	this.annualSalary = annualSalary;
}
public EnumType.FullTimePosition getPosition() {
	return position;
}
public void setPosition(EnumType.FullTimePosition position) {
	this.position = position;
}

public FullTime(int id, String fn, String ln, int sin, String email,
		String address, int telephone,EnumType.Type type,EnumType.Performance performance,double annualSalary, EnumType.FullTimePosition position ){
	super(id, fn, ln, sin, email, address, telephone,type,performance);
	// TODO Auto-generated constructor stub
	this.annualSalary = annualSalary;
	this.setPosition(position);
}

public FullTime() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "FullTime [annualSalary=" + annualSalary + ", position=" + position
			+ ", getId()=" + getId() + ", getFn()=" + getFn() + ", getLn()="
			+ getLn() + ", getSin()=" + getSin() + ", getEmail()=" + getEmail()
			+ ", getAddress()=" + getAddress() + ", getTelephone()="
			+ getTelephone() + ", getType()=" + getType()
			+ ", getPerformance()=" + getPerformance() + "]";
}
public double Payment()
{
	return this.getAnnualSalary();
	
}
public double Bonus()
{
	double bonus = 0;
	if(getPerformance()==EnumType.Performance.excellent)
	{
		bonus=this.getAnnualSalary()*0.015;
	}
	if(getPerformance()==EnumType.Performance.good)
	{
		bonus=this.getAnnualSalary()*0.01;
	}
	
	return Math.round(bonus * 100) / 100;
}
	
}
