package bus;

public class PartTime extends Employee implements Ipayment 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2399756139931771851L;
	private double workHours;
	private double hourlyRate;
	private double duratonContract;
	private EnumType.PartTimePosition partTimePosition;
	public double getWorkHours() {
		return workHours;
	}
	public void setWorkHours(double workHours) throws MyException {
		Validation.negativeDoubleNumberException(workHours);
		this.workHours = workHours;
	}
	public double getHourlyRate() {

		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) throws MyException {
		Validation.negativeDoubleNumberException(hourlyRate);
		this.hourlyRate = hourlyRate;
	}
	public double getDuratonContract() {
		return duratonContract;
	}
	public void setDuratonContract(double duratonContract) {
		this.duratonContract = duratonContract;
	}
	public EnumType.PartTimePosition getPartTimePosition() {
		return partTimePosition;
	}
	public void setPartTimePosition(EnumType.PartTimePosition partTimePosition) {
		this.partTimePosition = partTimePosition;
	}
	public PartTime(int id, String fn, String ln, int sin, String email,
			String address, int telephone,EnumType.Type type,EnumType.Performance performance,double workHours, double hourlyRate, double duratonContract,EnumType.PartTimePosition partTimePosition) {
		super(id, fn, ln, sin, email, address, telephone,type,performance);
		this.workHours = workHours;
		this.hourlyRate = hourlyRate;
		this.duratonContract = duratonContract;
		this.partTimePosition=partTimePosition;
	}
	public PartTime() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PartTime [workHours=" + workHours + ", hourlyRate="
				+ hourlyRate + ", duratonContract=" + duratonContract
				+ ", partTimePosition=" + partTimePosition + ", getId()="
				+ getId() + ", getFn()=" + getFn() + ", getLn()=" + getLn()
				+ ", getSin()=" + getSin() + ", getEmail()=" + getEmail()
				+ ", getAddress()=" + getAddress() + ", getTelephone()="
				+ getTelephone() + ", getType()=" + getType()
				+ ", getPerformance()=" + getPerformance() + "]";
	}
	public double Payment()
	{
		return this.getHourlyRate()*this.getHourlyRate();
	}
	public double Bonus()
	{
		double bonus = 0;
		if(getPerformance()==EnumType.Performance.excellent)
		{
			bonus=Payment()*0.015;
		}
		if(getPerformance()==EnumType.Performance.good)
		{
			bonus=Payment()*0.01;
		}
		
		return Math.round(bonus * 100) / 100;
	}
	
	
}
